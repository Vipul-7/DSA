package Linked_List;

import java.util.*;

public class LFU_cache {
    Map<Integer, Node> nodeMap = new HashMap<>();
    Map<Integer, DoublyLinkedList> freqMap = new HashMap<>();
    int capacity, minFreq;
    // minFreq tell us that what is curr minimum frequency in frequency map

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;
        this.nodeMap = new HashMap<>();
        this.freqMap = new HashMap<>();
    }

    public int get(int key) {
        if (!nodeMap.containsKey(key)) {
            return -1;
        }

        Node node = nodeMap.get(key);
        update(node);

        return node.val;
    }

    public void put(int key, int value) {
        if (nodeMap.containsKey(key)) {
            Node currNode = nodeMap.get(key);
            currNode.val = value;
            update(currNode);
        } else {
            if (nodeMap.size() == capacity) {
                DoublyLinkedList minFreqList = freqMap.get(minFreq);
                nodeMap.remove(minFreqList.tail.prev.key);
                minFreqList.remove(minFreqList.tail.prev);
            }
            minFreq = 1;
            Node newNode = new Node(key, value);

            DoublyLinkedList currList = freqMap.getOrDefault(1, new DoublyLinkedList());
            currList.insert(newNode);
            freqMap.put(1, currList);
            nodeMap.put(key, newNode);
        }
    }

    public void update(Node currNode) {
        DoublyLinkedList dl = freqMap.get(currNode.freq);
        dl.remove(currNode);

        if (currNode.freq == minFreq && dl.listSize == 0) {
            minFreq++;
        }

        currNode.freq++;
        DoublyLinkedList newList = freqMap.getOrDefault(currNode.freq, new DoublyLinkedList());
        newList.insert(currNode);
        freqMap.put(currNode.freq, newList);
    }

    class Node {
        int key, val, freq;
        Node next, prev;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.freq = 1;
        }
    }

    class DoublyLinkedList {
        int listSize;
        Node head;
        Node tail;

        DoublyLinkedList() {
            this.listSize = 0;
            this.head = new Node(-1, -1);
            this.tail = new Node(-1, -1);
            head.next = tail;
            tail.prev = head;
        }

        public void insert(Node node) {
            node.next = head.next;
            node.prev = head;
            head.next = node;
            node.next.prev = node;
            listSize++;
        }

        public void remove(Node node) {
            node.next.prev = node.prev;
            node.prev.next = node.next;
            listSize--;
        }
    }
}
