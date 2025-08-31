package pdump.pfour;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacterWithStreams {

    public static int firstUniqChar(String s) {
        // Create a map of character frequencies while maintaining insertion order
        Map<Character, Long> frequencyMap = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        // Find the first character with a frequency of 1
        return s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> frequencyMap.get(c) == 1)
                .map(s::indexOf)
                .findFirst()
                .orElse(-1);
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println(firstUniqChar(s1));  // Output: 0

        String s2 = "loveleetcode";
        System.out.println(firstUniqChar(s2));  // Output: 2

        String s3 = "aabb";
        System.out.println(firstUniqChar(s3));  // Output: -1
    }
}
