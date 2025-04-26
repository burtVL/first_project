package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberFilterTest extends MethodsForCheckTest{

    private static Stream<Arguments> numberListsProvider() {
        return Stream.of(
                // Обычный список
                Arguments.of(List.of(1, 2, 3, 4, 5, 6), List.of(2, 4, 6)),
                // Список без чётных чисел
                Arguments.of(List.of(1, 3, 5), List.of()),
                // Пустой список
                Arguments.of(List.of(), List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("numberListsProvider")
    public void testFilterEvenNumbers(List<Integer> input, List<Integer> expectedOutput) {
        assertEquals(expectedOutput, methodsForCheck.filterEvenNumbers(input));
    }
}
