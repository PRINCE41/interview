public class Sol {

  /*  find maximum length of subarray having given sum.
    array: { 5, 6, -5, 5, 3, 5, 3, -2, 0 }
    array: { 5, 1, 4, -2, 5, 3, 5, 3, -2, 0 }
    4,5
    sum: 8

    Answer 2*/

    public static void main(String[] args) {
        int[] nums = new int[]{ 5, 1, 4, -2, 5, 3, 5, 3, -2, 0 };
        int maxLength = 0;
        //int length  = 0;
        int left  = 0;
        int sum = 0;
        int target = 8;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if(sum > target){
                sum = sum - nums[left];
                left++;
            }else if(sum == target){
                maxLength = Math.max(maxLength, i - left - 1);
            }

            System.out.println("iteration " + i + "sum" + sum + "left" + left);
        }

        System.out.println(maxLength);
    }

    //

}
