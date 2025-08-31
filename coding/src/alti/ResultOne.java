package alti;

import java.util.*;

class ResultOne {

    // Merge two halves into a sorted array
    public static void merge(List<Integer> arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create pdump.temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to pdump.temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr.get(left + i);
        for (int j = 0; j < n2; ++j)
            R[j] = arr.get(mid + 1 + j);

        // Merge the pdump.temp arrays

        int i = 0, j = 0;

        // Initial index of merged subarray
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr.set(k, L[i]);
                i++;
            } else {
                arr.set(k, R[j]);
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr.set(k, L[i]);
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr.set(k, R[j]);
            j++;
            k++;
        }
    }

    // Main function that sorts arr[left...right] using merge()
    public static void mergeSort(List<Integer> arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Function to be completed
    public static List<Integer> sort(List<Integer> toSortArray) {
        mergeSort(toSortArray, 0, toSortArray.size() - 1);
        return toSortArray;  // Return the sorted list
    }

    // Main method to test the sort function
    public static void main(String[] args) {
        // Test the sorting function
        List<Integer> numbers = Arrays.asList(38, 27, 43, 3, 9, 82, 10);
        
        System.out.println("Before Sorting: " + numbers);

        List<Integer> sortedNumbers = sort(new ArrayList<>(numbers)); // Using ArrayList to make it mutable

        System.out.println("After Sorting: " + sortedNumbers);
    }
}
