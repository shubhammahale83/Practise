package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareToRightNum {

    public static List<Integer> CompareToRightNum(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int n = arr.length;
        int maxFromRight = arr[n -1];
        result.add(maxFromRight);

        for (int i = n-2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                result.add(maxFromRight);
            }
        }

        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {

        int [] arr = {16,17,3,4,5,2};
        System.out.println("Result: " + CompareToRightNum(arr));
    }
    
}
