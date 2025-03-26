public class P511 {
    public static String zFunction(String s) {
        int n = s.length();
        String result = "";

        int L = 0, R = 0;
        int i = 1;
        while (i < n) {
            int Z_i = 0;
            if (i <= R) {
                int minZR = R - i + 1;
                int j = 0;
                while (j < minZR && s.charAt(j) == s.charAt(i + j)) {
                    Z_i++;
                    j++;
                }
            } else {
                while (i + Z_i < n && s.charAt(Z_i) == s.charAt(i + Z_i)) {
                    Z_i++;
                }
            }
            if (i + Z_i - 1 > R) {
                L = i;
                R = i + Z_i - 1;
            }
            result += Z_i;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(zFunction("ababa"));
        System.out.println(zFunction("axbyaxba"));
        System.out.println(zFunction("ababababx"));
        System.out.println(zFunction("CSEN"));
    }


}
