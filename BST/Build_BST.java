package BST;


public class Build_BST {
    static class Node{
        int data ;
        Node left ;
        Node right ;

        public Node(int data){
            this.data = data ;
        }
    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null ;

        for (int i = 0; i < values.length; i++) {
            root = insertInBST(root, values[i]);
            // System.out.println(root);
        }
        inorder(root);

        // print kth range problem
        System.out.println();
        Print_kth_range(root, 5, 7);
    }

    // inorder for printing the our new tree
    public static void inorder(Node root){
        if(root == null)
        return ;

        inorder(root.left); 
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
    public static Node insertInBST(Node root,int val){
        if(root == null){ // insert first
            root = new Node(val);
            return root ;
        }

        if(val < root.data)
            root.left = insertInBST(root.left, val); // update the root with root.left  after evrry insert
        
        else
        root.right = insertInBST(root.right, val);

        return root ;

    }

    // new problem --> print kth range 
    public static void Print_kth_range(Node root,int k1,int k2){
        if(root == null)
        return;

        if(root.data >= k1 && root.data <= k2 ){
            Print_kth_range(root.left, k1, k2);
            System.out.print(root.data+" ");
            Print_kth_range(root.right, k1, k2);
        }
        else if(root.data < k1)
        Print_kth_range(root.right, k1, k2);
        else 
        Print_kth_range(root.left, k1, k2);
    }

}
