package Part1.Lesson4;

//Find the number of words
public class NumberOfWords {
//    Find the number of words that contain only Latin characters.
    public static int countLatinWords(String sentence) {

        String[] words = sentence.split("\\s+");
        int numberOfLatinWords = 0;

        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                numberOfLatinWords++;
            }
        }

        return numberOfLatinWords;
    }

    public static void main(String[] args) {
        String sentence = "One two three times two three one1 two2 123 twо "; //string "two" contains cyrillic char
        int latinWordCount = countLatinWords(sentence);
        System.out.println("The number of Latin words is: " + latinWordCount);
    }
}
