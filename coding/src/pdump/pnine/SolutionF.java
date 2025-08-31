package pdump.pnine;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SolutionF {
    public static void main(String[] args) {
        //manchesterunited  :

        String s = "manchesterunited";
        System.out.println(extracted(s));


    }

    private static  Map.Entry  extracted(String s) {
        Map<Character, List<Integer>> result = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(result.containsKey(c)){
                List<Integer> integers = result.get(c);
                integers.add(i);
                result.put(c, integers);
            }else{
                result.put(c, new ArrayList<>());
                List<Integer> integers = result.get(c);
                integers.add(i);
                result.put(c, integers);
            }
        }

        for (Map.Entry<Character,List<Integer>> entry : result.entrySet()) {
            if(entry.getValue().size() >=2){
                return entry;


            }
        }

        return Map.entry(0,0);
    }
}
