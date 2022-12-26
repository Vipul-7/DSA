package BST;
import java.util.ArrayList;

public class Merge_2_BST {
    static class Node{
        int data ;
        Node left ;
        Node right ;

        public Node(int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        
    }

    public static Node merge(Node root,Node root2){
        ArrayList<Integer> r1 = new ArrayList<>();
        getinorder(r1, root);
        ArrayList<Integer> r2 = new ArrayList<>();
        getinorder(r2, root2);
        
        ArrayList<Integer> merged = new ArrayList<>();
        
        int i = 0 , j = 0 ;
        while (i < r1.size() && j < r2.size()) {
            if(r1.get(i) <= r2.get(j)){
                merged.add(r1.get(i));
                i++ ;
            }
            else{
                merged.add(r2.get(j));
                j++ ;
            }
        }
        while (i < r1.size()) {
            merged.add(r1.get(i));
            i++ ;
        }
        while (j < r2.size()) {
            merged.add(r2.get(j));
            j++ ;
        }

        Node main = arrTo_BST(merged, 0, merged.size()-1);
        return main ;
    }

    public static void getinorder(ArrayList<Integer> vi,Node root){
        if(root == null)
        return;

        getinorder(vi, root.left);
        vi.add(root.data);
        getinorder(vi, root.right);
    }

    public static Node arrTo_BST(ArrayList<Integer> list,int si,int ei) {
        if(si > ei)
        return null ;

        int mid = (si+ei)/2 ;

        Node root = new Node(list.get(mid));
        root.left = arrTo_BST(list, si, mid-1);
        root.right = arrTo_BST(list, mid+1, ei);
        return root ;
    }
}
