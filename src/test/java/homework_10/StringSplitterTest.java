package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StringSplitterTest extends MethodsForCheckTest{
    private static Stream<Arguments> splitTestCases() {
        return Stream.of(
                Arguments.of("Java,Python,C++", ",", new String[]{"Java", "Python", "C++"}),
                Arguments.of("", ",", new String[]{""}),
                Arguments.of("word", ",", new String[]{"word"})
        );
    }
    @ParameterizedTest
    @MethodSource("splitTestCases")
    public void testSplitString(String input, String delimiter, String[] expected) {
        assertArrayEquals(expected, methodsForCheck.splitString(input, delimiter));
    }
}
