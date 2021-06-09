public class Test5 {
    //Printing numbers from 1 to N.
    static int n = 0;
    void func(int n){
        if(n==0)
        return;
        func(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Test5 obj = new Test5();
        obj.func(6);
    }
}
