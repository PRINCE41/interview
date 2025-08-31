package pseven;

import java.util.Arrays;

//import static pdump.pten.GetMinimunSumOfSubArray.solution;

public class Sol {
    public static void main(String[] args) {
        // array {3,4,5,6,7,8,9}  start  = 1 and end index 4 //  reverse from end to start {3, 7,6,5,4,8,9}

        int[] arr = new int[]{3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(solution(arr, 1, 4)));


    }

    private static int[] solution(int[] arr, int start, int end) {

        for (int i = start; i < end; i++) {
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            end--;
        }
        return arr;
    }
}
