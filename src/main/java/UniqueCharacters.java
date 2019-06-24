import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {

    public boolean areAllCharacterUnique(String stringToCheck) {
        Set<Character> uniqueCharacters = getUniqueCharacters(stringToCheck);
        return uniqueCharacters.size() == stringToCheck.length();
    }

    private Set<Character> getUniqueCharacters(String stringToCheck) {
        Set<Character> uniqueCharacters = new HashSet<>();

        for (Character c : stringToCheck.toCharArray()) {
            uniqueCharacters.add(c);
        }
        return uniqueCharacters;
    }
}
