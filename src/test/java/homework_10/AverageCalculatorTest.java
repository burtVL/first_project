package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AverageCalculatorTest extends MethodsForCheckTest{
    private static Stream<Arguments> validArraysProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 3.0),
                Arguments.of(new int[]{10}, 10.0),
                Arguments.of(new int[]{-5, 0, 5}, 0.0),
                Arguments.of(new int[]{2, 4, 6, 8}, 5.0)
        );
    }
    @ParameterizedTest
    @MethodSource("validArraysProvider")
    public void testFindAverage_ValidArrays(int[] numbers, double expected) {
        assertEquals(expected, methodsForCheck.findAverage(numbers));
    }
    @ParameterizedTest
    @EmptySource
    public void testFindAverage_EmptyArray(int[] emptyArray) {
        assertThrows(NoSuchElementException.class, () -> methodsForCheck.findAverage(emptyArray));
    }
}
