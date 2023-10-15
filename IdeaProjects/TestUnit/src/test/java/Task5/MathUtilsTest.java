package Task5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {

    public void testMultiply(int a, int b, int expectedResult) {
        int result = MathUtils.multiply(a, b);
        assertEquals(expectedResult, result, "Некорректное умножение");
    }
}