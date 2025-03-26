public class P55 {
    public static int Factorial(int a){
    if (a==0)
        return 1;
    return a*Factorial(a-1);
    }
    public static double euler(double n){
        double e=1;
        for(int i=1;i<n;i++){
            e+=(1.0)/Factorial(i);
        }
        return e;
    }
    public static void main(String[] args){
        System.out.println(euler(15));
    }
}
