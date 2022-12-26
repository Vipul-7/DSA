package Binary_Trees;

public class Kth_level_of_tree {
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

        Klevel(root, 1, 2);
    }

    static class Info {
        Node node;
        int hd; // horizontol distance

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void Klevel(Node root,int level,int k){
        if(root == null)
        return ;

        if(k == level){
        System.out.print(root.data+" ");
        return;
        }

        Klevel(root.left, level+1, k);
        Klevel(root.right, level+1, k);
    }
}
