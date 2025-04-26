package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicatesCheckerTest extends MethodsForCheckTest{
    private static Stream<Arguments> arrayTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, false),  // Массив без дубликатов
                Arguments.of(new int[]{1, 2, 2, 3}, true),      // Массив с дубликатами
                Arguments.of(new int[]{}, false)                // Пустой массив
        );
    }

    @ParameterizedTest
    @MethodSource("arrayTestCases")
    public void testHasDuplicates(int[] numbers, boolean expected) {
        assertEquals(expected, methodsForCheck.hasDuplicates(numbers));
    }
}
