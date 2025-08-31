package pdump.ptwo;

import java.util.List;
import java.util.stream.Collectors;

public class POne {
    //10,23,21,1,3,56,78,88,98,45,3,2
    // 10, 56,78,88,98,2
    //

/*    1. Filter the even nos
2. Sort in Reverse order
3. Double the numbers in the list
4. Group by <50*/

    public static void main(String[] args) {
        List<Integer> list = List.of(10,23,21,1,3,56,78,88,98,45,3,2);
        List<Integer> collect = list.stream().filter(num -> num % 2 == 0)
                .sorted((num1, num2) -> num2.compareTo(num1))
                .map(num -> num * 2)
                .filter(num -> num < 50)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
