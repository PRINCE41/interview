package pdump.pnine;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {

    /*Write a Java static function which will accept a list of Integer and it will return only non-repeatable numbers from the given a list of Integer .

            INPUT - 2,1,2,4,1,2,3,2
    OUTPUT - 4,3*/

    public static void main(String[] args) {
        List<Integer> list = List.of(2,1,2,4,1,2,3,2);
        System.out.println(getNonRepetiting(list));
    }

    private static List<Integer> getNonRepetiting(List<Integer> list) {
        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
         return collect.entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey()).collect(Collectors.toList());

    }
}
