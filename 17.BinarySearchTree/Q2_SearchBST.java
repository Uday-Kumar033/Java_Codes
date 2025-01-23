public class Q2_SearchBST {
    static class Node{
        int data;
        Node left,right;
        public Node(int data) {
            this.data = data;
            left=right = null;
        }
    }


    public static Node insert(Node root , int val){   //Time commplexity = O(N) , In the case of Skew Tree.
        if(root == null) {
            root = new Node(val);
            return root;
        }
        if(root.data > val) {
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }


    public static void inorder(Node root) {
        if(root == null) {
            return ;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    public static boolean search(Node root , int val) {  // Time Complexity = O(H) , H = height of tree.
        if(root == null ) {
            return false;
        }
        if(root.data == val) {
            return true;
        }
        if(root.data > val) {
            return search(root.left, val);
        }else {
            return search(root.right, val);
        }
        
    }
    public static void main(String[] args) {
        int value[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i = 0 ; i < value.length ; i++) {
            root = insert(root, value[i]);
        }
        inorder(root);
        System.out.println();
        if(search(root, 4)) {
            System.out.println("Found ");
        }else{
            System.out.println("Not found");
        }
    }
}
