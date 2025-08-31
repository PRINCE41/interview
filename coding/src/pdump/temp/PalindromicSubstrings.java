package pdump.temp;

public class PalindromicSubstrings {
    
    public static int countSubstrings(String s) {
        int count = 0;
        
        // Expand around each center
        for (int i = 0; i < s.length(); i++) {
            // Odd-length palindromes (single character center)
            count += expandAroundCenter(s, i, i);
            
            // Even-length palindromes (two character center)
            count += expandAroundCenter(s, i, i + 1);
        }
        
        return count;
    }
    
    // Helper function to count palindromes expanding from the center
    private static int expandAroundCenter(String s, int left, int right) {
        int count = 0;
        
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        
        return count;
    }

    public static void main(String[] args) {
        // Test case 1
        String s1 = "abc";
        System.out.println(countSubstrings(s1));  // Output: 3

        // Test case 2
        String s2 = "aaa";
        System.out.println(countSubstrings(s2));  // Output: 6
    }
}
