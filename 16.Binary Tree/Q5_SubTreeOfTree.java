public class Q5_SubTreeOfTree {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    // Code to check identical subtree 
    public static boolean isIdentical(Node root, Node subRoot){
        if (root == null && subRoot == null) {
            return true;
        }
        else if(root == null || subRoot == null || root.data != subRoot.data){
            return false;
        }
        if(!isIdentical(root.left, subRoot.right)){
            return false;
        }
        if(!isIdentical(root.right, subRoot.right)){
            return false;
        }
        return true;
    }
    // Code  to check subtree
    public static boolean isSubtree(Node root, Node subRoot){
        if(root == null) {
            return false;
        }
        if(root.data == subRoot.data) {
            if (!isIdentical(root, subRoot)){
                return true;
            }
        }
        return isSubtree(root.left, subRoot.right) || isSubtree(root.left, subRoot.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        System.out.print(isIdentical(root, subRoot));
    }
}
