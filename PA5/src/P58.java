public class P58 {
    public static boolean IsPrime(int a) {
        if (a <= 1)
            return false;

        for (int i = a - 1; i > 1; i--) {
            if (a % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(IsPrime(101));
    }
}
