public class WordReverse {

    public String invert(String word) {
        String revertedWord = "";
        int lastIndex = word.length() - 1;

        for (int iterator = lastIndex; iterator >= 0; iterator--) {
            String nextLetter = String.valueOf(word.charAt(iterator));
            revertedWord = revertedWord.concat(nextLetter);
        }

        return revertedWord;
    }
}