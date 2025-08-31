package pdump.ptwo;

import java.util.Arrays;



public class Pthtee {

   /* Shift negative elements to the left of the array
    int[] array = {4,-3,8,9,-1,5,2,-10,-11,45};
    expected output: {-3,-1,-10,-11,4,8,9,5,2,45};

1. don't sort the array
            2. don't declare new array or collections
            3. don't use any library function*/

    public static void main(String[] args) {
        int[] arr = new int[]{4,-3,8,9,-1,5,2,-10,-11,45};
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            if(arr[left] > 0 ){
                if(arr[right] >0){
                    right--;}
                else{
                    int temp = arr[right];
                    arr[right] = arr[left];
                    arr[left] = temp;
                }

            }else{
                left++;
            }
        }

        System.out.println(Arrays.toString(arr));

        System.out.println(binarySearchC(arr,0, arr.length, 46));
    }

    private static boolean binarySearchC(int[] arr,int start, int end, int i) {
        int mid = (end+start)/2;

        if(arr[mid] == i) return true;
        if(i > arr[mid]){
            start = mid;
            binarySearchC(arr, start,end, i);
        }else if(i < arr[mid]){
            end = mid;
            binarySearchC(arr, start, end, i);
        }

        return false;
    }
}

/*[4,-3,1]
0, 2
arr[0] = 4*/
