package Binary_Trees;

public class Height_of_tree { // O(n)

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    // nodes in tree
    public static int count_nodes(Node root){ 
        if(root == null)
        return 0;

        return count_nodes(root.left)+count_nodes(root.right)+1 ;
    }

    // sum of total nodes in tree
    public static int sum_of_nodes(Node root){
        if(root == null)
        return 0 ;

        return sum_of_nodes(root.left)+sum_of_nodes(root.right)+root.data ;
    }



    // first approach // O(n^2)
    public static int Diameter_of_tree(Node root) {
        if(root == null)
        return 0 ;

        int leftdiam = Diameter_of_tree(root.left);
        int rightdiam = Diameter_of_tree(root.right);

        int leftheight = height(root.left);
        int rightheight = height(root.right);

        int selfdiam = leftheight + rightheight +1 ;

        return Math.max(selfdiam, Math.max(rightdiam, leftdiam)) ;
    }

    // second approach // O(n)
    static class Info{
        int diam ;
        int ht ;

        public Info(int diam,int ht){
            this.diam  = diam ;
            this.ht = ht ;
        }
    }
    public static Info diameter_of_tree_2(Node root){
        if(root == null)
        return new Info(0, 0);

        Info leftInfo = diameter_of_tree_2(root.left);
        Info rightInfo = diameter_of_tree_2(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int height = Math.max(leftInfo.ht, rightInfo.ht)+1 ;

        return new Info(diam, height) ;
    }


    public static void main(String args[]) {
        /*
         * 1
         * / \
         * 2 3
         * / \ \
         * 4 5 6
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("height of tree = "+height(root));
        System.out.println("total nodes in tree = "+count_nodes(root));
        System.out.println("Sum of tree = "+sum_of_nodes(root));

        System.out.println("Diameter of tree(Using first approach) = "+Diameter_of_tree(root));

       
        System.out.println("Diameter of tree(Using second approach) = "+diameter_of_tree_2(root).diam);
    }

}
