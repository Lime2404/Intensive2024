package Part1.Lesson4;

public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        // Удаляем пробелы и приводим строку к нижнему регистру
        String cleanInput = input.replaceAll("[\\W_]", "").toLowerCase();

        // Создаем реверс строки
        String reversedInput = new StringBuilder(cleanInput).reverse().toString();

        // Сравниваем исходную строку с ее реверсом
        return cleanInput.equals(reversedInput);
    }

    public static void main(String[] args) {
        // Примеры строк для проверки
        String[] testStrings = {
                "A man a plan a canal Panama",
                "No lemon, no melon",
                "Hello, World!",
                "12321",
                "12345"
        };

        // Проверка каждой строки и вывод результата
        for (String s : testStrings) {
            if (isPalindrome(s)) {
                System.out.println("\"" + s + "\" is a palindrome.");
            } else {
                System.out.println("\"" + s + "\" is not a palindrome.");
            }
        }
    }
}
