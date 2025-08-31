package pn;

public class MaximalSquare {

    // Function to find the largest square area containing only 1's
    public int maximalSquare(char[][] matrix) {
        // Handle the case where the matrix is empty
        if (matrix.length == 0) return 0;
        
        int m = matrix.length;
        int n = matrix[0].length;
        int maxSquareLen = 0;
        
        // Create a DP array initialized with zeros
        int[][] dp = new int[m + 1][n + 1];
        
        // Traverse the matrix
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // Only process '1's in the matrix
                if (matrix[i - 1][j - 1] == '1') {
                    // The size of the square at dp[i][j] depends on the top, left, and top-left squares
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    // Keep track of the largest square found
                    maxSquareLen = Math.max(maxSquareLen, dp[i][j]);
                }
            }
        }
        
        // Return the area of the largest square
        return maxSquareLen * maxSquareLen;
    }

    // Main method to test the maximalSquare function
    public static void main(String[] args) {
        MaximalSquare ms = new MaximalSquare();
        
        // Test Case 1
        char[][] matrix1 = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };
        System.out.println("Largest square area: " + ms.maximalSquare(matrix1)); // Output: 4

        // Test Case 2
        char[][] matrix2 = {
            {'0', '1'},
            {'1', '0'}
        };
        System.out.println("Largest square area: " + ms.maximalSquare(matrix2)); // Output: 1

        // Test Case 3
        char[][] matrix3 = {
            {'0'}
        };
        System.out.println("Largest square area: " + ms.maximalSquare(matrix3)); // Output: 0
    }
}
