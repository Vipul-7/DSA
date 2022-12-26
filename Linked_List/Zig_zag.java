package Linked_List;

import java.util.LinkedList;

public class Zig_zag {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        LinkedList lv = new LinkedList();
        ll.addFirst(6);
        ll.addLast(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        
        
    }

    public static  void zigzag() {
        // Step 1 - find mid node
        Node mid = getMid();

        // Step 2 - 2nd half reverse

        Node prev = null;
        Node curr = mid.next;
        mid.next = null; ///
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

        // Step 3 - alternate merging

        Node LH = head;
        Node RH = prev;

        Node nextL, nextR;

        while (LH != null && RH != null) {
            // for converting to zigzag
            nextL = LH.next;
            LH.next = RH;
            nextR = RH.next;
            RH.next = nextL;

            // update and LH and RH
            LH = nextL;
            RH = nextR;
        }
    }

    public static Node getMid() {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }



    // for printing
    public static void print() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

}
