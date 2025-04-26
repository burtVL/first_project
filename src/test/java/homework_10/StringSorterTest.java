package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringSorterTest extends MethodsForCheckTest{

    private static Stream<Arguments> stringListsProvider() {
        return Stream.of(
                // Обычный список с разными длинами
                Arguments.of(List.of("Java", "C", "Python"), List.of("C", "Java", "Python")),

                // Список с одинаковыми длинами
                Arguments.of(List.of("aa", "bb", "cc"), List.of("aa", "bb", "cc")),

                // Пустой список
                Arguments.of(List.of(), List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("stringListsProvider")
    public void testSortByLength(List<String> input, List<String> expectedOutput) {
        assertEquals(expectedOutput, methodsForCheck.sortByLength(input));
    }
}
