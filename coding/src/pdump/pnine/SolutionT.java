package pdump.pnine;

import java.util.Arrays;

public class SolutionT {

    public static void main(String[] args) {
        Integer[] intArray = {1, 8, 13, 55, 65, 32, 99, 49, 78, 26};
        Arrays.sort(intArray);
        System.out.println(findNumbers(intArray,65));
    }

    //Integer[] intArray = {1, 8, 13, 55, 65, 32, 99, 49, 78, 26};

    public static int  findNumbers(Integer[] intArray, Integer target) {
        System.out.println(Arrays.toString(intArray));
       if(intArray == null) return -1;
       int low = 0;
       int high = intArray.length -1;
        System.out.println(low + " " + high);
       while(low < high){
           int mid = (low+high+1)/2;
           System.out.println(mid + "$$");
           if(intArray[mid] > target){
               low = mid;
           } else if (intArray[mid] < target) {
               high = mid;
           }else {
               return 1;
           }
       }
       return -1;
    }
}
