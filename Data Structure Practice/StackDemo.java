public class StackDemo {
    int top = -1;
    int size = 5;
    int arr[] = new int[size];
    public void push(int data){
        if(isFull()){
            System.out.println("Overflow");
        }
        else{
        top++;
        arr[top] = data;
    }
}
    public void pop(){
        if(isEmpty()){
            System.out.println("Underflow");
        }
        else{
           --top;
        }
    }
    public void peek(){
        if (isEmpty()){
            System.out.println("underflow");
        }
        else{
        System.out.println(arr[top]);
    }
}
    public boolean isEmpty(){
        if(top == -1){
        return true;       
    }
    else{
        return false;
    }
}
    public boolean isFull(){
        if(top == size-1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        StackDemo obj = new StackDemo();
        obj.push(10);
        obj.peek();
        obj.pop();
        }
}
