package Integer;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReveredNumber {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] reversed = IntStream.range(0, num.length)
                                  .map(i -> num[num.length - 1 -i])
                                  .toArray();

        System.out.println(Arrays.toString(reversed));
    }
}
