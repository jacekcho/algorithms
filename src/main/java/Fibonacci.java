import java.util.ArrayList;

public class Fibonacci {

    public ArrayList<Integer> getFibanacciList(int listLength) {

        if (listLength < 0) {
            throw new NumberFormatException("List length was less than zero");
        }

        ArrayList<Integer> fibanacciList = new ArrayList<>();

        int number = 1;
        int previousNumber = 1;
        int tmpNumber;

        for (int iterator = 1; iterator < listLength; iterator++) {
            fibanacciList.add(number);

            tmpNumber = previousNumber;
            previousNumber = number;
            number = previousNumber + tmpNumber;
        }
        return fibanacciList;
    }

}