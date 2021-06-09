import java.util.Scanner;
//Printing Numbers from N to 1. / N to 100.
public class Test3 {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
   void func(int n){
       this.n = n;
        //if (n==0) //N to 1
        if (n==101) //N to 100
        return;
        System.out.print(n + " ");
        //func(n-1);
        func(n+1);
    }
    public static void main(String[] args) {
      
        Test3 obj = new Test3();
      obj.func(n);
      
    }
}
