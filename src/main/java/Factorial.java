public class Factorial {

    public int getFactorial(int number) {

        if (number < 0) {
            throw new NumberFormatException("Number was less than zero");
        }

        int value = 1;
        for (int iterator = 1; iterator <= number; iterator++) {
            value = value * iterator;
        }
        return value;
    }

}
