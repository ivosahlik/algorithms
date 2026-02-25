package cz.ivosahlik.interview.task.mull_it_over_03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MullItOverTest {

    @Test
    @DisplayName("Should calculate correct sum from example")
    void shouldCalculateCorrectSum() {
        String input = "xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))";
        assertEquals(161, MullItOver.sumMultiplications(input));
    }

    @Test
    @DisplayName("Should return 0 when no valid mul instructions exist")
    void shouldReturnZeroWhenNoMatches() {
        String input = "abc mul(4* ??? mul[3,7] nothing valid";
        assertEquals(0, MullItOver.sumMultiplications(input));
    }

    @Test
    @DisplayName("Should throw exception when input is null")
    void shouldThrowWhenInputIsNull() {
        assertThrows(IllegalArgumentException.class, () -> MullItOver.sumMultiplications(null));
    }

    @Test
    @DisplayName("Should throw exception when input is empty")
    void shouldThrowWhenInputIsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> MullItOver.sumMultiplications(""));
    }

    @Test
    @DisplayName("Should handle multiple valid mul instructions")
    void shouldHandleMultipleValidMatches() {
        String input = "mul(1,2)mul(3,4)mul(5,6)mul(1,2]mul[3,4)mul[5,6]";
        assertEquals(44, MullItOver.sumMultiplications(input));
    }
}