public class Exponentiation {

    public boolean isBaseOfThePower(int base, int power) {
        int resultOfTheMultiplication = 1;
        while (resultOfTheMultiplication < power) {
            resultOfTheMultiplication = resultOfTheMultiplication * base;
        }
        return resultOfTheMultiplication == power;
    }

}
