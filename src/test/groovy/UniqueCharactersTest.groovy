import spock.lang.Specification

class UniqueCharactersTest extends Specification {

    def "Check That All Characters Are Unique"() {
        given:
        String stringToCheck = "abcdefgABCDEFG";

        when:
        boolean isUnique = new UniqueCharacters().areAllCharacterUnique(stringToCheck);

        then:
        isUnique.is(true);
    }

    def "Check That Characters Are Not Unique"() {
        given:
        String stringToCheck = "abcdefgabcdefg";

        when:
        boolean isUnique = new UniqueCharacters().areAllCharacterUnique(stringToCheck);

        then:
        isUnique.is(false);
    }

}