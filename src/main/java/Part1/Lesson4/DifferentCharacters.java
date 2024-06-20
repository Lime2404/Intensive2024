package Part1.Lesson4;

import java.util.HashSet;
import java.util.Set;

//A word with a minimum number of characters
public class DifferentCharacters {

    public static void main(String[] args) {
        String input = "fffff ab f 1234 jkjk";
        String result = findWordWithMinimalUniqueCharacters(input);
        System.out.println("The word with minimal unique characters is: " + result);
    }

    public static String findWordWithMinimalUniqueCharacters(String input) {
        String[] strings = input.split("\\s+");
        String nonUniqCharString = null;
        int minUniqueCount = Integer.MAX_VALUE;

        for (String word : strings) {
            Set<Character> uniqueChars = new HashSet<>();
            for (char c : word.toCharArray()) {
                uniqueChars.add(c);
            }

            int uniqueCount = uniqueChars.size();
            if (uniqueCount < minUniqueCount) {
                minUniqueCount = uniqueCount;
                nonUniqCharString = word;
            }
        }
        return nonUniqCharString;
    }
}
