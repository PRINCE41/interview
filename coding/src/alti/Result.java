package alti;

import java.util.*;

class Result {

    public static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr.get(j) < pivot) {
                i++;
                Collections.swap(arr, i, j);
            }
        }
        Collections.swap(arr, i + 1, high);
        return i + 1;
    }

    public static void quickSort(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static List<Integer> sort(List<Integer> toSortArray) {
        quickSort(toSortArray, 0, toSortArray.size() - 1);
        return toSortArray;
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
