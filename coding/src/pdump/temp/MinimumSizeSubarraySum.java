package pdump.temp;

public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        // Sliding window approach
        for (int right = 0; right < n; right++) {
            sum += nums[right];  // Expand the window by adding nums[right]

            // Shrink the window as small as possible while the sum is >= target
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];  // Shrink the window by removing nums[left]
                left++;
            }
        }

        // If minLength remains Integer.MAX_VALUE, no valid subarray was found
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        int target1 = 7;
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(target1, nums1));  // Output: 2

        int target2 = 4;
        int[] nums2 = {1, 4, 4};
        System.out.println(minSubArrayLen(target2, nums2));  // Output: 1

        int target3 = 11;
        int[] nums3 = {1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(minSubArrayLen(target3, nums3));  // Output: 0
    }
}
