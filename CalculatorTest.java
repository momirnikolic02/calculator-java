import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSimpleAddition() {
        String result = Calculator.Run("2+3");
        assertEquals("5", result);
    }

    @Test
    public void testOperatorPriority() {
        String result = Calculator.Run("2+3*4");
        assertEquals("14", result);
    }

    @Test
    public void testWithNegativeNumber() {
        String result = Calculator.Run("-5+3");
        assertEquals("-2", result);
    }

    @Test
    public void testDivision() {
        String result = Calculator.Run("10/2");
        assertEquals("5", result);
    }

    @Test
    public void testCombinedExpression() {
        String result = Calculator.Run("10+2*5-3");
        assertEquals("17", result);
    }
}
