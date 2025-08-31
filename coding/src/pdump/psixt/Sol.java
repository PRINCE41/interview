package pdump.psixt;

public class Sol {

    // Array n size | 1-n | one is repeated | extra no

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,3,4};
        mergeSort(arr, 0, arr.length);

    }

    private static void mergeSort(int[] arr, int start, int end) {
        int mid = (end+start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
    }
}
