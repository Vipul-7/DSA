package Binary_Trees;

import java.util.*;

// 106 and 105 leetcode

public class Build_Tree_From_In_and_Post {
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

    static Map<Integer, Integer> hm = new HashMap<>(); // for storing the index of inorder array

    public static void main(String[] args) {
        int inorder[] = { 9, 3, 15, 20, 7 };
        int postorder[] = { 9, 15, 7, 20, 3 };

        int n = inorder.length;
        for (int i = 0; i < n; i++) {
            hm.put(inorder[i], i);
        }

        Node root = buildTree(inorder, 0, n - 1, postorder, 0, n - 1);

        inorder(root);
    }

    public static Node buildTree(int inorder[], int is, int ie, int postorder[], int ps, int pe) {
        // base condition
        if (ie > is || pe > ps) {
            return null;
        }

        int lastEleOfPostOrder = postorder[pe];
        Node root = new Node(lastEleOfPostOrder); // FOr every time last element is the root in the post order array
        int inorderRootIndex = lastEleOfPostOrder;

        Node leftChild = buildTree(inorder, is, inorderRootIndex - 1, postorder, ps, ps + inorderRootIndex - is - 1);
        Node rightChild = buildTree(inorder, inorderRootIndex + 1, ie, postorder, ps + inorderRootIndex - is, pe - 1);

        root.left = leftChild;
        root.right = rightChild;

        return root;
    }

    public static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right); //
    }
}
