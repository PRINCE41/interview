package pfour;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Solutio {
    public static void main(String[] args) {
       /* Write a program to print all combination of the given String.

                Examples :

        String : ABC, Combinations : ABC, BCA, CAB, CBA, BAC, ACB

        String : ABCD, Combinations : ABCD ABDC ACBD ACDB ADBC ADCB BACD BADC BCAD BCDA BDAC BDCA CABD CADB CBAD CBDA CDAB CDBA DABC DACB DBAC DBCA DCAB DCBA*/

        String abc = "ABC";

        Set<String> result = new HashSet<>();
        char[] charArray = abc.toCharArray();
        for (int i = 0; i < abc.length()-1; i++) {
            for (int j = 0; j < abc.length(); j++) {

                swapNum(charArray, i+1, j);
                result.add(String.valueOf(charArray));
                swapNum(charArray,i+1, j);
            }
        }
        System.out.println(result);
    }

    private static void swapNum(char[] charArray, int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }
}
