public class LinkedListDemo {
    Node head;
    //Static Node class.
    static class Node{
        int data;
        Node next;
    //Node constructor
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    //Printing LinkedList
        public void display() {
            Node temp = head;
                while(temp !=null){ //Traversing list in while loop till "temp" becomes null.
                    System.out.print(temp.data + " ");
                    temp = temp.next;
        }
    }
    //Adding Element at initial position.
        public void addInitial(int data){
            Node new_node = new Node(data);
            new_node.next = head;
            head = new_node;
        }
    //Adding element at any position.
        public void addAnyPosition(Node previous_node, int data){
            if(previous_node == null){
                System.out.println("Cannot add");
                return;
            }
            Node new_node = new Node(data);
            new_node.next = previous_node.next;
            previous_node.next = new_node;
        }
    //Adding element at end position.
        public void addAtEnd(int new_data){
            Node new_node = new Node(new_data);
            if(head == null){
                head = new Node(new_data);
                return;
            }
            new_node.next = null;
                Node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = new_node;
                return;
        }
    //Deleting Element at first position.
        void deleteFirst(){
            if(head == null){
                System.out.println("not possible");
            }
                head = head.next;
        }
    //Deleting Node using key.
        void deleteNodeKey(int key) 
        { 
            Node temp = head, prev = null; 
            if (temp != null && temp.data == key) 
            { 
                head = temp.next; // Changed head 
                return; 
            } 
            while (temp != null && temp.data != key) 
            { 
                prev = temp; 
                temp = temp.next; 
            }     
            if (temp == null) return; 
            prev.next = temp.next; 
        }
    //Deleting Node using it's position.
        void deleteNodePosition(int position) 
        { 
            if (head == null) 
                return; 
            Node temp = head; 
            if (position == 0) 
            { 
                head = temp.next;
                return; 
            } 
            for (int i=0; temp!=null && i<position-1; i++) 
                temp = temp.next; 
            if (temp == null || temp.next == null) 
                return; 
            Node next = temp.next.next; 
            temp.next = next; 
        }
        public static void main(String[] args) {
        //Creating Nodes.
            LinkedListDemo obj = new LinkedListDemo();
            obj.head = new Node(10);
            Node second = new Node(20);
            Node third = new Node(30);
            Node fourth = new Node(40);
        //Linking Nodes.
            obj.head.next = second;
            second.next = third;
            third.next = fourth;
        //Insertion operations.
            obj.addInitial(65);
            obj.addAnyPosition(second,99);
            obj.addAtEnd(75);
        //Deletion operations.
            obj.deleteFirst();
            obj.deleteNodeKey(99);
            obj.deleteNodePosition(4);
        //Printing LinkedList.
            obj.display();

        }        
}
