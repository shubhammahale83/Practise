package Integer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NumRevStream {
    public static void main (String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Set<Integer> seen = new HashSet<>();
        List<Integer> dulpiacteList = myList.stream()
                                            .filter(n -> !seen.add(n))
                                            .distinct()
                                            .collect(Collectors.toList());
        System.out.println("Duplicates: " + dulpiacteList);
    }
}
