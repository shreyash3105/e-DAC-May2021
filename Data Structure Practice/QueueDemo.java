public class QueueDemo {
    int size=5;
    int arr[]= new int[size];
    int front=0;
    int rear=-1;

    void Enqueue(int data){
        if(isFull()){
            System.out.println("Queue Overflow");
        }
        else{
         arr[++rear]=data;
        }
    }
    void Dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow");
        }
        else{
            front ++;
        }
    }
    void peek(){
        if(isEmpty()){
            System.out.println("Queue Underflow");
        }
        else{
        System.out.println("The front element is : " +arr[front]);
        }
    }
    boolean isFull(){
        if(rear==size-1){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isEmpty(){
        if (rear == front){
            rear = 0;
            front = 0;
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        QueueDemo obj = new QueueDemo();
        obj.Enqueue(11);
        obj.Enqueue(12);
        obj.Enqueue(13);
        obj.Enqueue(14);
        obj.Enqueue(15);
        obj.Dequeue();
        obj.Enqueue(60);
        obj.peek();
    }
}
