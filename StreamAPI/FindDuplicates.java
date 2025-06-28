package StreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static List<Integer> findDuplicates(List<Integer> arr) {
        Set<Integer> seen = new HashSet<>();
        return arr.stream()
                     .filter(n -> !seen.add(n))
                     .distinct()
                     .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Numbers: ");
        // int size = sc.nextInt();
        // int[] num = new int[size];
        // System.out.println("Enter " + size + " number");
        // for (int i = 0; i < size; i++) {
        //     num[i] = sc.nextInt(); 
        // }
        // List<Integer> duplicates = findDuplicates(num);
        // System.out.println("Duplicate numbers: " + duplicates);

        // //without Scanner class
       // int[] arr = {12, 23, 12, 34, 45, 23};
        List<Integer> arr = Arrays.asList(10, 20, 30, 10, 40, 50, 30);
        System.out.println("Duplicate numbers: " + findDuplicates(arr));

    }
    
}
