import org.fest.assertions.Assertions;
import org.junit.Test;

import java.util.ArrayList;

public class FibonacciTest {

    @Test
    public void shouldGetProperListForSevenNumbers() {
        // when
        ArrayList<Integer> fibanacciList = new Fibonacci()
                .getFibanacciList(7);

        // then
        Assertions.assertThat(fibanacciList).containsExactly(1, 2, 3, 5, 8, 13);
    }

    @Test
    public void shouldGetEmptyListForZero() {
        // when
        ArrayList<Integer> fibanacciList = new Fibonacci()
                .getFibanacciList(0);

        // then
        Assertions.assertThat(fibanacciList).isEmpty();
    }

    @Test(expected = NumberFormatException.class)
    public void shouldGetAnExceptionForLengthLessThanZero() {
        // when
        new Fibonacci().getFibanacciList(-1);

        // then
        // NumberFormatException
    }


}
