package cz.ivosahlik.interview.task.historian_hysteria_01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class HistorianHysteriaWithoutStreamTest {

    static Stream<Arguments> totalDistanceProvider() {
        return Stream.of(
                Arguments.of(new int[]{3, 4, 2, 1, 3, 3}, new int[]{4, 3, 5, 3, 9, 3}, 11),
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 2, 3}, 0),
                Arguments.of(new int[]{5}, new int[]{1}, 4),
                Arguments.of(new int[]{1, 3, 5}, new int[]{2, 4, 6}, 3),
                Arguments.of(new int[]{5, 3, 1}, new int[]{6, 4, 2}, 3)
        );
    }

    static Stream<Arguments> totalDistanceInvalidProvider() {
        return Stream.of(
                Arguments.of(null, new int[]{1, 2}, "Left or right array is null"),
                Arguments.of(new int[]{1, 2}, null, "Left or right array is null"),
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 2}, "Count values in left and right must be equal")
        );
    }

    @ParameterizedTest
    @MethodSource("totalDistanceProvider")
    void totalDistance(int[] left, int[] right, int expectedDistance) {
        assertEquals(expectedDistance, HistorianHysteriaWithoutStream.totalDistance(left, right));
    }

    @ParameterizedTest
    @MethodSource("totalDistanceInvalidProvider")
    void totalDistanceThrowsOnInvalidInput(int[] left, int[] right, String expectedMessage) {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> HistorianHysteriaWithoutStream.totalDistance(left, right)
        );
        assertEquals(expectedMessage, ex.getMessage());
    }
}
