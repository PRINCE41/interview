package pdump.pten;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SolutionTwo {
    // Array (4,3,1,3,2,4,1)
    public static void main(String[] args) {
        List<Integer> list = List.of(4,3,-1,-3,2,-4,1);
        //System.out.println(getUnique(list));
        System.out.println(getUnique2(list));
    }

    private static List<Integer> getUnique2(List<Integer> list) {
        Map<Integer, Long> map = new HashMap<>();
        for(Integer num : list){
            int abs = Math.abs(num);
            if(map.containsKey(abs)){
                map.put(abs, map.get(abs) +1);
            }else{
                map.put(abs,1l);
            }
        }

        return map.entrySet().stream().filter(entry -> entry.getValue() ==1).map(Map.Entry::getKey).collect(Collectors.toList());
    }

    private static List<Integer> getUnique(List<Integer> list) {
        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return collect.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
    }
}
