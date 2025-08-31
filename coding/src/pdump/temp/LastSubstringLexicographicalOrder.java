package pdump.temp;

import java.util.PriorityQueue;

public class LastSubstringLexicographicalOrder {

    public static String lastSubstring(String s) {
        int n = s.length();
        int i = 0, j = 1, k = 0;  // i is the index of the current best candidate, j is the challenger

        while (j + k < n) {
            if (s.charAt(i + k) == s.charAt(j + k)) {
                // If characters are the same, increment k to compare the next characters
                k++;
            } else if (s.charAt(i + k) > s.charAt(j + k)) {
                // If the current candidate at i is larger, move j forward to skip the current comparison
                j = j + k + 1;
                k = 0;
            } else {
                // If the challenger at j is larger, update i to j and move j forward
                i = Math.max(i + k + 1, j);
                j = i + 1;
                k = 0;
            }
        }
        PriorityQueue<String> pq = new PriorityQueue<>();

        for (int l = 0; l < n; l++) {

            if (pq.isEmpty()) {
                // If the queue is empty, just add the string
                pq.offer(s);
            } else if (s.substring(l).compareTo(pq.peek()) > 0) {
                //System.out.println(s.substring(l) + " " + pq.peek() + " " + s.substring(l).compareTo(pq.peek()));
                // Replace the string if the new string is lexicographically larger
                pq.poll();  // Remove the current smallest/largest string (since size is 1)
                pq.offer(s.substring(l));
            }
        }

        System.out.println(pq.peek());
        // Return the substring starting from the best index i
        return s.substring(i);
    }

    public static void main(String[] args) {
        String s1 = "abab";
        System.out.println(lastSubstring(s1));  // Output: "bab"

        String s2 = "leetcode";
        System.out.println(lastSubstring(s2));  // Output: "tcode"
    }
}
