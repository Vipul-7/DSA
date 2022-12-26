package BST;

public class BST_validate {
    static class Node{
        int data ;
        Node left ;
        Node right ;

        public Node(int data){
            this.data = data ;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

        if(Valid_BST(root, null, null))
        System.out.println("Valid");
        else
        System.out.println("Invalid");
    }   
    
    public static boolean Valid_BST(Node root,Node min ,Node max ){
        if(root == null)
        return true ;

        if(min != null && root.data <= min.data)
        return false ;

        if(max != null && root.data >= max.data)
        return false ;

        return Valid_BST(root.left, null, root ) && Valid_BST(root.right, root, null) ;
    }
}
