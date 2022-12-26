package BST;

public class Mirror_a_BST {
    static class Node{
        int data ;
        Node left ;
        Node right ;

        public Node(int data){
            this.data = data ;
        }
    }
    public static void main(String[] args) {
       /*
        *            5
                    /  \
                   3     7
                 /   \  /  \
                2     4 6   8
        */

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        // root.right.left = new Node(6);
        root.right.right = new Node(11);

        Mirror(root);
        inorder(root);

        System.out.println();

        root =Mirror2(root);
        inorder(root);
    }

    public static void inorder(Node root){
        if(root == null)
        return ;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    // MY APPROACH
    public static void Mirror(Node root){
        if(root == null)
        return  ;


        Node temp = root.left;
        root.left = root.right  ;
        root.right  = temp ;

        Mirror(root.left);
        Mirror(root.right);
    }

    // ALPHA
    public static Node Mirror2(Node root){
        if(root == null)
        return null;

        Node leftSubtree = Mirror2(root.left);
        Node rightSubtreee = Mirror2(root.right);

        root.left = rightSubtreee ;
        root.right = leftSubtree ;

        return root ;
    }
}
