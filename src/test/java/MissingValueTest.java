import org.fest.assertions.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class MissingValueTest {

    @Test
    public void shouldFindMissingValueFromList() throws Exception {
        // given
        List<Integer> list = new ArrayList<>(asList(0, 1, 2, 3, 4, 6, 7, 8, 9));

        // when
        int missingValue = new MissingValue().findMissingValue(list);

        // then
        Assertions.assertThat(missingValue).isEqualTo(5);
    }

    @Test
    public void shouldFindMissingValueFromFirstIndex() throws Exception {
        // given
        List<Integer> list = new ArrayList<>(asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        // when
        int missingValue = new MissingValue().findMissingValue(list);

        // then
        Assertions.assertThat(missingValue).isEqualTo(0);
    }

    @Test
    public void shouldFindMissingValueFromLastIndex() throws Exception {
        // given
        List<Integer> list = new ArrayList<>(asList(0, 1, 2, 3, 4, 5, 6, 7, 8));

        // when
        int missingValue = new MissingValue().findMissingValue(list);

        // then
        Assertions.assertThat(missingValue).isEqualTo(9);
    }
}



