package Linked_List;

public class Delete_N_Nodes {
    static class Node {
        int data;
        Node next;
    }

    public static Node head;
    public static Node tail;

    static Node push( Node head_ref, int new_data){
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head_ref;
        head_ref = new_node;
        return head_ref;
    }

    public static void print(Node head) {
        if (head == null) {
            System.out.println("linked list is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Delete_N_Nodes ll = new Delete_N_Nodes();

        head = null ;
        head = push(head, 10);
        head = push(head, 9);
        head = push(head, 8);
        head = push(head, 7);
        head = push(head, 6);
        head = push(head, 5);
        head = push(head, 4);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);

        print(head);

        
        // Node head = ll.new Node(1);
        // Node newNode = ll.new Node(2);
        // head.next = newNode;

        // newNode = ll.new Node(3);
        // head.next.next = newNode;

        // newNode = ll.new Node(4);
        // head.next.next.next = newNode;

        // head.next.next.next.next = null;
        delete(3, 2);
        print(head);
        
    }

    public static void delete(int m, int n) {
        Node curr = head ;
        Node t ;
        int count ;

        while (curr != null) {
            for(count=0 ; count < m && curr != null ; count++){
                curr = curr.next ;
            }
            if(curr == null){
                return ;
            }
            t= curr.next ;
            for (int i = 1; i <= n && t != null; i++) {
                Node temp = t ;
                t = t.next ;
            }
            curr.next = t ;
            curr =t ;
        }

    }
}
