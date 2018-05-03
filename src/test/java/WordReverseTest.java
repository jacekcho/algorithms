import org.fest.assertions.Assertions;
import org.junit.Test;

public class WordReverseTest {

    @Test
    public void shouldGetProperInvertedWord() {
        // given
        String word = "battlefield";

        // when
        String revertedWord = new WordReverse().invert(word);

        // then
        Assertions.assertThat(revertedWord).isEqualTo("dleifelttab");
    }

    @Test
    public void shouldGetEmptyString() {
        // given
        String word = "";

        // when
        String revertedWord = new WordReverse().invert(word);

        // then
        Assertions.assertThat(revertedWord).isEqualTo("");
    }

    @Test(expected = NullPointerException.class)
    public void shouldGetAnExceptionForNull() {
        // when
        new WordReverse().invert(null);

        // then
        // NullPointerException
    }
}