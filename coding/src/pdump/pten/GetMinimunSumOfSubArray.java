package pdump.pten;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GetMinimunSumOfSubArray {
    public static void main(String[] args) {
        List<Integer> list = List.of(3,2,3);
        System.out.println(solution(list));

        List<Integer> list2 = List.of(3,2,3,2,5,6);
        // 3,3,2,2,5 -> 1 + 1 + 2 + 2+ 3
        System.out.println(solution(list2));
    }

    private static long solution(List<Integer> list) {
        List<Long> list1 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).map(Map.Entry::getValue).toList();
        long result = 0l;
        long counter = 1l;
        for(Long num : list1){
            result = result + (counter*num);
            counter++;
        }
        return result;
    }
}
