public class Q3_DeleteNode {
    static class Node{
        int data;
        Node left,right;
        public Node(int data) {
            this.data = data;
            left=right = null;
        }
    }

    public static Node insert(Node root , int val){
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

    public static Node InorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static Node Delete(Node root, int val) {
        if(root == null){
            return null;
        }
        if(root.data > val) {
            root.left = Delete(root.left, val);
        }else if (root.data < val) {
            root.right = Delete(root.right,val);
        }else {

            //case 1 : If node is a leaf Node
            if(root.left == null && root.right == null) {
                return null;
            }

            //case 2 : if node having child
            if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }

            //case 3 : if node having Both child
            Node IS = InorderSuccessor(root.right);
            root.data = IS.data;
            root.right = Delete(root.right,IS.data);
        }
        return root;
    }


    public static void main(String[] args) {
        int value[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i = 0 ; i < value.length ; i++) {
            root = insert(root, value[i]);
        }
        System.out.print("Binary search tree before Delete : ");
        inorder(root);
        System.out.println();
        System.out.print("Binary serach tree after deleted : ");
        Delete(root, 2);
        inorder(root);
    }
}
