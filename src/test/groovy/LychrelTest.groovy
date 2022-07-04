import spock.lang.Specification

class LychrelTest extends Specification {

    def "one iteration to get the Lychrel number from 56"() {
        when:
        int iterationToLychrel = new LychrelNumber().getIterationNumber(56);

        then:
        iterationToLychrel.equals(1);
    }

    def "two iterations to get the Lychrel number from 57"() {
        when:
        int iterationToLychrel = new LychrelNumber().getIterationNumber(57);

        then:
        iterationToLychrel.equals(2);
    }

    def "three iterations to get the Lychrel number from 59"() {
        when:
        int iterationToLychrel = new LychrelNumber().getIterationNumber(59);

        then:
        iterationToLychrel.equals(3);
    }

    def "twenty for iterations to get the Lychrel number from 89"() {
        when:
        int iterationToLychrel = new LychrelNumber().getIterationNumber(89);

        then:
        iterationToLychrel.equals(24);
    }
}