package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {
   public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 5, 6, 3, 5, 5, 9};
        Set<Integer> seen = new HashSet<>();
        // Set<Integer> duplicates = new HashSet<>();
        // for(int num : arr){
        //     if(!seen.add(num)) duplicates.add(num); 
        // }
        // System.out.println("Dupliactes" + duplicates);

        Set<Integer> duplicate = Arrays.stream(arr)
                                       .boxed()
                                       .filter(n -> !seen.add(n))
                                       .collect(Collectors.toSet());
        System.out.println("Duplicates" + duplicate);
   }
    
}
