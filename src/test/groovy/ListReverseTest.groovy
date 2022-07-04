import spock.lang.Specification

class ListReverseTest extends Specification {

    def "should get proper inverted Integer list"() {
        given:
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);

        when:
        ArrayList<Integer> invertedList = new ListReverse<Integer>().invertList(list);

        then:
        invertedList.equals(55, 44, 33, 22, 11);
    }

    def "should get proper inverted String list"() {
        given:
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        when:
        ArrayList<String> invertedList = new ListReverse<String>().invertList(list);

        then:
        invertedList.equals("five", "four", "three", "two", "one");
    }

    def "should get empty list"() {
        given:
        ArrayList<String> list = new ArrayList<>();

        when:
        ArrayList<String> invertedList = new ListReverse<String>().invertList(list);

        then:
        invertedList.empty;
    }
}