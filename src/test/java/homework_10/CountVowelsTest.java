package homework_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountVowelsTest extends MethodsForCheckTest{

    private static Stream<Arguments> provideStringsWithVowels() {
        return Stream.of(
                Arguments.of("hello", 2),
                Arguments.of("java", 2),
                Arguments.of("AEIOU", 5),
                Arguments.of("", 0),
                Arguments.of("bcdfg", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideStringsWithVowels")
    public void countVowelsShouldReturnCorrectCount(String input, int expected){
        assertEquals(expected, methodsForCheck.countVowels(input));
    }

    @Test
    public void countVowelsShouldThrowExceptionForNullInput(){
        assertThrows(IllegalArgumentException.class, ()->{
            methodsForCheck.countVowels(null);
        }, "Input cannot be nul"
        );
    }
}
