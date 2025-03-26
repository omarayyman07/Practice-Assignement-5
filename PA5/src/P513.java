import java.util.*;
public class P513 {
    public static int getNumber(char c) {
        switch (c) {
            case 'A': case 'B': case 'C': return 2;
            case 'D': case 'E': case 'F': return 3;
            case 'G': case 'H': case 'I': return 4;
            case 'J': case 'K': case 'L': return 5;
            case 'M': case 'N': case 'O': return 6;
            case 'P': case 'Q': case 'R': case 'S': return 7;
            case 'T': case 'U': case 'V': return 8;
            case 'W': case 'X': case 'Y': case 'Z': return 9;
            default: return -1;
        }
    }


    public static String translate(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                result += getNumber(Character.toUpperCase(c));
            } else {
                result += c;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a phone number: ");
        String input = scanner.nextLine();
        System.out.println("Translated number: " + translate(input));
    }
}
