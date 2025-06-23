package Integer;

import java.util.Arrays;

public class SecondLargeNum {
    // public static int secondLargeNum(int[] arr) {
    //     int first = Integer.MIN_VALUE, second = Integer.MAX_VALUE;
    //     for (int num : arr) {
    //         if (num > first) {
    //             second = first;
    //             first = num;
    //         } else if (num > second && num != first) {
    //             second = num;
    //         }
    //     }
    //     return second;
    // }

    // public static void main(String[] args) {

    //     int[] arr = {23, 45, 20, 99, 10};
    //     System.out.println(secondLargeNum(arr));
    // }

    // -----------------------------------------------------

    public static void main(String[] args) {
        int[] arr = {23, 34, 55, 55, 10, 20, 69, 69, 99};

        Integer secondLargeNum = Arrays.stream(arr)
                                       .boxed()
                                       .distinct()
                                       .sorted((a, b) -> b - a)
                                       .skip(1)
                                       .findFirst()
                                       .orElse(null);
        System.out.println("Second Largest number is: "+ secondLargeNum);
    }
    
}
