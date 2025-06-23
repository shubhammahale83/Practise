package String;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
      return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter String1: ");
        String inStr1 = sc1.nextLine();
        System.out.println("Enter String2: ");
        String inStr2 = sc1.nextLine();
        System.out.println("String1: "+ inStr1);
        System.out.println("String2: "+ inStr2);
        System.out.println("Is your Strings are Anagram: "+ isAnagram(inStr1, inStr2));

    }
    
}
