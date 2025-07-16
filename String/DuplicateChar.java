package String;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {

    public static void main(String[] args) {
       String str = "Okkeey";
       Map<Character, Integer> countMap = new HashMap<>();
       for (Character s : str.toCharArray()) {
        countMap.put(s, countMap.getOrDefault(s, 0) + 1);
       }
       for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
       }
    }
}
