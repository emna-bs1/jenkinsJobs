import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorTest {

    double a = 2.5;
    double b = 7.12;

    Calculator calculator = new Calculator();

    @Test
    public void shouldPerformAddition() {
        System.out.println("running test 1: addition");
        Assertions.assertEquals(a + b, calculator.add(a, b),
                "Expected addition result did not match returned value");
    }

    @Test
    public void shouldPerformSubtraction() {
        System.out.println("running test 2: subtraction");
        Assertions.assertEquals(a - b, calculator.subtract(a, b),
                "Expected subtraction result did not match returned value");
    }


    @Test
    public void shouldPerformDivision() {
        System.out.println("running test 3: division");
        Assertions.assertEquals(a / b, calculator.divide(a, b),
                "Expected division result did not match returned value");
    }
}