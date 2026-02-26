package cz.ivosahlik.interview.task.plutonian_pebbles_11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PlutonianPebbles {

    public static final int INT_NUMBER = 2024;

    public static long countStones(String input, int blinks) {
        long start = System.nanoTime();
        Map<Long, Long> stones =
                Arrays.stream(input.split(" "))
                        .map(Long::parseLong)
                        .collect(Collectors.toMap(
                                Function.identity(),
                                v -> 1L,
                                Long::sum,
                                HashMap::new
                        ));

        for (int i = 0; i < blinks; i++) {
            Map<Long, Long> next = new HashMap<>();
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

        // Five stones -> 1 2024 1 0 9 9 2021976
        // In picture HashMap.png, you can see 0 1 202976 2024 9, it seems, that it is different... hashmap
        // show you that there is 1 - 2x, 8 - 2x, such count numbers is the same as in example, but ordering is different,
        // because the aim of task is performance.
        long sum = stones.values()
                .stream()
                .mapToLong(Long::longValue)
                .sum();

        long end = System.nanoTime();
        System.out.println("Čas: " + (end - start) / 1_000_000.0 + " ms");

        return sum;
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