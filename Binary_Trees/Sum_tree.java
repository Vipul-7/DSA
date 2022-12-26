// transform given tree to sum tree

package Binary_Trees;


public class Sum_tree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        st(root);

        preorder(root);
    }

    public static int st(Node root){
        if(root == null)
        return 0 ;

        int leftchild = st(root.left) ;
        int rightchild = st(root.right);

        int data = root.data ; // current node data

        int newLeft = root.left == null ? 0 : root.left.data ;
        int newright = root.right == null ? 0 : root.right.data ; 

        root.data = leftchild + newLeft + rightchild + newright ;

        return data ;
    }

    public static void preorder(Node root){
        if(root == null)
        return ;

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
}
