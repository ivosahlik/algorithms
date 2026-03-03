package cz.ivosahlik.interview.task.historian_hysteria_01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class HistorianHysteriaWithoutStream {
    public static int totalDistance(int[] left, int[] right) {
        long start = System.nanoTime();

        Arrays.sort(left);
        Arrays.sort(right);

        // int sum = IntStream.range(0, left.length).map(i -> Math.abs(right[i] - left[i])).sum(); // Slower

        int sum = 0;
        for (int i = 0; i < left.length; i++) {
            sum += Math.abs(right[i] - left[i]);
        }

        System.out.println("Čas: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");

        return sum;
    }

    static void main(String[] args) {
        // I took dataset from section `For Example`. There is not attached any file with large dataset like is by description.

        int[] left = {3, 4, 2, 1, 3, 3};
        int[]  right = {4, 3, 5, 3, 9, 3};

        System.out.println(totalDistance(left, right));
    }
}