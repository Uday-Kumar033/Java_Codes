import java.util.LinkedList;
import java.util.Queue;

public class Q1_BinaryTreeTraversal {
    //Create a node class to track the data of tree
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){//Constructor
            this.data= data;
            this.left = null;
            this.right = null;
        }
    }
    //Class BinaryTree to build  Tree
    static class BT{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){//null value printing
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }


    // Object to create Preorder traversal
    public static void Preorder(Node root) {
        if (root == null) {
         return ;
        }
        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }


    //Object to create Inorder traversal
    public static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    // Object to create postorder traversal in binary tree 
    public static void Postorder(Node root){
        if (root == null ) {
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data + " ");
    } 

    // Level order traversal of binary tree
    public static void LevelOrder(Node root) {
        if (root == null ) {
            return;
        }
        Queue <Node> q = new LinkedList<>(); 
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
              if(q.isEmpty()) {
                break;
              }else {
                q.add(null);
              }
            }else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }
       public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT Tree = new BT();
        Node root = Tree.buildTree(nodes);
        System.out.println(root.data);

        System.out.print("The Preorder traversal of given tree : ");
        Preorder(root);
        System.out.println();

        System.out.print("The Inoder Traversal of given tree : ");
        Inorder(root);
        System.out.println();

        System.out.print("The Postorder traversal of given tree :  ");
        Postorder(root);
        System.out.println();

        System.out.println("The level order traversal of binary tree : ");
        LevelOrder(root);
    }
}