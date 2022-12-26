package Linked_List;

public class Even_then_Odd {
    public class Node{
        int data;
        Node next ;
        public Node(int data){
            this.data = data ;
            this.next = null ;
        }
    }
    public static Node head ;
    public void print() {
        if (head == null) {
            System.out.println("linked list is empty");
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        
    }

    public void EvenOdd(){
        Node curr =head ;
        Node end = head ;
        Node prev = null ;
        while (end.next != null) {
            end = end.next ;
        }

        Node new_end = end ;
        while(curr.data % 2 !=0 && curr != null){
            new_end.next = curr ;
            curr = curr.next ;
            new_end.next.next = null ;
            new_end = new_end.next ;
        }

        if (curr.data %2 ==0){
            head = curr;
            while (curr != end){
                if (curr.data % 2 == 0){
                    prev = curr;
                    curr = curr.next;
                }
                else{
                    prev.next = curr.next;
                    curr.next = null;
                    new_end.next = curr;
                    new_end = curr ;
                    curr = prev.next ;
                }
            }
        }
        else
        prev = curr ;

        if(new_end != end && end.data%2 != 0){
            prev.next = end.next ;
            end.next = null ;
            new_end.next = null ;
        }
    }
}
