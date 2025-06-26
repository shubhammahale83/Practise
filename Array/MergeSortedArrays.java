package Array;

import java.util.Arrays;

//Two Pointer Approach
public class MergeSortedArrays {

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] merged = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            merged[k++] = (arr1[i] < arr2[j]) ? arr1[i]: arr2[j]; 
        }
        while (i < arr1.length) merged[k++] = arr1[i++];
        while (j < arr2.length) merged[k++] = arr2[j++];
        return merged;  
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 5};
        System.out.println(Arrays.toString(mergeSortedArrays(arr1, arr2)));
    }
    
}
