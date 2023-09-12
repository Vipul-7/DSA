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

    // Python code for Morris preorder traversal with O(N) time and constant space
    /*
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        preorder= []
        curr = root

        while curr:
            if not curr.left:
                preorder.append(curr.val)
                curr = curr.right
            else:
                prev = curr.left
                while prev.right and prev.right != curr:
                    prev = prev.right
                
                if not prev.right:
                    prev.right = curr
                    preorder.append(curr.val)
                    curr = curr.left
                else:
                    prev.right = None
                    curr = curr.right

        return preorder
    */


        public void inorder(Node root) {
            if (root == null)
                return;

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right); //
        }

    // Python code for Morris inorder traversal with O(N) time and constant space
    /*
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        inorder = []
        curr = root

        while curr:
            # case -1 - left is NULL
            if not curr.left:
                inorder.append(curr.val)
                curr = curr.right
            else:
                rightMost = curr.left
                # case -2 - if left is not NULL then go to the right most node of left's
                while rightMost.right and rightMost.right != curr:
                    rightMost = rightMost.right
                
                # if rightMost is NULL then their is traversal remaining for left part so go left
                if not rightMost.right:
                    rightMost.right = curr
                    curr = curr.left
                # if rightmost points to the curr then break the connection and go right of curr
                else:
                    rightMost.right = None
                    inorder.append(curr.val)
                    curr = curr.right
            
       return inorder
    */

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
