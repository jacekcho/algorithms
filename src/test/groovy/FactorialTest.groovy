import spock.lang.Specification

class FactorialTest extends Specification {

    def "should get proper factorial for number five"() {
        when:
        int factorial = new Factorial().getFactorial(5);

        then:
        factorial.equals(120);
    }

    def "should get proper factorial for zero"() {
        when:
        int factorial = new Factorial().getFactorial(0);

        then:
        factorial.equals(1);
    }

    def "should get an exception for number less than zero"() {
        when:
        new Factorial().getFactorial(-1);

        then:
        final NumberFormatException exception = thrown()
        exception.message == 'Number was less than zero'
    }

}