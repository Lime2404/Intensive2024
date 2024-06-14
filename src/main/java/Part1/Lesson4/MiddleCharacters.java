package Part1.Lesson4;

public class MiddleCharacters {
    public static void main(String[] args) {
        String input = "code";
        if (input == null || input.length() % 2 != 0) {
            throw new IllegalArgumentException("Input string length is not even .");
        }

        int byteletngth = input.length();
        int firstMiddleDigit = (byteletngth)/2-1;
        int secondMiddleDigit = byteletngth/2;

        Character firstMiddleChar = input.charAt(firstMiddleDigit);
        Character secondMiddleChar = input.charAt(secondMiddleDigit);




        System.out.println(firstMiddleChar.toString() + secondMiddleChar);

    }

}
