public class Test2 {
    //Decimal to binary conversion.
    static void func(int n){
        if (n == 0)
        return;
        func(n/2);
        System.out.println(n%2);
    }
    public static void main(String[] args) {
        func(13);
    }
}
