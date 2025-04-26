package homework_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StringReverseTest extends MethodsForCheckTest{

    @ParameterizedTest
    @CsvSource({
            "hello, olleh",
            "Java, avaJ",
            "a, a",
            "12345, 54321"
    })
    public void testReverseMultipleCases(String input, String expected){
        assertEquals(expected, methodsForCheck.reverse(input));
    }

    @Test
    public void testReverseNullInput() {
        assertNull(methodsForCheck.reverse(null));
    }

    @Test
    public void testEmptyString(){
        String emptyString = "";
        assertEquals(emptyString, methodsForCheck.reverse(""));
    }
}
