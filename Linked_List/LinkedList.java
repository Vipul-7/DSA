package Linked_List;


public class LinkedList {

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

    // for finding value of size of linked list
    public static int size; // java will be considere size value 0 by default



    public void addFirst(int data) {
        // step 1 - create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 - new node next = head
        newNode.next = head;

        // step 3 - head = newNode
        head = newNode;

    }



    public void addLast(int data) {
        // step 1 -create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 - tail's next is new node
        tail.next = newNode;

        // step 3 - make tail is new node
        tail = newNode;
    }



    public void addMiddle(int idx, int data) {

        if (idx == 0) { // if index valur is zero then add node in head
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

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


    public int removeFirst() {

        // size of linked list is o  
        if (head == null) {     // or we can write size = 0
            System.out.println("Linked List is already empty."); 
            return Integer.MIN_VALUE;
        }


        // size of linked list is 1
        else if (head == tail) {  // or we can write size = 1 
            int val = head.data;
            head = tail = null;

            size = 0;

            return val;
        }

        int val = head.data;
        head = head.next;
        size-- ;
        return val;
    }


    public int removeLast(){
        if(head == null){
            System.out.println("Linked List is already empty."); 
            return Integer.MIN_VALUE;
        }
        else if(head == tail){
            int val = head.data; // or tail.data    both are same for size = 1 
            head = tail = null ;
            return val ;
        }
         
        // previous means size-2 ----  size -1 is is tail
        Node pre = head ;

        // for finding previous
        for (int i = 0; i < size-2; i++) {
            pre = pre.next ;
        }

        int val = pre.next.data ; // or we can write tail.data
        pre.next = null ;
        size -- ;
        tail = pre ;
        return val ;

    }

    


    public int searchKey_Iterative(int key){
        
        Node temp = head ;
        int i = 0;
        while (temp != null) {

            if(temp.data == key){
               return i ;
            }
            temp =temp.next ;
            i++;
        }
        return -1;
    }


    public int recSearch(Node head,int key){
        if(head == null){
            return -1 ;
        }

        if(head.data == key){
            return 0 ;
        }

        int index = recSearch(head.next, key) ;
        if(index == -1){
            return -1 ;
        }

        return index+1 ;
    }


    public void reverse_LL() {
        Node prev = null ;
        Node curr = tail = head ; 
        Node next ;

        while (curr != null) {
            next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }
        head = prev ;
    }


    public void Remove_Nth_Node_from_end(int n){
        int size = 0;
        Node temp = head ;
        while (temp != null) {
            temp = temp.next ;
            size++;
        }


        if(n == size){
            head = head.next ;
            return ;
        }

        Node pre = head ;

        // loop from head to size-n tak means nth node se just pehle vale tak
        int i = 1;
        while(i < size-n){  
            pre = pre.next ;
            i++;
        }
        pre.next = pre.next.next ;
    }


    // slow-fast approach for finding mid value of link list
    // turtle and hare approach
    public Node findMid(Node head){
        Node slow = head ;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next ;
            fast = fast.next ;
        }

        return slow ;
    }

    public boolean palindrome(){
        if(head == null || head.next == null){
            return true ;
        }

        // step 1 - find mid
        Node midNode = findMid(head);

        // step 2 - make 2nd half reverse
        // remmber for reverse 3 variable & 4 step

        Node pre = null ;
        Node curr = midNode ;
        Node next ;

        while (curr != null) {
            next = curr.next ;
            curr.next = pre ;
            pre = curr ;
            curr = next ;
        }

        // step 3 - check 1st and 2nd half

        // find left half and right half node
        Node left = head ;
        Node right = midNode ;

        while (right != null) {
            if(left.data != right.data){
                return false ;
            }
            left = left.next ;
            right = right.next ;
        }
        return true ;
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(3);
        // ll.print();
        ll.addFirst(2);
        // ll.print();
        ll.addFirst(1);
        // ll.print();
        
        // ll.print();
        ll.addLast(4);
        ll.addLast(5);

        ll.addMiddle(2, 10);


        ll.removeFirst();
        // head = head.next ;

        ll.removeLast();

        
        ll.print();

        System.out.println("size of linked list is - "+ll.size);

        System.out.println("Your key at index - "+ll.searchKey_Iterative(3));


        System.out.println("Your key at - " +ll.recSearch(head,3));

        ll.reverse_LL();
        ll.print();

        ll.Remove_Nth_Node_from_end(2);
        ll.print();

        System.out.println(ll.palindrome());
        
       

    }



    public Node Merge_Sort(Node head2) {
        return null;
    }

}
