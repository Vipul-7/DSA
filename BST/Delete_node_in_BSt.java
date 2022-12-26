package BST;

public class Delete_node_in_BSt {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insertInBST(root, values[i]);
        }
        inorder(root);

        root = Delete_node(root, 1);
        System.out.println();
        inorder(root);
    }

    // for the bulding the BST
    public static Node insertInBST(Node root, int val) {
        // base case
        if (root == null) { // insert first
            root = new Node(val);
            return root;
        }

        if (val < root.data)
            root.left = insertInBST(root.left, val); // update the root with root.left after evrry insert

        else
            root.right = insertInBST(root.right, val);

        return root;

    }

    // for print the BST
    public static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // main for this problem
    public static Node Delete_node(Node root,int val){
        if(root == null)
        return root ;

        if(root.data < val)
            root.right = Delete_node(root.right, val)  ;
 
        else if(root.data > val)
        root.left = Delete_node(root.left, val);

        else{
        // case 1 - leaf node
        if(root.left == null && root.right == null)
        return null ;

        // case 2 - one child
        if(root.left == null)
           return root.right ;

        else if(root.right == null)
            return root.left ;

        // case 3 - two child
        Node IS = InorderSuccessor(root.right) ;
        root.data = IS.data ;
        root.right = Delete_node(root.right, IS.data);
        }

        return root ;
    }

    public static Node InorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}
