package pdump.temp;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {
        Map<Character, Integer> countMap = new HashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a frequency of 1
        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;  // If no unique character exists
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));       // Output: 0
        System.out.println(firstUniqChar("loveleetcode"));   // Output: 2
        System.out.println(firstUniqChar("aabb"));           // Output: -1
    }
}
