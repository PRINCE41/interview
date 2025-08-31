package pdump.pelev;

import java.util.ArrayList;
import java.util.List;

public class Solution {

   // Write a method to find all permutations of a given string. For example, for the string "abc", the permutations should be
    // ["abc", "acb", "bac", "bca", "cab", "cba"].

    // abcd
   public static void main(String[] args) {
       String s = "abc";
       System.out.println(allArrangements(s));
   }

    private static List<String> allArrangements(String s) {
       if(s.length() == 1) return List.of(s);
       List<String> result = new ArrayList<>();
       for(int i = 0; i < s.length();i++){
           StringBuilder temp = new StringBuilder();
           String temp1 = s.substring(0,i) + s.substring(i+1,s.length());
           System.out.println(temp1);
           List<String> tr = allArrangements(temp1);
           System.out.println(tr);

           for(String st : tr){
               temp.append(s.charAt(i) + st);
               result.add(temp.toString());
           }

           //pdump.temp.append(s.charAt(i));

       }

       return result;
    }


}
