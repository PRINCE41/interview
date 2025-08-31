package pTwo;

import java.util.Arrays;

public class Sol {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,2,4,-1,1};

        System.out.println(extracted(arr));
    }

    private static int extracted(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(sum - arr[i] - temp == temp){
                return i;
            }
            temp = temp+ arr[i];
        }
        return -1;
    }
}
