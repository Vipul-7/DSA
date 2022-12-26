package BST;

import java.util.ArrayList;

public class Path_of_tree_to_leaf {
    static class Node{
        int data ;
        Node left ;
        Node right ;

        public Node(int data){
            this.data = data ;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> path = new ArrayList<>();
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

        path(root, path);
    }

    public static void path(Node root,ArrayList<Integer> path){
        if(root == null)
        return ;

        path.add(root.data);

        if(root.left == null && root.right == null)
        printPath(path);

        path(root.left,path);
        path(root.right,path);

        path.remove(path.size()-1);
    }

    public static void printPath(ArrayList<Integer> path){
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+"->");
        }
        System.out.println("]");
    }
}
