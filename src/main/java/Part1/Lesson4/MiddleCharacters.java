package Part1.Lesson4;

//Find the two middle characters of the string
public class MiddleCharacters {
    public static void main(String[] args) {
        String input = "code";
        if (input == null || input.length() % 2 != 0) {
            throw new IllegalArgumentException("Input string length is not even .");
        }
        int byteLetngth = input.length();
        int firstMiddleDigit = byteLetngth/2-1;
        int secondMiddleDigit = byteLetngth/2;

        Character firstMiddleChar = input.charAt(firstMiddleDigit);
        Character secondMiddleChar = input.charAt(secondMiddleDigit);

        System.out.println(firstMiddleChar.toString() + secondMiddleChar);
    }
}
