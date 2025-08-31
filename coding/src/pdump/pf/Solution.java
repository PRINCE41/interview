package pdump.pf;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // map -> Integer, Object-> one,two,three, four,five
        Map<Integer, Custom> map = new HashMap<>();
        map.put(1, new Custom("a","b","c","d","e"));
        Map<String, Custom> collect = map.entrySet().stream().collect(Collectors.toMap(entry -> {
            Custom custom = entry.getValue();
            return custom.one() + custom.two() + custom.three() + custom.four() + custom.five();
        }, entry -> entry.getValue()));

        System.out.println(collect);
        //for ()
    }


}
