import java.util.Scanner;

public class Main {

    static int findLength(String s) {
        return s.length();
    }

    static String toUpper(String s) {
        return s.toUpperCase();
    }

    static boolean checkPalindrome(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return s.equals(rev);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        System.out.println("Length: " + findLength(str));
        System.out.println("Uppercase: " + toUpper(str));

        if (checkPalindrome(str))
            System.out.println("Palindrome string");
        else
            System.out.println("Not a palindrome");

        sc.close();
    }
}
