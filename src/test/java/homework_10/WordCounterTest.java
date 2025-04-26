package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WordCounterTest extends MethodsForCheckTest{
    private static Stream<Arguments> validSentencesProvider() {
        return Stream.of(
                Arguments.of("Hello world", 2),           // Обычная строка
                Arguments.of("Java  is awesome  ", 3), // Лишние пробелы
                Arguments.of("", 0),                     // Пустая строка
                Arguments.of("    ", 0)                   // Только пробелы
        );
    }

    @ParameterizedTest
    @MethodSource("validSentencesProvider")
    public void testCountWordsValidInputs(String sentence, int expectedCount) {
        assertEquals(expectedCount, methodsForCheck.countWords(sentence));
    }


    @ParameterizedTest
    @NullSource
    public void testCountWordsNullInput(String nullInput) {
        assertThrows(IllegalArgumentException.class, () -> methodsForCheck.countWords(nullInput));
    }
}
