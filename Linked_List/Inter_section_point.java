package Linked_List;

public class Inter_section_point {
    public class Node{
        int data;
        Node next ;
        public Node(int data){
            this.data = data;
            this.next = null ;
        }
    }

    public static Node head ;
    public static Node tail ;

    public static void print(){
        if(head == null){
            System.out.println("linked list is empty");
            return ;
        }

        Node temp = head ;
        while(temp != null){
            temp = temp.next ;
        }
    }

    public Node Get_InterSection_Point(Node head1, Node head2){
        while (head2 != null) {
            Node temp = head1 ;
            while (temp != null) {
                if(temp == head2){
                    return head2 ;
                }
                temp = temp.next ;
            }
            head2 = head2.next ;
        }
        return null ;
    }

    public static void main(String[] args) {
        Inter_section_point first = new Inter_section_point();

        
        Node head1 = first.new Node(10);
        Node head2 = first.new Node(3) ;

        Node newNode = first.new Node(6);
        head2.next = newNode ;

        newNode = first.new Node(9);
        head2.next.next = newNode ;

        newNode =  first.new Node(15) ;
        head1.next = newNode ;
        head2.next.next.next = newNode;

        newNode = first.new Node(30);
        head1.next.next = newNode ;

        head1.next.next.next = null ;
        


        Node isp = first.Get_InterSection_Point(head1, head2) ;
        if(isp == null)
        System.out.println("No inter section point");

        else
        System.out.println("Inter Section point is "+isp.data);
    }
}
