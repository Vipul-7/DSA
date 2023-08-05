package Linked_List;

import java.util.*;

public class LRU_cache {
    Node head, tail;
    int capacity;
    Map<Integer, Node> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(0,0);
        tail = new Node(0,0);

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);
        delete(node);
        insert(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            delete(map.get(key));
        }

        if (map.size() == capacity) {
            delete(tail.prev);
        }

        insert(new Node(key, value));
    }

    // Double LinkedList Implementation
    class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public void delete(Node node) {
        map.remove(node.key);

        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void insert(Node node) {
        map.put(node.key, node);

        Node headsNext = head.next;
        head.next = node;
        node.prev = head;
        node.next = headsNext;
        headsNext.prev = node;
    }
}
