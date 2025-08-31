package pdump.pthree;

import java.util.Arrays;

public class Pone {

   /* Q) Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.


    Example 1:

    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]*/
   public static void main(String[] args) {
       int[] nums = new int[]{0,1,0,3,12};

       int start =0;

       for(int i = 0; i < nums.length; i++){
          if(nums[i] != 0){
              nums[start++] = nums[i];
          }
       }

       while (start < nums.length){
           nums[start] = 0;
           start++;
       }

       System.out.println(Arrays.toString(nums));
   }

   // start 1  | 0

}


