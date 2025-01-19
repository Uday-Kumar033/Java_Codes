public class Q3_CountandSum {
    static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }    
    public static int Count(Node root) {
        if (root == null) {
            return 0;
        }
        int leftCount = Count(root.left);
        int rightCount = Count(root.right);
        return leftCount + rightCount + 1;
    }

    //code for sum of all nodes
    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        int LeftSum = sum(root.left);
        int rightSum = sum(root.right);
        return LeftSum + rightSum + root.data;
    }

    // main function
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        System.out.print("The Number Nodes in given tree : ");
        System.out.println(Count(root));
        System.out.print("The Sum of all nodes is ");
        System.out.print(sum(root));
    }    
}
