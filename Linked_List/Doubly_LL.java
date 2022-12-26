package Linked_List;


public class Doubly_LL {
    public class Node{
        int data;
        Node next;
        Node prev ;
        public Node(int data){
            this.data = data;
            this.next = null; 
            this.prev = null ;
        }
    }

    public static Node head ;
    public static Node tail ;
    public static int size;

    // to add the node in doubly linkedlist
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode ;
            return ;
        }

        newNode.next = head ;
        head.prev = newNode ;
        head = newNode ;
    }

    // to remove the node from doubly linked list
    public int removeFirst(){
        if(head == null){
            System.out.println("Already did not have any node");
            return Integer.MIN_VALUE;
        }

        if(size == 1){
            int val = head.data ;
            head = tail = null ;
            size -- ;
            return val ;
        }
        int val = head.data ;
        head = head.next ;
        head.prev = null ;
        size -- ;
        return val;
    }

    // to reverse the doubly linkedlist
    public void reverse_Dl(){
        Node curr = head ;
        Node prev = null ;
        Node next ;

        while(curr != null){
            next = curr.next ;
            curr.next = prev ;
            curr.prev = next ;

            prev = curr ;
            curr = next ;

        }
        head = prev ;
    }

    // to print the doubly linked list
    public void print(){
        Node temp = head ;
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.next ;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        Doubly_LL dl = new Doubly_LL();
        dl.addFirst(3);
        dl.addFirst(2);
        dl.addFirst(1);
 
        dl.reverse_Dl();
        dl.removeFirst() ;
        dl.print();
        System.out.println(dl.size);
    }
}

