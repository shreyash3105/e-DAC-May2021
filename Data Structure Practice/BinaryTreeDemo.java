public class BinaryTreeDemo {
    static  Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            Node left, right = null;
        }
     }
     // Traversing in Depth First : InOrder.
     void inOrder(Node root){
         if(root != null){
             inOrder(root.left);
             System.out.print(root.data + " ");
             inOrder(root.right);
         }
     }
     //Traversing in Depth First : PostOrder.
     void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    //Traversing in Depth first : PreOrder.
    void pretOrder(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            pretOrder(root.left);
            pretOrder(root.right);
        }
    }
     public static void main(String[] args) {
        BinaryTreeDemo obj = new BinaryTreeDemo();
        obj.root = new Node(10);
        obj.root.left = new Node(20);
        obj.root.right = new Node(30);
        obj.root.left.left = new Node(40);
        obj.root.left.right = new Node(50);
        obj.root.right.right = new Node(60);
        System.out.println("InOrder :");
        obj.inOrder(root);
        System.out.println("\nPreOrder :");
        obj.pretOrder(root);
        System.out.println("\nPostOrder :");
        obj.postOrder(root);
     }
}