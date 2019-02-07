public class LychrelNumber {

    public int getIterationNumber(long number) {
        int iteration = 0;
        long checkedNumber = number;

        do {
            iteration++;
            long reversedNumber = reverseNumber(checkedNumber);
            checkedNumber = checkedNumber + reversedNumber;
        } while (!isPalindrom(checkedNumber));

        return iteration;
    }

    private boolean isPalindrom(long number) {
        long reversedNumber = reverseNumber(number);
        return number == reversedNumber;
    }

    private long reverseNumber(long number) {
        String reversedNumber = new StringBuilder(String.valueOf(number)).reverse().toString();
        return Long.parseLong(reversedNumber);
    }

}