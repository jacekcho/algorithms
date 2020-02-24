import java.util.ArrayList;

public class Fibonacci {

    public ArrayList<Integer> getFibanacciList(int listLength) {

        ArrayList<Integer> fibanacciList = new ArrayList<>();

        if (listLength < 0) {
            throw new NumberFormatException("List length was less than zero");
        }

        if(listLength == 0) {
            return fibanacciList;
        }

        int number = 1;
        int previousNumber = 0;
        int tmpNumber;

        fibanacciList.add(0);

        for (int iterator = 0; iterator < listLength -1; iterator++) {
            fibanacciList.add(number);

            tmpNumber = previousNumber;
            previousNumber = number;
            number = previousNumber + tmpNumber;
        }

        return fibanacciList;
    }

}