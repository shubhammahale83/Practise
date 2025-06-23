package Integer;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumberReverse {
    public static void main(String[] args) {
        Integer[] num = {1,2,3,4,5,6,7,8,9};

        List<Integer> reversedList = Arrays.stream(num)
                                    .sorted(Comparator.reverseOrder())
                                    .collect(Collectors.toList());

         System.out.println("Reversed Array: " + reversedList);
    }
}
