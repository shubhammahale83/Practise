package Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSortedArraysWithStream {

    public static int[] mergeSortedArraysWithStream(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().distinct().toArray();
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5};
        int[] arr2 = {1, 2, 6};
        System.out.println(Arrays.toString(mergeSortedArraysWithStream(arr1, arr2)));
    }
    
}
