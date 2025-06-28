package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFreqElem {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> frequency = words.stream()
                                           .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequency); 
    }  
}
