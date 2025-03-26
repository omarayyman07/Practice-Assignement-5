import java.util.*;
public class P51 {
    public static int Fib(int n){
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        return Fib(n-1)+Fib(n-2);


}
public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the nth position of the fibonacci number you wish to find");
        int x=sc.nextInt();
    System.out.println(Fib(x));
}}
