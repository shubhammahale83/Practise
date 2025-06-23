package Array;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public static Set<Integer> arrayIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for(int num : arr1) {
            set1.add(num);
        }
        for(int num : arr2) {
            if(set1.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        System.out.println("Intersection: " + arrayIntersection(arr1, arr2));
    }
}
