package homework_10;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringLengthMapperTest extends MethodsForCheckTest{
    @Test
    public void testMapToLengths_NormalList() {
        List<String> input = List.of("Java", "C++", "Go");
        List<Integer> expected = List.of(4, 3, 2);
        assertEquals(expected, methodsForCheck.mapToLengths(input));
    }

    @Test
    public void testMapToLengths_EmptyList() {
        List<String> input = List.of();
        List<Integer> expected = List.of();
        assertEquals(expected, methodsForCheck.mapToLengths(input));
    }
}
