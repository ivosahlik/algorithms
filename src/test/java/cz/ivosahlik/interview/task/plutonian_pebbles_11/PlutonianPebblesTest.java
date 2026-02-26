package cz.ivosahlik.interview.task.plutonian_pebbles_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlutonianPebblesTest {

    record TestCase(String input, int blinks, long expectedCount) {}

    static Stream<TestCase> countStonesData() {
        return Stream.of(
                new TestCase("0 1 10 99 999", 1, 7),
                new TestCase("125 17", 6, 22),
                new TestCase("125 17", 25, 55312),
                new TestCase("0", 1, 1),
                new TestCase("1000", 1, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("countStonesData")
    void countStones(TestCase tc) {
        assertEquals(tc.expectedCount(), PlutonianPebbles.countStones(tc.input(), tc.blinks()));
    }
}
