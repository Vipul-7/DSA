package Binary_Trees;

import java.util.ArrayList;

public class Lowest_common_Ancestor {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
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

        
        System.out.println(LCA(root, 4, 7).data);
        System.out.println(LCA2(root, 4, 5).data);
    }
    

    public static Node  LCA(Node root,int n1,int n2){ // O(n)
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        // for creating path array named
        getPath(root,n1,path1);
        getPath(root,n2,path2);

        int i = 0 ;
        for (; i < path1.size() && i < path2.size(); i++) {
            if(path1.get(i) != path2.get(i))  // jaha par unequal ho jaye waha break kardo
            break ;
        }

        Node lca = path1.get(i-1); // use pivhle vala lowest common hoga

        return lca ;
    }

    public static boolean getPath(Node root,int n,ArrayList<Node> path){ 
        if(root == null)
        return false ;

        path.add(root) ; // first add the root

        if(root.data == n) // if matched then return true and return path that contain only 1 element
        return true ;

        boolean left = getPath(root.left, n, path); 
        boolean right = getPath(root.right, n, path) ;
          
        if(left || right) // left or right me se koi ek me mil jaye to announce kardo ke mil gaya and return path array
        return true ;

        path.remove(path.size()-1) ; // agar na mile to jo add kiya tha usko remove kardo  and return false

        return false ;
    }


    // approach 2 
    public static Node LCA2(Node root,int n1 , int n2){
        if(root == null)
        return root ;

        if(root.data == n1 || root.data == n2)
        return root ;

        Node left = LCA2(root.left, n1, n2) ;
        Node right =LCA2(root.right, n1, n2);

        if(left == null) // left null mil gaya to ab hamare n1,n2 left me hoge hi nahi 
        return right ;

        if(right == null)
        return left ;

        return root ;
    }
}
