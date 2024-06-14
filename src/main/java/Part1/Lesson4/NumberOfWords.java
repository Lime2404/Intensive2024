package Part1.Lesson4;

public class NumberOfWords {
    public static int countLatinWords(String sentence) {

        String[] words = sentence.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String sentence = "One two three times two three one1 two2 123 twо ";
        int latinWordCount = countLatinWords(sentence);
        System.out.println("The number of Latin words is: " + latinWordCount);
    }
}
