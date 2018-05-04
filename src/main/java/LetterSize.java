import com.sun.org.apache.xpath.internal.functions.WrongNumberArgsException;

public class LetterSize {

    public boolean isFirstLetterUppercase(String word) throws WrongNumberArgsException {

        int firstLetterInAscii = word.charAt(0);
        boolean isCapital;

        if (firstLetterInAscii > 64 && firstLetterInAscii < 91) {
            isCapital = true;
        } else if (firstLetterInAscii > 96 && firstLetterInAscii < 123) {
            isCapital = false;
        } else {
            throw new WrongNumberArgsException("First character is not a letter");
        }
        return isCapital;
    }

}
