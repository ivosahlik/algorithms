package cz.ivosahlik.interview.task.historian_hysteria_01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HistorianHysteriaTest {

    record TestCase(List<Integer> left, List<Integer> right, int expectedDistance) {}

    static Stream<TestCase> totalDistanceData() {
        return Stream.of(
                new TestCase(List.of(3, 4, 2, 1, 3, 3), List.of(4, 3, 5, 3, 9, 3), 11),
                new TestCase(List.of(1, 2, 3), List.of(1, 2, 3), 0),
                new TestCase(List.of(-3, -1, 2), List.of(0, -2, 1), 3),
                new TestCase(List.of(1), List.of(100), 99),
                new TestCase(List.of(5, 1), List.of(1, 5), 0)
        );
    }

    @ParameterizedTest
    @MethodSource("totalDistanceData")
    void totalDistance(TestCase tc) {
        assertEquals(tc.expectedDistance(), HistorianHysteria.totalDistance(tc.left(), tc.right()));
    }

    @Test
    void shouldThrowWhenLeftIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> HistorianHysteria.totalDistance(null, List.of(1)));
    }

    @Test
    void shouldThrowWhenRightIsEmpty() {
        assertThrows(IllegalArgumentException.class,
                () -> HistorianHysteria.totalDistance(List.of(1), List.of()));
    }
}
