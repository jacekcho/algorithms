import spock.lang.Specification

class WordReverseTest extends Specification {

    def "get inverted word"() {
        given:
        String word = "battlefield";

        when:
        String revertedWord = new WordReverse().invert(word);

        then:
        revertedWord.equals("dleifelttab");
    }

    def "empty String"() {
        given:
        String word = "";

        when:
        String revertedWord = new WordReverse().invert(word);

        then:
        revertedWord.equals("");
    }

    def "get error for Null"() {
        given:
        String word = null;

        when:
        new WordReverse().invert(word);

        then:
        final NullPointerException exception = thrown()
    }

}