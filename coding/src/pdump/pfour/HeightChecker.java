package pdump.pfour;

import java.util.Arrays;

public class HeightChecker {

    public static int heightChecker(int[] heights) {
        // Create a copy of the heights array and sort it to get the expected order
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        
        // Count how many indices differ between heights and expected
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] heights1 = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(heights1));  // Output: 3

        int[] heights2 = {5, 1, 2, 3, 4};
        System.out.println(heightChecker(heights2));  // Output: 5

        int[] heights3 = {1, 2, 3, 4, 5};
        System.out.println(heightChecker(heights3));  // Output: 0
    }
}
