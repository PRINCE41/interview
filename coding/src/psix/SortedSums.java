package psix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortedSums {

    static final int MOD = 1_000_000_007;

    // Fenwick Tree (Binary Indexed Tree) implementation for sum and count
    static class FenwickTree {
        int size;
        long[] tree;

        FenwickTree(int size) {
            this.size = size + 2; // +2 to prevent index out of bounds
            tree = new long[this.size];
        }

        void update(int index, long value) {
            while (index < size) {
                tree[index] = (tree[index] + value) % MOD;
                index += index & -index;
            }
        }

        long query(int index) {
            long result = 0;
            while (index > 0) {
                result = (result + tree[index]) % MOD;
                index -= index & -index;
            }
            return result;
        }
    }

    public static void main(String[] args) throws IOException {
        // Input reading
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[] a = new int[n];
        int[] temp = new int[n]; // For value compression

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine().trim());
            temp[i] = a[i];
        }

        // Value Compression
        Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));
        Map<Integer, Integer> valueToIndex = new HashMap<>();
        int idx = 1;
        for (int val : temp) {
            if (!valueToIndex.containsKey(val)) {
                valueToIndex.put(val, idx++);
            }
        }
        System.out.println(valueToIndex.entrySet());

        // Initialize Fenwick Trees
        FenwickTree countBIT = new FenwickTree(idx);
        FenwickTree sumBIT = new FenwickTree(idx);

        long S = 0; // Total S
        long s_i_sum = 0; // s_i_sum at each step
        long totalSum = 0; // Total sum of elements processed so far

        for (int i = 0; i < n; i++) {
            int val = a[i];
            System.out.println("val : " + val);
            int compressedIdx = valueToIndex.get(val);
            System.out.println("compressedIdx : " + compressedIdx);

            long cntLess = countBIT.query(compressedIdx - 1);
            System.out.println("cntLess : " + cntLess);
            long sumLess = sumBIT.query(compressedIdx - 1);
            System.out.println("sumLess : " + sumLess);

            long pos = cntLess + 1;
            System.out.println("pos : " + pos);
            long sumGreater = (totalSum - sumLess + MOD) % MOD;
            System.out.println("sumGreater : " + sumGreater);

            s_i_sum = (s_i_sum + val * pos + sumGreater) % MOD;
            System.out.println("s_i_sum : " + s_i_sum);
            S = (S + s_i_sum) % MOD;

            System.out.println("S : " + S);

            countBIT.update(compressedIdx, 1);
            sumBIT.update(compressedIdx, val);

            totalSum = (totalSum + val) % MOD;
            System.out.println("totalSum : " + totalSum);
        }

        System.out.println(S);
    }
}
