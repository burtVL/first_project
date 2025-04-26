package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GCDTest extends MethodsForCheckTest{
    @ParameterizedTest
    @CsvSource({
            "24, 36, 12",   // Обычные числа
            "101, 103, 1",  // Простые числа
            "0, 10, 10"     // Нулевое значение
    })
    public void testGcd(int a, int b, int expected) {
        assertEquals(expected, methodsForCheck.gcd(a, b));
    }
}
