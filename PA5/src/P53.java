import java.util.*;

public class P53 {
    public static String Decomp(String a) {
        int i = 0;
        int b = 0;
        String nstring = "";
        String nstring2 = "";

        while (i < a.length()) {
            switch (a.charAt(i)) {
                case '0':
                    nstring += "0";
                    break;
                case '1':
                    nstring += "1";
                    break;
                case '2':
                    nstring += "2";
                    break;
                case '3':
                    nstring += "3";
                    break;
                case '4':
                    nstring += "4";
                    break;
                case '5':
                    nstring += "5";
                    break;
                case '6':
                    nstring += "6";
                    break;
                case '7':
                    nstring += "7";
                    break;
                case '8':
                    nstring += "8";
                    break;
                case '9':
                    nstring += "9";
                    break;
                default:
                    if (nstring.length()>0) {
                        b = Integer.parseInt(nstring);
                        nstring = "";
                    } else {
                        b = 1;
                    }


                    for (int count = 0; count < b; count++) {
                        nstring2 += a.charAt(i);
                    }
                    break;
            }
            i++;
        }

        return nstring2;
    }
public static void main(String[] args){
        System.out.println(Decomp("1D1C"));
}
}
