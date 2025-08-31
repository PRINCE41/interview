package pdump.pfour;

import java.util.*;
import java.util.stream.Collectors;

public class AverageScores {

    public static Map<String, Integer> findAverageScores(String[][] scores) {
        return Arrays.stream(scores)
                .collect(Collectors.groupingBy(
                        entry -> entry[0],  // Group by student name
                        Collectors.collectingAndThen(
                                Collectors.mapping(
                                        entry -> Integer.parseInt(entry[1]), 
                                        Collectors.teeing(
                                            Collectors.summingInt(Integer::intValue),
                                            Collectors.counting(),
                                            (sum, count) -> (int) (sum / count)
                                        )
                                ),
                                Integer::intValue
                        )
                ));
    }

    public static Map<Integer, Integer> findAverageScores(int[][] scores) {
        Map<Integer, Integer> collect = Arrays.stream(scores)
                .collect(Collectors.groupingBy(
                        entry -> entry[0],  // Group by student name
                        Collectors.collectingAndThen(
                                Collectors.mapping(
                                        entry -> entry[1],
                                        Collectors.teeing(
                                                Collectors.summingInt(Integer::intValue),
                                                Collectors.counting(),
                                                (sum, count) -> (int) (sum / count)
                                        )
                                ),
                                Integer::intValue
                        )
                ));

        return collect;
    }

    public static void main(String[] args) {
        //String[][] scores = {{"Ram", "100"}, {"Shyam", "90"}, {"Ram", "70"}};
        int[][] scores = {{1, 100}, {2, 90}, {1, 70}};
        Map<Integer, Integer> averageScores = findAverageScores(scores);
        System.out.println(averageScores);  // Output: {Shyam=90, Ram=85}
    }
}
