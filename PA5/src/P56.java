public class P56 {
    public static boolean Perfect(int a){
        int sum=0;
        for(int i=1;i<a;i++) {
            if (a % i == 0)
                sum += i;
            if (sum==a)
                return true;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(Perfect(28));
    }
}
