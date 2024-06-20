package Part1.Lesson4;

//Find a palindrome
public class PalindromeChecker {

//    Implement a function that takes a string as input and outputs a message "YES"
//    if the string is a palindrome and "NO" if the string is not a palindrome.
    public static void main(String[] args) {
        String[] input = { "12321", "0123", "No lemon, no melon", "I love Java!" };

        for (String s : input) {
            String monoString = s.replaceAll("[\\W]", "").toLowerCase();
            String backwordmonoString = new StringBuilder(monoString).reverse().toString();
            if (monoString.equals(backwordmonoString)) {
                System.out.println("YES, " + "\"" + s + "\" is a palindrome.");
            } else {
                System.out.println("NO, " + "\"" + s + "\" is not a palindrome.");
            }
        }
    }
}
