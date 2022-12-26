package Binary_Trees;

import java.util.LinkedList;
import java.util.Queue;


public class Build_tree {
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

    static class Binary_Tree { // // O(n)

        static int idx = -1; // doubt

        public Node build_tree(int nodes[]) {
            idx++;

            if (nodes[idx] == -1)
                return null;

            Node newNode = new Node(nodes[idx]);

            newNode.left = build_tree(nodes);
            newNode.right = build_tree(nodes);

            return newNode;

        }

        public void preorder(Node root) { // O(n)
            if (root == null)
                return;

            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public void inorder(Node root) {
            if (root == null)
                return;

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right); //
        }

        public void postorder(Node root) {
            if (root == null)
                return;

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public void levelorder(Node root) {
            if (root == null)
                return;

            Queue<Node> q = new LinkedList<>();

            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();

                if (currNode == null) {
                    System.out.println();

                    if (q.isEmpty())
                        break;
                    else
                        q.add(null);
                }

                else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null)
                        q.add(currNode.left);

                    if (currNode.right != null)
                        q.add(currNode.right);

                }

            }
        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Binary_Tree tree = new Binary_Tree();

        Node root = tree.build_tree(nodes);
        // System.out.println(root.data);

        // tree.preorder(root);

        // tree.inorder(root);

        // tree.postorder(root);

        tree.levelorder(root);
    }
}
