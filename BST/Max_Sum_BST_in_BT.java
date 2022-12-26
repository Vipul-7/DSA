// leetcode 1373 
// exercise 5 

package BST;

public class Max_Sum_BST_in_BT {
    

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
        Node root  = new Node(4);
        root.left = new Node(3);
        root.left.left = new Node(1);
        root.left.right = new Node(2);
        // Node root= new Node(5);
        // root.left = new Node(9);
        // root.right = new Node(2);
        // root.left.left = new Node(6);
        // root.right.right = new Node(3);
        // root.left.left.left = new Node(8);
        // root.left.left.right = new Node(7);

        System.out.println(maxSumBST(root) );
    }

    static class my{
        int min,max,sum ;
        public my(int min,int max,int sum){
            this.min = min ;
            this.max = max;
            this.sum = sum ;
        }
    }

    private static int maxSum = 0 ;
    public static int maxSumBST(Node root){
        postorder(root);
        return maxSum ;
    }

    public static my postorder(Node root){
        if(root == null)
        return new my(Integer.MAX_VALUE,Integer.MIN_VALUE,0);

        my left = postorder(root.left);
        my right = postorder(root.right);

        if(!(left != null && right != null && root.data > left.max && root.data < right.min)){
            return null ;
        }

        int sum = root.data + left.sum + right.sum ;

        maxSum = Math.max(maxSum, sum);

        int min = Math.min(root.data, left.min) ;
        int max = Math.max(root.data, right.max);

        return new my(min, max, sum) ;
    }
}
