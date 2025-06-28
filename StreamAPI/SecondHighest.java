package StreamAPI;

import java.util.Arrays;

public class SecondHighest {
    public static Integer secondHighest(int[] arr) {
        Integer secondHigh = Arrays.stream(arr)
                     .boxed()
                     .distinct()
                     .sorted((a, b) -> b-a)
                     .skip(1)
                     .findFirst()
                     .orElse(null);
        return secondHigh;   
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Duplicates: "+ secondHighest(arr));
    }
}
