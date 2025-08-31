package pdump.pfour;

import java.util.Arrays;

public class StringCompression {

    public static int compress(char[] chars) {
        int ans = 0; // keep track of current position in compressed array

        // iterate through input array using i pointer
        for (int i = 0; i < chars.length;) {
            final char letter = chars[i]; // current character being compressed
            int count = 0; // count of consecutive occurrences of letter

            // count consecutive occurrences of letter in input array
            while (i < chars.length && chars[i] == letter) {
                ++count;
                ++i;
            }

            // write letter to compressed array
            chars[ans++] = letter;

            // if count is greater than 1, write count as string to compressed array
            if (count > 1) {
                // convert count to string and iterate over each character in string
                for (final char c : String.valueOf(count).toCharArray()) {
                    chars[ans++] = c;
                }
            }
        }

        // return length of compressed array
        return ans;
    }

    public static void main(String[] args) {
        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength1 = compress(chars1);
        System.out.println(Arrays.toString(chars1));
        System.out.println("New Length: " + newLength1);  // Output: 6
        System.out.println("Compressed: " + new String(chars1, 0, newLength1));  // Output: a2b2c3

        char[] chars2 = {'a'};
        int newLength2 = compress(chars2);
        System.out.println("New Length: " + newLength2);  // Output: 1
        System.out.println("Compressed: " + new String(chars2, 0, newLength2));  // Output: a

        char[] chars3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        int newLength3 = compress(chars3);
        System.out.println("New Length: " + newLength3);  // Output: 4
        System.out.println("Compressed: " + new String(chars3, 0, newLength3));  // Output: ab12
    }
}
