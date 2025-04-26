package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonValidatorTest extends MethodsForCheckTest{
    private static Stream<Arguments> jsonTestCases() {
        return Stream.of(
                Arguments.of("{\"key\":\"value\"}", true),  // Корректный JSON
                Arguments.of("invalid json", false),        // Некорректный JSON
                Arguments.of(null, false)                   // null строка
        );
    }

    @ParameterizedTest
    @MethodSource("jsonTestCases")
    public void testIsValidJson(String json, boolean expected) {
        assertEquals(expected, methodsForCheck.isValidJson(json));
    }

}
