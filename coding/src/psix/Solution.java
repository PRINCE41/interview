package psix;

public class Solution {

    public static int renameFile(String newName, String oldName) {
        int mod = 1_000_000_007;
        int n = newName.length();
        int m = oldName.length();
        int[][] dp = new int[n + 1][m + 1];

        // Initialization
        for (int j = 0; j <= m; j++) {
            dp[0][j] = 1; // Empty newName can be formed from any prefix of oldName
        }

        // DP computation
        for (int i = 1; i <= n; i++) {
            dp[i][0] = 0; // Non-empty newName cannot be formed from empty oldName
            for (int j = 1; j <= m; j++) {
                if (newName.charAt(i - 1) == oldName.charAt(j - 1)) {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i][j - 1]) % mod;
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }

        return dp[n][m];
    }

    // For testing purposes
    public static void main(String[] args) {
        String newName1 = "ccc";
        String oldName1 = "ccccc";
        System.out.println(renameFile(newName1, oldName1)); // Output: 4

        String newName2 = "abc";
        String oldName2 = "abba";
        System.out.println(renameFile(newName2, oldName2)); // Output: 0

        String newName3 = "aba";
        String oldName3 = "bababa";
        System.out.println(renameFile(newName3, oldName3)); // Output: 4
    }
}
