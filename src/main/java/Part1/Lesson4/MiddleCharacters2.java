package Part1.Lesson4;

public class MiddleCharacters2 {
    public static String getMiddleCharacters(String input) {

        if (input == null || input.length() % 2 != 0) {
            throw new IllegalArgumentException("Input string length is not even .");
        }
        int middle = input.length() / 2;
        return input.substring(middle - 1, middle + 1);
    }
    public static void main(String[] args) {
        String[] testStrings = {"string", "code", "Practice", "evenlength", "example"};

        for (String s : testStrings) {
            try {
                String result = getMiddleCharacters(s);
                System.out.println("The middle characters of \"" + s + "\" are: " + result);
            } catch (IllegalArgumentException e) {
                System.out.println("Error for input \"" + s + "\": " + e.getMessage());
            }
        }
    }
}
