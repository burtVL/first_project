package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramTest extends MethodsForCheckTest{
    private static Stream<Arguments> anagramTestCases() {
        return Stream.of(
                // Проверка анаграмм
                Arguments.of("listen", "silent", true),

                // Проверка не анаграмм
                Arguments.of("java", "python", false),

                // Проверка null
                Arguments.of(null, "word", false),
                Arguments.of("word", null, false),
                Arguments.of(null, null, false)
        );
    }

    @ParameterizedTest
    @MethodSource("anagramTestCases")
    public void testIsAnagram(String str1, String str2, boolean expected) {
        assertEquals(expected, methodsForCheck.isAnagram(str1, str2));
    }
}
