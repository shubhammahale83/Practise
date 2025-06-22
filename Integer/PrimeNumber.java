package Integer;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean primeNumber(Integer num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        } 
        return true;
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check isPrime: ");
        Integer inNum = sc.nextInt();
        System.out.println("is Prime Number: " + primeNumber(inNum));
    }
}
