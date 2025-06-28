package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> reverseArray = Arrays.stream(arr)
                                           .boxed()
                                           .sorted((a, b) -> b -a)
                                           .collect(Collectors.toList());
        System.out.println("Reverse Array: "+ reverseArray);

    }
    
}
