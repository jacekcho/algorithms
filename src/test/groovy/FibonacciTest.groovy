import spock.lang.Specification

class FibonacciTest extends Specification {

    def "should get proper list for seven numbers"() {
        when:
        ArrayList<Integer> fibonacciList = new Fibonacci()
                .getFibanacciList(8);

        then:
        fibonacciList.equals(0, 1, 1, 2, 3, 5, 8, 13);
    }

    def "should get empty list for zero"() {
        when:
        ArrayList<Integer> fibonacciList = new Fibonacci()
                .getFibanacciList(0);

        then:
        fibonacciList.empty;
    }

    def "should get an exception for length less than zero"() {
        when:
        new Fibonacci().getFibanacciList(-1);

        then:
        final NumberFormatException exception = thrown()
        exception.message == 'List length was less than zero'
    }
}