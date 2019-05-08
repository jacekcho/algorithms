
public class WordCompression {

    public String compressWord(String word) {
        if (word.length() < 3) {
            return word;
        }
        return String.valueOf(word.charAt(0))
                .concat(String.valueOf(word.length() - 2))
                .concat(String.valueOf(word.charAt(word.length() - 1)));
    }
}
