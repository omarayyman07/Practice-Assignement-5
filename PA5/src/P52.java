import java.util.*;
public class P52 {
    public static int max(int a,int b){
        return (a>b)? a : b;
    }
    public static double max(double a,double b){
        return (a>b)? a : b;
    }
    public static String max(String a, String b){
        if (a.compareTo(b)<0)
            return b;
        return a;
    }
    public static void main(String[] args){
        System.out.println(max("Tom Aspinall","Jon Jones"));

    }
}
