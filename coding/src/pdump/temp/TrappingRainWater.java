package pdump.temp;

public class TrappingRainWater {

    public static int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int waterTrapped = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];  // Update leftMax
                } else {
                    waterTrapped += leftMax - height[left];  // Calculate trapped water on the left
                }
                left++;  // Move left pointer towards the center
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];  // Update rightMax
                } else {
                    waterTrapped += rightMax - height[right];  // Calculate trapped water on the right
                }
                right--;  // Move right pointer towards the center
            }
        }

        return waterTrapped;
    }

    public static void main(String[] args) {
        int[] height1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height1));  // Output: 6

        int[] height2 = {4,2,0,3,2,5};
        System.out.println(trap(height2));  // Output: 9
    }
}
