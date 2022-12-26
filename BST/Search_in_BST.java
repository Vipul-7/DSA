package BST;

public class Search_in_BST {
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

        System.out.println(SearchKey(root, 15));
    }

    // time complexity --> O(h){means O(logn)} -height -- > skewed tree worst case time complexity O(h)=O(n) 
    public static boolean SearchKey(Node root,int key){
        if(root == null)
        return false ;

        if(root.data == key)
        return true;

        if(root.data > key)
        return SearchKey(root.left, key);

        else
        return SearchKey(root.right, key);

    }
}
