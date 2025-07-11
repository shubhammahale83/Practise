package Problem;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HighestKElem {

    public static List<Integer> highestKIntegers(int[] num, int k) {

        return IntStream.of(num)
                        .boxed()
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .limit(k)
                        .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[] num = {12, 34, 67, 32, 67, 98, 34};
        int k = 3;

        List<Integer> topK = highestKIntegers(num, k);
        System.out.println("Top " + k + " Highest Elements " + topK);
    }
}
