package Stack;

public class Stack_using_LinkedList {
    static class Node{
        int data;
        Node next ;
        public Node(int data){
            this.data  = data;
            this.next = null ;
        }
    }
    static Node head ;

    // we can do this also using java collection framework
    public static class Stack_LL{
        
        // isEmpty
        public boolean isEmpty(){
            return head == null ;
        }

        // PUSH operation
        public void PUSH(int data){
            Node newNode = new Node(data);

            newNode.next = head ;
            head = newNode ;
        }

        // POP operation
        public int POP(){
            if(isEmpty())
            return -1 ;

            int top = head.data ;
            head = head.next ;
            return top ;
        }

        // PEEK operation
        public int PEEK(){
            if(isEmpty())
            return -1 ;

            return head.data ;
        }
    }

    public static void main(String[] args) {

        // we can do this also using java collection framework
        // Stack<Integer> s = new Stack<>();
        Stack_LL ll = new Stack_LL();
        ll.PUSH(3);
        ll.PUSH(2);
        ll.PUSH(1);

        while (!ll.isEmpty()) {
            System.out.print(ll.PEEK()+" ");
            ll.POP();
        }

        System.out.println(ll.PEEK());
    }
}
