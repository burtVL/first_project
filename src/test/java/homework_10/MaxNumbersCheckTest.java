package homework_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MaxNumbersCheckTest extends MethodsForCheckTest{

    static Stream<Arguments> validArraysProvider() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 7),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{-3, -5, -7, -2}, -2)
        );
    }

    @ParameterizedTest
    @MethodSource("validArraysProvider")
    public void testFindMaxWithValidArrays(int[] numbers, int expected) {
        assertEquals(expected, methodsForCheck.findMax(numbers));
    }

    @Test
    public void testFindMaxWithEmptyArray() {
        assertThrows(NoSuchElementException.class, () -> methodsForCheck.findMax(new int[]{}));
    }
    @Test
    public void testFindMaxWithNullArray() {
        assertThrows(IllegalArgumentException.class, () -> methodsForCheck.findMax(null));
    }

}
