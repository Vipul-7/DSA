// is the subtree is lie on the main tree or not ??

package Binary_Trees;

public class Subtree_or_not {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
        // tree 
        /* 
               1
            /     \
           2       3
          /  \      \
        4     5      6
                 
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);


       // sub tree
       Node subroot = new Node(2);
       subroot.left = new Node(4);
       subroot.right = new Node(9);

       System.out.println(isSubtre(root, subroot));
    }

    public static boolean isSubtre(Node root,Node subroot){
        if(root == null)
        return false ;

        if(root.data == subroot.data){
            if(isIndentical(root,subroot)){
                return true ;
            }
        }

        return isSubtre(root.left, subroot) || isSubtre(root.right, subroot) ;
    }

    public static boolean isIndentical(Node root, Node subroot){
        if(root == null && subroot == null)
        return true ;
        
        else if(root  == null || subroot  == null || root.data != subroot.data)
        return false ;

        if(!isIndentical(root.left, subroot.left))
        return false ;
        if(!isIndentical(root.right, subroot.right))
        return false ;

        return true ;
    }
}
