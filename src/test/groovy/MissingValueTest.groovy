import spock.lang.Specification

class MissingValueTest extends Specification {

    def "find missing value from list"() {
        given:
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 6, 7, 8, 9));

        when:
        int missingValue = new MissingValue().findMissingValue(list);

        then:
        missingValue.equals(5);
    }

    def "find missing value from first index"() {
        given:
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        when:
        int missingValue = new MissingValue().findMissingValue(list);

        then:
        missingValue.equals(0);
    }

    def "find missing value from last index"() {
        given:
        List<Integer> list = new ArrayList<>(Arrays.asList(0,1, 2, 3, 4, 5, 6, 7, 8));

        when:
        int missingValue = new MissingValue().findMissingValue(list);

        then:
        missingValue.equals(9);
    }
}