import java.util.ArrayList;

class Q5_Root2Leaf {
    static class Node{
        int data;
        Node left,right;
        public Node(int data) {
            this.data = data;
            left=right = null;
        }
    }

    
    static Node insert(Node root , int val){
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

    static void printPath(ArrayList <Integer> path) {
        for(int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }

    public static void printRoot2Leaf(Node root, ArrayList <Integer> path) {
        if(root == null) {
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null) {
            printPath(path);    
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int value[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i = 0 ; i < value.length ; i++) {
            root = insert(root, value[i]);
        } 
        printRoot2Leaf(root, new ArrayList<>());
    }
}
