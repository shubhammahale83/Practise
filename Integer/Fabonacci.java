package Integer;

import java.util.Scanner;

public class Fabonacci {
    public static int fabonacci(int n) {
      int sum = 0;
      for (int i = 0; i <= n; i++) {
        sum = sum + i;
      }
      return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter number for fabonacci: " );
        int input = sc.nextInt();
        System.out.println("FABONACCI IS: " + fabonacci(input));

    }
}
