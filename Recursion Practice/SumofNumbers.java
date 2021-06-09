public class SumofNumbers {
    static int func(int n){
        if(n==0)
        return 0;
        return func(n/10)+(n%10);
    }
    public static void main(String[] args) {
        System.out.println(func(159));
    }
}
