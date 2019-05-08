import org.fest.assertions.Assertions;
import org.junit.Test;

public class WordCompressionTest {

    @Test
    public void shouldCompressLongWord() {
        // given
        String word = "happiness";

        // when
        String compressedWord = new WordCompression().compressWord(word);

        // then
        Assertions.assertThat(compressedWord).isEqualTo("h7s");
    }

    @Test
    public void shouldReturnEmptyString() {
        // given
        String word = "";

        // when
        String compressedWord = new WordCompression().compressWord(word);

        // then
        Assertions.assertThat(compressedWord).isEqualTo("");
    }

    @Test
    public void shouldReturnSingleLetterWord() {
        // given
        String word = "a";

        // when
        String compressedWord = new WordCompression().compressWord(word);

        // then
        Assertions.assertThat(compressedWord).isEqualTo("a");
    }

    @Test
    public void shouldReturnTwoLettersWord() {
        // given
        String word = "ab";

        // when
        String compressedWord = new WordCompression().compressWord(word);

        // then
        Assertions.assertThat(compressedWord).isEqualTo("ab");
    }
}
