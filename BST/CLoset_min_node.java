// exercise - find closet minimum node
// error

package BST;

public class CLoset_min_node {
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
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(11);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.left = new Node(20);

        System.out.println(min_main(root, 19));
        
    }


    public static int min_main(Node root,int k) {
        min_diff = Integer.MAX_VALUE ;
        min_diff_key = -1 ;

        clo_min_key(root, k);
        return min_diff_key ;
    }


    static int min_diff, min_diff_key ;

    public static void clo_min_key(Node root,int k) {
        if (root == null)
            return;

        if(root.data == k){
        min_diff_key = k ;
        return ;
        }

        if(min_diff > Math.abs(root.data - k)){
            min_diff = Math.abs(root.data - k);
            min_diff_key = root.data ;
        }

        if(k < root.data)
        clo_min_key(root.left, k);
        else
        clo_min_key(root.right, k);
    }
    
}
