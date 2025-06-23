package Integer;

public class MissingNumber {
    public static int missingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        int n = 6;
        System.out.println("Missing number: " + missingNumber(arr, n));

    }
    
}
