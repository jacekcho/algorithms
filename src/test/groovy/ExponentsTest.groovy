import spock.lang.Specification

class ExponentsTest extends Specification {

    def "should be base of the power"() {
        given:
        int base = 2;
        int power = 256;

        when:
        boolean isBaseOfThePower = new Exponentiation().isBaseOfThePower(base, power);

        then:
        isBaseOfThePower.is(true);
    }

    def "should not to be base of the power"() {
        given:
        int base = 2;
        int power = 241;

        when:
        boolean isBaseOfThePower = new Exponentiation().isBaseOfThePower(base, power);

        then:
        isBaseOfThePower.is(false);
    }

}