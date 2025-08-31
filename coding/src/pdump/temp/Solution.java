/*
package pdump.temp;

import java.util.*;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Sort the string to use as a key
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            // Add the original string to the corresponding anagram group
            map.putIfAbsent(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(str);
        }

        // Return the list of grouped anagrams
        map.values()
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(solution.groupAnagrams(strs1));
        // Output: [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]

        // Test case 2
        String[] strs2 = {""};
        System.out.println(solution.groupAnagrams(strs2));
        // Output: [[""]]

        // Test case 3
        String[] strs3 = {"a"};
        System.out.println(solution.groupAnagrams(strs3));
        // Output: [["a"]]
    }
}
*/
