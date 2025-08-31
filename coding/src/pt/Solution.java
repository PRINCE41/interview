package pt;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Solution {
    public static void main(String[] args) {
        List<Integer> llist = List.of(1,2,3);
        Optional<Integer> max = llist.stream().max(Comparator.comparing(Integer::intValue));
        System.out.println(max.get());
    }
}
