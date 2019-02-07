import org.fest.assertions.Assertions;
import org.junit.Test;

public class ExponentiationTest {

    @Test
    public void shouldBeBaseOfThePower() {
        // given
        int base = 2;
        int power = 256;

        // when
        boolean isBaseOfThePower = new Exponentiation().isBaseOfThePower(base, power);

        // then
        Assertions.assertThat(isBaseOfThePower).isTrue();
    }

    @Test
    public void shouldNotToBeBaseOfThePower() {
        // given
        int base = 2;
        int power = 241;

        //when
        boolean isBaseOfThePower = new Exponentiation().isBaseOfThePower(base, power);

        // then
        Assertions.assertThat(isBaseOfThePower).isFalse();
    }
}