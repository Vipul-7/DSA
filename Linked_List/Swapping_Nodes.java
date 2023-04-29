package Linked_List;


public class Swapping_Nodes {
    public class Node{
        int data;
        Node next ;
        public Node(int data){
            this.data = data ;
            this.next = null ;
        }
    }
    public void print() {
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

    public static Node head ;
    public static void main(String[] args) {
        Swapping_Nodes ll = new Swapping_Nodes();
        head = ll.new Node(1);
        Node newNode = ll.new Node(2);
        head.next = newNode ;

        newNode = ll.new Node(3);
        head.next.next = newNode ;

        newNode = ll.new Node(4);
        head.next.next.next = newNode;

        System.out.print("Before -- ");
        ll.print();
        System.out.print("After --");
        ll.swap(2,4);
        ll.print();

    }

    public void swap(int key1,int key2){
        if(key1 == key2)
        return ;

        Node currX = head ; Node prevX = null;
        while (currX != null && currX.data != key1) {
            prevX = currX ;
            currX = currX.next ;
        }

        Node currY = head ; Node prevY = null;
        while (currY != null && currY.data != key2) {
            prevY = currY ;
            currY = currY.next ;
        }

        if(currX == null || currY == null){
            return ;
        }

        if(prevX != null)
        prevX.next = currY ;
        else
        head = currY ;

        if(prevY != null)
        prevY.next = currX ;
        else
        head = currX ;

        Node temp = currX.next ;
        currX.next = currY.next ;
        currY.next = temp ;
    }
    
    // leetcode 24 - recursion - swap nodes in pairs
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode new_head = head.next;
        ListNode temp = head.next.next;
        
        new_head.next = head;
        head.next = swapPairs(temp);
        return new_head;
    }
    
    // leetcode - 24 - iterative -swap nodes  in pairs
    
}
