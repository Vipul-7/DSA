// example --> delete leaves who has value 2

package Binary_Trees;

public class Delete_leaves_given_value {
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
        /*
         *       1                                 1
         *      /  \               ans -->       /   \
         *     2    3                           2     3
         *    / \   /  \                         \      \
         *   2   5  2   7                         5      7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.right.left = new Node(2);
        root.right.right = new Node(7);

        remove_leaves(root,2 );
        preorder(root);

    }

    public static Node remove_leaves(Node root,int val){
        if(root == null)
        return null;

        root.left = remove_leaves(root.left, val);
        root.right = remove_leaves(root.right, val);

        if(root.left == null && root.right == null && root.data == val)
        return null ;

        return root ;
    }

    public static void preorder(Node root){
        if(root == null)
        return ;

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
}
