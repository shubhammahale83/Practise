package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class Practice {
    public static Character firstNonRepeatingChar(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        } else {
            Map<Character, Integer> charCount = new LinkedHashMap<>();
            for (char c : s.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }
            }
        }
        return null;
    }

     public static void main(String[] args) {
        String input1 = "racecar";
        String input2 = "hello";
        String input3 = "aabbcc";

        System.out.println("First non-repeating character in '" + input1 + "': " + firstNonRepeatingChar(input1));
        System.out.println("First non-repeating character in '" + input2 + "': " + firstNonRepeatingChar(input2));
        System.out.println("First non-repeating character in '" + input3 + "': " + firstNonRepeatingChar(input3));
    
    }
}