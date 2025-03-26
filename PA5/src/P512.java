public class P512 {
    public static int multiply(int a){
        int temp=0;
        int product =1;
        while (a>0){
            temp=a%10;
            product*=temp;
            a/=10;
        }
        return product;
    }
    public static int Persistant(int a){
       int count=0;
       int n=a;
       while (n>10){
           n=multiply(n);
           count++;
       }
       return count;
    }
    public static void main(String[] args){
        System.out.println(Persistant(23));

    }
}
