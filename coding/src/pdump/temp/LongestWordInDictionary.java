package pdump.temp;

import java.util.*;

public class LongestWordInDictionary {
    public static String findLongestWord(String s, List<String> dictionary) {
        // Sort by length (descending) and lexicographical order (ascending)
        Collections.sort(dictionary, (a, b) -> {
            if (a.length() != b.length()) {
                return b.length() - a.length();
            } else {
                return a.compareTo(b);
            }
        });

        System.out.println(dictionary);

        // Check if each word in the dictionary is a subsequence of s
        for (String word : dictionary) {
            if (isSubsequence(word, s)) {
                return word;
            }
        }
        return "";
    }

    // Function to check if word is a subsequence of s
    private static boolean isSubsequence(String word, String s) {
        int i = 0, j = 0;
        while (i < word.length() && j < s.length()) {
            if (word.charAt(i) == s.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == word.length();
    }

    public static void main(String[] args) {
        List<String> dictionary = Arrays.asList("ale", "apple", "monkey", "plea");
        String s = "abpcplea";
        System.out.println(findLongestWord(s, dictionary));  // Output: "apple"
        
        List<String> dictionary2 = Arrays.asList("a", "b", "c");
        String s2 = "abpcplea";
        System.out.println(findLongestWord(s2, dictionary2));  // Output: "a"
    }
}
