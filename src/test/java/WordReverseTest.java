import org.fest.assertions.Assertions;
import org.junit.Test;

public class WordReverseTest {

    @Test
    public void shouldGetProperRevertedWord() {
        // given
        String word = "battlefield";

        // when
        String revertedWord = new WordReverse().reverse(word);

        // then
        Assertions.assertThat(revertedWord).isEqualTo("dleifelttab");
    }

    @Test
    public void shouldGetEmptyString() {
        // given
        String word = "";

        // when
        String revertedWord = new WordReverse().reverse(word);

        // then
        Assertions.assertThat(revertedWord).isEqualTo("");
    }

    @Test(expected = NullPointerException.class)
    public void shouldGetAnExceptionForNull() {
        // when
        new WordReverse().reverse(null);

        // then
        // NullPointerException
    }
}