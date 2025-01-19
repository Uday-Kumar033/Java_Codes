public class Q4_DiameterOfTree {
    public static class Node{
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            this.right= null;
            this.left = null;
        }
    }
    // Code to find height of tree
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }
    // Code to find Diameter of tree 
    public static int Diameter(Node root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int RightHeight = height(root.right);
        int selfDiameter = leftHeight + RightHeight + 1;

        int leftDiameter = Diameter(root.left);
        int RightDiameter = Diameter(root.right);
        return Math.max(selfDiameter, Math.max(leftDiameter, RightDiameter));
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        System.out.print("The diameter of tree is ");
        System.out.print(Diameter(root));
    }
}
