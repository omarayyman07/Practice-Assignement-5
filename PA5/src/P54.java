public class P54 {
    public static int power(int m,int n){
        int product =1;
        for(int i =0; i<n;i++){
            product*=m;
        }
        return product;
    }
    public static void main(String[] args){
        System.out.println(power(2,4));
    }
}
