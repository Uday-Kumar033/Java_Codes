public class Q6_ValidateBST {
    public static class Node{
        int data;
        Node left,right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }
        if(root.data > val ) {
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static boolean ValidateBST(Node root, Node min, Node Max) {
        if (root == null){
            return true;
        }
        if(min != null && root.data <= min.data) {
            return false;
        }else if(Max!= null && root.data >= Max.data){
            return false;
        }else{
            return ValidateBST(root.left,min,root) && ValidateBST(root.right,root, Max);
        }
    }

    public static void inorder(Node root ) {
        if(root == null){ 
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int value[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i = 0 ; i < value.length ; i++) {
            root = insert(root, value[i]);
        }
        if(ValidateBST(root, null, null)) {
            System.out.println("Valid");
        }else {
            System.out.println("Not Valid");
    }
    }
}
