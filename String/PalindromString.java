package String;

import java.util.Scanner;

public class PalindromString {
    public static boolean palindromString(String str) {
        return str.equals(new String(new StringBuilder(str).reverse().toString()));
    }
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String for check: ");
        String inStr = sc.nextLine();
        System.out.println("is Palindrome: " + palindromString(inStr));
    }
}
