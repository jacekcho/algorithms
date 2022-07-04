import spock.lang.Specification

class WordCompressionTest extends Specification {

    def "Compress long word"() {
        given:
        String word = "happiness";

        when:
        String compressedWord = new WordCompression().compressWord(word);

        then:
        compressedWord.equals("h7s");
    }

    def "not compress empty String"() {
        given:
        String word = "";

        when:
        String compressedWord = new WordCompression().compressWord(word);

        then:
        compressedWord.equals("");
    }

    def "not compress single letter"() {
        given:
        String word = "a";

        when:
        String compressedWord = new WordCompression().compressWord(word);

        then:
        compressedWord.equals("a");
    }

    def "not compress two letter word"() {
        given:
        String word = "xy";

        when:
        String compressedWord = new WordCompression().compressWord(word);

        then:
        compressedWord.equals("xy");
    }

}