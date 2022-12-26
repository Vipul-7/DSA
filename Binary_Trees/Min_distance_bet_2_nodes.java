// minimum distance between 2 nodes

package Binary_Trees;

public class Min_distance_bet_2_nodes {
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
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.println(LCA2(root, 4, 6).data);
        System.out.println(min_dis(root, 4, 6));
    }

    public static Node LCA2(Node root, int n1, int n2) {
        if (root == null)
            return root;

        if (root.data == n1 || root.data == n2)
            return root;

        Node left = LCA2(root.left, n1, n2);
        Node right = LCA2(root.right, n1, n2);

        if (left == null) // left null mil gaya to ab hamare n1,n2 left me hoge hi nahi
            return right;

        if (right == null)
            return left;

        return root;
    }

    public static int Distance(Node root, int n) {
        if (root == null)
            return -1;

        if (root.data == n)
            return 0;

        int left_dis = Distance(root.left, n);
        int right_dis = Distance(root.right, n);

        if (left_dis == -1 && right_dis == -1)
            return -1;

        else if (left_dis == -1)
            return right_dis + 1;

        else
            return left_dis + 1;
    }

    // main
    public static int min_dis(Node root,int n1,int n2){
        Node lca = LCA2(root, n1, n2) ;

        int left_dis = Distance(lca, n1);
        int right_dis = Distance(lca, n2) ;

        return left_dis + right_dis ;
    }
}
