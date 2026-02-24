package cz.ivosahlik.interview.task.historian_hysteria_01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class HistorianHysteria {
    public static int totalDistance(List<Integer> left, List<Integer> right) {
        if (left == null || left.isEmpty() ||
                right == null || right.isEmpty()) {
            throw new IllegalArgumentException("Put left or right dataset!!");
        }
        List<Integer> sortedLeft = left.stream().sorted().toList();
        List<Integer> sortedRight = right.stream().sorted().toList();

        return IntStream.range(0, left.size())
                .map(i -> Math.abs(sortedLeft.get(i) - sortedRight.get(i)))
                .sum();
    }

    static void main(String[] args) {
        // I took dataset from section `For Example`. There is not attached any file with large dataset like is by description.
        List<Integer> left = Arrays.asList(3, 4, 2, 1, 3, 3);
        List<Integer> right = Arrays.asList(4, 3, 5, 3, 9, 3);

        System.out.println(totalDistance(left, right));
    }
}