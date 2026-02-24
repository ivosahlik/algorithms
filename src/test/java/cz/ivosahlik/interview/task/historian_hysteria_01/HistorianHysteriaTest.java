package cz.ivosahlik.interview.task.historian_hysteria_01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HistorianHysteriaTest {
    @Test
    void shouldCalculateTotalDistance_exampleFromTask() {
        List<Integer> left = Arrays.asList(3,4,2,1,3,3);
        List<Integer> right = Arrays.asList(4,3,5,3,9,3);
        assertEquals(11, HistorianHysteria.totalDistance(left, right));
    }

    @Test
    void shouldReturnZeroWhenListsAreIdentical() {
        List<Integer> left = Arrays.asList(1,2,3);
        List<Integer> right = Arrays.asList(1,2,3);
        assertEquals(0, HistorianHysteria.totalDistance(left, right));
    }

    @Test
    void shouldWorkWithNegativeNumbers() {
        List<Integer> left = Arrays.asList(-3, -1, 2);
        List<Integer> right = Arrays.asList(0, -2, 1);
        assertEquals(3, HistorianHysteria.totalDistance(left, right));
    }
}