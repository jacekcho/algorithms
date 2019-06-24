import org.fest.assertions.Assertions;
import org.junit.Test;

public class UniqueCharactersTest {

    @Test
    public void shouldCheckThatAllCharactersAreUnique() {
        // given
        String stringToCheck = "abcdefgABCDEFG";

        // then
        Assertions.assertThat(new UniqueCharacters().areAllCharacterUnique(stringToCheck)).isTrue();
    }

    @Test
    public void shouldCheckThatNotAllCharactersAreUnique() {
        // given
        String stringToCheck = "abcdefgabcdefg";

        // then
        Assertions.assertThat(new UniqueCharacters().areAllCharacterUnique(stringToCheck)).isFalse();
    }
}
