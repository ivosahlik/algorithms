package cz.ivosahlik.interview.task.plutonian_pebbles_11;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PlutonianPebbles {

    public static final int INT_NUMBER = 2024;

    public static long countStones(String input, int blinks) {

        Map<Long, Long> stones = Arrays.stream(input.split(" "))
                .map(Long::parseLong)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        for (int i = 0; i < blinks; i++) {
            Map<Long, Long> next = new LinkedHashMap<>();
            stones.forEach((key, val) -> {
                if (key == 0) {
                    next.merge(1L, val, Long::sum);
                } else {
                    String s = Long.toString(key);
                    if (s.length() % 2 == 0) {
                        int mid = s.length() / 2;

                        long left = Long.parseLong(s.substring(0, mid));
                        long right = Long.parseLong(s.substring(mid));

                        next.merge(left, val, Long::sum);
                        next.merge(right, val, Long::sum);
                    } else {
                        next.merge(key * INT_NUMBER, val, Long::sum);
                    }
                }
            });
            stones = next;
        }

        return stones.values()
                .stream()
                .mapToLong(Long::longValue)
                .sum();
    }

    static void main(String[] args) {

        // Example 1
        String input1 = "0 1 10 99 999";
        int blinks1 = 1;
        System.out.println("Počet kamenů po " + blinks1 + " mrknutí je " + countStones(input1, blinks1));
        System.out.println("----------------------------------");

        // Example 2
        String input2 = "125 17";
        int blinks2 = 6;
        System.out.println("Počet kamenů po " + blinks2 + " mrknutí je " + countStones(input2, blinks2));
        System.out.println("----------------------------------");

        // Example 3
        String input3 = "125 17";
        int blinks3 = 25;
        System.out.println("Počet kamenů po " + blinks3 + " mrknutí je " + countStones(input3, blinks3));
    }

}