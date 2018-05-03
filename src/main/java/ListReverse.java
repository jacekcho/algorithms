import java.util.ArrayList;

public class ListReverse<T> {

    private T value;

    public ArrayList<T> invertList(ArrayList<T> list) {

        for (int index = 0; index < list.size(); index++) {
            value = list.get(index);
            list.remove(index);
            list.add(0, value);
        }

        return list;
    }
}