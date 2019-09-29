import java.util.Iterator;
import java.util.List;

public class MissingValue {

    public int findMissingValue(List<Integer> list) throws Exception {
        Integer value = 0;

        Iterator iterator = getListWithOneMoreValue(list).iterator();
        while (iterator.hasNext()) {
            if (iterator.next() != value) {
                return value;
            } else {
                value = value + 1;
            }
        }
        throw new Exception("No missing value");
    }

    private List<Integer> getListWithOneMoreValue(List<Integer> list) {
        list.add(999);
        return list;
    }
}
