package Linked_List;

public class LinkedList_2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static boolean detect_cycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void Remove_cycle() {
        Node slow = head;
        Node fast = head;

        boolean isExist = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                isExist = true;
                break;
            }
        }

        if (isExist == false) {
            return;
        }
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;

    }

    public void print() {
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

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next  = temp ;
        head.next.next = new Node(3);
        
        head.next.next.next = temp;

        System.out.println(detect_cycle());
        Remove_cycle();

        System.out.println(detect_cycle());

    }
}
