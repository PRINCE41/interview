package pdump.pone;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PThree {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,2,3,5,3,6,4,10,11,2);

        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.entrySet().stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).forEach(System.out::println);
    }
}
