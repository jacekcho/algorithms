import com.sun.org.apache.xpath.internal.functions.WrongNumberArgsException;
import org.fest.assertions.Assertions;
import org.junit.Test;

public class LetterSizeTest {

    @Test
    public void shouldStringsFirstCharacterUpercase() throws WrongNumberArgsException {
        // given
        String word = "FirstWord";

        // when
        boolean isCapital = new LetterSize().isFirstLetterUppercase(word);

        // then
        Assertions.assertThat(isCapital).isTrue();
    }

    @Test
    public void shouldStringsFirstCharacterLowercase() throws WrongNumberArgsException {
        // given
        String word = "secondWord";

        // when
        boolean isCapital = new LetterSize().isFirstLetterUppercase(word);

        // then
        Assertions.assertThat(isCapital).isFalse();
    }

    @Test(expected = WrongNumberArgsException.class)
    public void shouldGetAnExceptionForWrongFirstCharacter() throws WrongNumberArgsException {
        // given
        String word = "@ThirdWord";

        // when
        new LetterSize().isFirstLetterUppercase(word);

        // then
        // WrongNumberArgsException
    }

}
