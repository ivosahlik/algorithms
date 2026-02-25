package cz.ivosahlik.interview.task.red_nosed_reports_02;

import java.util.Arrays;

public class RedNosedReports {
    public static boolean isSafe(int[] levels) {
        if (levels.length < 2) {
            System.out.println("Report cannot be calculated, add values to array!!!");
            throw new IllegalArgumentException("Report cannot be calculated, add values to array!!!");
        }
        int firstDiff = levels[1] - levels[0];
        if (firstDiff == 0 || Math.abs(firstDiff) > 3) {
            return false;
        }
        boolean increasing = firstDiff > 0;
        for (int i = 1; i < levels.length; i++) {
            int diff = levels[i] - levels[i - 1];
            if (diff == 0 || Math.abs(diff) > 3) {
                return false;
            }
            if (increasing && diff < 0) {
                return false;
            }
            if (!increasing && diff > 0) {
                return false;
            }
        }

        return true;
    }

    static void main(String[] args) {
        int[][] reports = new int[][]{
                {7, 6, 4, 2, 1},
                {1, 2, 7, 8, 9},
                {9, 7, 6, 2, 1},
                {1, 3, 2, 4, 5},
                {8, 6, 4, 4, 1},
                {1, 3, 6, 7, 9}
        };
        Arrays.stream(reports)
                .map(report -> Arrays.toString(report) + " -> " + saveResult(report))
                .forEach(System.out::println);
    }

    private static String saveResult(int[] report) {
        return isSafe(report) ? StateEnum.SAFE.getState() : StateEnum.UN_SAFE.getState();
    }
}

enum StateEnum {
    SAFE("Safe"),
    UN_SAFE("Unsafe");

    private final String state;

    StateEnum(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}