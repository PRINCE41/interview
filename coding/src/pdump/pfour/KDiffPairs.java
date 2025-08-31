package pdump.pfour;

import java.util.HashMap;
import java.util.Map;

public class KDiffPairs {

    public static int findPairs(int[] nums, int k) {
        if (k < 0) return 0;  // No valid pairs if k is negative
        
        Map<Integer, Integer> map = new HashMap<>();

        int count = 0;

        
        // Count frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map.entrySet());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            if (k == 0) {
                // For k = 0, we need at least two occurrences of the same number
                if (entry.getValue() > 1) {
                    count++;
                }
            } else {
                // For k > 0, check if num + k exists
                if (map.containsKey(num + k)) {
                    count++;
                }
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 1, 4, 1, 5};
        System.out.println(findPairs(nums1, 2));  // Output: 2

        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(findPairs(nums2, 1));  // Output: 4

        int[] nums3 = {1, 3, 1, 5, 4};
        System.out.println(findPairs(nums3, 0));  // Output: 1
    }
}
