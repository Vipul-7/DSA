package Linked_List;


public class MergeSort_on_LL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList() ; 
        ll.addFirst(58);
        ll.addFirst(89);
        ll.addFirst(34);
        ll.addFirst(45);
        ll.print();
        ll.head = ll.Merge_Sort(ll.head);
        ll.print();

    }

    public static Node head;

    public static Node Merge_Sort(Node head) {

        // base case
        if(head == null || head.next == null){
            return head ;
        }

        // step 1 - find mid
        Node mid = getMid();
        

        // Step 2 - divide into two linked list
        Node rh = mid.next ; // right half
        mid.next = null ;
        Node head1 = Merge_Sort(head);
        Node head2 = Merge_Sort(rh);

    
        // Step 3 - Merge 
        return Merge(head1 , head2) ;
    }


    // for finding the mid
    public static Node getMid(){
        Node slow = head ;
        Node fast = head.next ;

        while (fast != null && fast.next != null) {
            slow = slow.next ;
            fast = fast.next.next ;
        }
        return slow ;
    }


    // for merge the linked llists
    public static Node Merge(Node head1, Node head2){
        Node MergeLL = new Node(-1);
        Node temp = MergeLL ;

        while (head1 != null && head2 != null) {
            if(head1.data <= head2.data){
                temp.next = head1 ;
                head1 = head1.next ;
                temp = temp.next ;
            }
            else{
            temp.next = head2 ;
            head2 = head2.next ;
            temp = temp.next ;
            }
            
        }

        while(head1 != null){
            temp.next = head1 ;
            head1 = head1.next ;
            temp = temp.next ;
        }

        while (head2 != null) {
            temp.next = head2 ;
            head2 = head2.next ;
            temp = temp.next ;
        }


        return MergeLL.next ; // merge ll next beacuse first one is -1
    }



    // for printing
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
}


