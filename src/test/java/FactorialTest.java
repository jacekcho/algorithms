import org.fest.assertions.Assertions;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void shouldGetProperFactorialForFive() {
        // when
        int factorial = new Factorial().getFactorial(5);

        // then
        Assertions.assertThat(factorial).isEqualTo(120);
    }

    @Test
    public void shouldGetProperFactorialForZero() {
        // when
        int factorial = new Factorial().getFactorial(0);

        // then
        Assertions.assertThat(factorial).isEqualTo(1);
    }

    @Test(expected = NumberFormatException.class)
    public void shouldGetAnExceptionForNumberLessThanZero() {
        // when
        new Factorial().getFactorial(-1);

        // then
        // NumberFormatException
    }

}
