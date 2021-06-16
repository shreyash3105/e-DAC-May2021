public class BinarySearchTreeDemo {
    static Node root = null; //Declaring root as null for assigning first inserting value as data of root.
    class Node {
        int data;
        Node left, right;
        Node (int data){
            this.data = data;
            Node left , right = null;
        }
    }
    //Method for inserting element in BST.
    void insert (int key){
        root = insertdata(root ,key);
    }
    //Inserting algorithms as per properties of BST.
    Node insertdata(Node root, int key){
        if (root == null){
            root = new Node(key);
            return root;
        }
        if (key < root.data){
            root.left = insertdata(root.left, key);
        }
        else if(key > root.data){
            root.right = insertdata (root.right, key);
        }
        return root;
    }
    //Method for Traversing through BST.
    void inOrder(){
        inorder(root);
    }
    void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    //Method for searchign an element in BST.
    static boolean search(Node root, int key){
        if (root == null){
            return false;
        }
        if (root.data == key){
            return true;
        }
        else if(root.data < key){
            return search(root.right , key);
        }
        else{
            return search(root.left, key);
        }
    }
    //Deleting node by Key.
    void deleteKey(int key)
    {
        root = deleteRec(root, key);
    }
    Node deleteRec(Node root, int key)
    {
        if (root == null)  return root;
        if (key < root.data)
            root.left = deleteRec(root.left, key);
        else if (key > root.data)
            root.right = deleteRec(root.right, key);
        else
        {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }
    int minValue(Node root)
    {
        int minv = root.data;
        while (root.left != null)
        {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
    public static void main(String[] args) {
        BinarySearchTreeDemo obj = new BinarySearchTreeDemo();
        obj.insert(60);
        obj.insert(50);
        obj.insert(70);
        obj.insert(40);
        obj.insert(25);

        obj.inOrder();
        System.out.println();
        int key = 70; //Element to be searched.
        if (search(root, key)){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
        obj.deleteKey(50);
        obj.inOrder();
    }
}
