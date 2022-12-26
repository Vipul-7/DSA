// given a sorted array make a balanced binary tree

package BST;

import java.util.ArrayList;

public class Make_balanced_BST {
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
        int arr[]={3,5,6,8,10,11,12};
        Node bachi =Make_BST(arr,0,arr.length-1 );

        // inorder(bachi);

        // new problem
        int unbt[] = {3,5,6,8,10,11,13};
        
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root =balance_BST(root);
        preorder(root);
    }

    

    public static void preorder(Node root){
        if(root == null)
        return;
       
        
        System.out.print(root.data+" ");
        preorder(root.left);
        
        preorder(root.right);

    }

    // make array to bst
    public static Node Make_BST(int arr[],int si,int ei){
        if(si > ei)
        return null ;

        // first find mid of given array
        int mid = (si + ei )/2 ;

        Node root = new Node(arr[mid]) ;
        root.left = Make_BST(arr, si, mid-1);
        root.right = Make_BST(arr, mid+1, ei);

        return root; 
    }

    // create unbalanced tree to balanced tree - O(n)
    public static Node balance_BST(Node root){
        ArrayList<Integer> inorder = new ArrayList<>();

        getinorder(root, inorder);
        root =balanced_tree(inorder, 0, inorder.size()-1);
        return root ;
    }

    public static Node balanced_tree(ArrayList<Integer> inorder,int si,int ei){
        if(si > ei)
        return null ;

        int mid = (si+ei)/2 ;
        Node root = new Node(inorder.get(mid)) ;
        root.left = balanced_tree(inorder, si, mid-1);
        root.right  = balanced_tree(inorder, mid+1, ei);

        return root ;
    }

    public static void getinorder(Node root,ArrayList<Integer> inorder) {
       
        if(root == null)
        return ;

        getinorder(root.left,inorder);
        inorder.add(root.data);
        getinorder(root.right,inorder);
    }
}
