package String;

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String str) {
        return new String(new StringBuilder(str).reverse());
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String inStr = sc.nextLine();
        System.out.println("Reversed String: "+ reverseString(inStr));
    }
}
