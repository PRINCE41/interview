package pseven;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
    // Word and Frequency   : Java is good language and Java is easy to learn.
    //

    public static void main(String[] args) {
        String s = "Java is good language and Java is easy to learn";
        String[] words = s.toLowerCase().split("\\s+");
   /*     Map<String, Long> collect = Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(), Collectors.counting(), TreeMap::new));

        Collections.sort(collect, );
        Map<String, Long> sorted = collect.entrySet().stream().sorted((entry1, entry2) -> entry2.getKey().compareTo(entry1.getKey())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        Map<String, Long> sorted = collect.entrySet().stream().collect(Collectors.toCollection(TreeMap::new));

        System.out.println(sorted.entrySet());*/

        TreeMap<String, Integer> sortedmap = new TreeMap<>();
        for (String word : words){
            if(sortedmap.containsKey(word)){
                sortedmap.put(word, sortedmap.get(word) +1);
            }else{
                sortedmap.put(word,1);
            }

        }
        System.out.println(sortedmap);
    }
}
