import org.fest.assertions.Assertions;
import org.junit.Test;

import java.util.ArrayList;

public class ListReverseTest {

    @Test
    public void shouldGetProperInvertedIntegerList() {
        // given
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);

        // when
        ArrayList<Integer> invertedList = new ListReverse<Integer>().invertList(list);

        // then
        Assertions.assertThat(invertedList).containsExactly(55, 44, 33, 22, 11);
    }

    @Test
    public void shouldGetProperInvertedStringList() {
        // given
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        // when
        ArrayList<String> invertedList = new ListReverse<String>().invertList(list);

        // then
        Assertions.assertThat(invertedList).containsExactly("five", "four", "three", "two", "one");
    }

    @Test
    public void shouldGetEmptyList() {
        // given
        ArrayList<Integer> list = new ArrayList<>();

        // when
        ArrayList<Integer> invertedList = new ListReverse<Integer>().invertList(list);

        // then
        Assertions.assertThat(invertedList).containsExactly();
    }

}