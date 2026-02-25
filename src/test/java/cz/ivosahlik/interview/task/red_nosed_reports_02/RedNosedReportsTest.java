package cz.ivosahlik.interview.task.red_nosed_reports_02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RedNosedReportsTest {

    record TestCase(int[] levels, boolean expectedSafe) {}

    @Test
    void shouldThrowExceptionWhenOnlyOneValue() {
        int[] input = {7};

        assertThrows(IllegalArgumentException.class, () ->
                RedNosedReports.isSafe(input)
        );
    }

    static Stream<TestCase> isSafeData() {
        return Stream.of(
                new TestCase(new int[]{7, 6, 4, 2, 1}, true),
                new TestCase(new int[]{1, 2, 7, 8, 9}, false),
                new TestCase(new int[]{9, 7, 6, 2, 1}, false),
                new TestCase(new int[]{1, 3, 2, 4, 5}, false),
                new TestCase(new int[]{8, 6, 4, 4, 1}, false),
                new TestCase(new int[]{1, 3, 6, 7, 9}, true),
                new TestCase(new int[]{1, 2, 3, 4, 5, 6, 7, 9, 10}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("isSafeData")
    void isSafe(TestCase tc) {
        assertEquals(tc.expectedSafe(), RedNosedReports.isSafe(tc.levels()));
    }
}