public class P57 {
    public static boolean Palindrome(String a){
        String nstring="";
        for(int i=a.length()-1;i>=0;i--){
            nstring+=a.charAt(i);
        }
        if (nstring.equals(a))
            return true;
        return false;
    }
    public static void main(String[] args){
        System.out.println(Palindrome("noon"));
    }
}
