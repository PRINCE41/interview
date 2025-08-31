package pdump.pnine;

public class SolutionTwo {

   // Create a Java function which takes an array of Integer and returns
    // second largest Integer value from the given array...
    // CONDITIONS...1. NO use of Stream API,
    // 2. No sorting of the given array, 3. No use of any in-built function

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,5,7,7};
        System.out.println(getSecondMax(arr));
    }

    private static int getSecondMax(int[] arr) {
        int secondmax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                secondmax = max;
                max = arr[i];
            } else if (arr[i] > secondmax) {
                if(arr[i] != max){
                    secondmax = arr[i];
                }

            }
        }

        return secondmax;
    }
}
