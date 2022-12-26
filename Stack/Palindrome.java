// check that given linkedlist is palindrome or not

package Stack;
import java.util.* ;

public class Palindrome {
    static class Node{
        int data ;
        Node next ;
        

        public Node(int data){
            this.data = data     ;
            this.next = null ;
        }
    }

    public static Node head ;
    public static Node tail ;

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(24);
        Node seven = new Node(1);
    
        one.next = two ;
        two.next = three ;
        three.next = four ;
        four.next = five ;
        five.next = six ;
        six.next = seven ;

        System.out.println(palindrome(one));

    }

    public static boolean palindrome(Node head){

        Stack<Integer> s = new Stack<>();
        Node ptr = head ;
        boolean isPalin = true ;
        
         // push the data into stack for check the data to linkedlist
        while (ptr != null) {
            s.push(ptr.data);
            ptr = ptr.next ; 
        }

        while (head != null) {
            int i = s.pop() ;

            if(i == head.data){
                isPalin =  true ; // if eqaul then true
            }
            else{
                isPalin = false ; // one momnent condition false then false
                break ;
            }

            head = head.next ;
        }
        return isPalin ;
    }
}
