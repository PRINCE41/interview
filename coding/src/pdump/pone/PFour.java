package pdump.pone;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PFour {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,11,23,14,51,16,101);
        List<Integer> collect = list.stream().filter(num -> String.valueOf(num).charAt(0) == '1').collect(Collectors.toList());
        System.out.println(collect);

        //Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //collect.entrySet().stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).forEach(System.out::println);
    }
}
