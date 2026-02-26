package cz.ivosahlik.interview.task.mull_it_over_03;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MullItOverTest {

    record TestCase(String input, int expectedSum) {}

    static Stream<TestCase> sumMultiplicationsData() {
        return Stream.of(
                new TestCase("xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))", 161),
                new TestCase("abc mul(4* ??? mul[3,7] nothing valid", 0),
                new TestCase("mul(1,2)mul(3,4)mul(5,6)mul(1,2]mul[3,4)mul[5,6]", 44),
                new TestCase("mul(1,1)", 1),
                new TestCase("mul(999,999)", 998001)
        );
    }

    @ParameterizedTest
    @MethodSource("sumMultiplicationsData")
    void sumMultiplications(TestCase tc) {
        assertEquals(tc.expectedSum(), MullItOver.sumMultiplications(tc.input()));
    }

    @Test
    void shouldThrowWhenInputIsNull() {
        assertThrows(IllegalArgumentException.class, () -> MullItOver.sumMultiplications(null));
    }

    @Test
    void shouldThrowWhenInputIsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> MullItOver.sumMultiplications(""));
    }
}
