package Part1.Lesson4.ClassString;

//Class String
public class ClassString {
//  1. Write a method that takes as a parameter any string that contains the words I, Java, @, !!, like.
    // Возиожно тут надо было всё ы одном методе сделать, но как-то громоздко всё начинает выглядеть, поэтому я на отдельгые методы разбил требования
            public static void printLastCharacter(String any) {
                String[] favorites = {"I", "Java", "@", "!!", "like"};
                for (String s : favorites) {
                    if (any.contains(s)) {
                        System.out.println("Input data contains famorite words");
//   2. Print the last character of the line. Use the String.charAt() method
                        System.out.println("the last character of the line is " + any.charAt(any.length() - 1));
                        break;
                    }
                }
            }
//  3.  Check if your string ends with the substring "!!". Use the String.endsWith() method.
            public static void checkEnd (String any){
                if (any.endsWith("!!")) {
                    System.out.println("Input sting ends with \"!!\"");
                } else System.out.println("Input sting doesn't contain symbol \"!!\"");
            }
//  4. Check if your string starts with the substring "I like". Use the String.startsWith() method.
            public static void checkStart (String any){
                if (any.startsWith("I like")) {
                    System.out.println("Input sting starts from \"I like\"");
                } else System.out.println("Input sting doesn't contain symbol \"I like\"");
            }
//  5. Check if your string contains the "Java" substring. Use the String.contains() method.
            public static void checkPresence (String any){
                if (any.contains("Java")) {
                    System.out.println("Input sting contain  \"Java\"");
                } else System.out.println("Input sting doesn't contain symbol \"Java\"");
            }
//  6. Find the position of the substring "Java" in the string "I like Java!!".
            public static void findPosition (String any){
                if (any.contains("Java")) {
                    String substing = "Java";
                    System.out.println("Еhe position of the substring \"Java\" is " + any.indexOf(substing));
                } else System.out.println("Input sting doesn't contain symbol \"Java\"" + " try the new input");
            }
//  7. Replace all characters "a" with "o".
            public static String replaceCharacter (String any,char oldChar, char newChar){
                return any.replace(oldChar, newChar);
            }
//  8. Convert the string to uppercase.
            public static String convertUpperCase(String any){
                String convertedString = any.toUpperCase();
                System.out.println(convertedString);
                return convertedString;
            }
//  9. Convert the string to lowercase.
            public static String convertLowerCase(String any){
                String convertedString = any.toLowerCase();
                System.out.println(convertedString);
                return convertedString;
            }

       public static void main (String[]args){
           String any = "I like Java!!";
//           String any = "test";

                printLastCharacter(any);
                checkEnd(any);
                checkStart(any);
                checkPresence(any);
                findPosition(any);
                String replacedString = replaceCharacter(any, 'a', 'o');
                System.out.println(replacedString);
                convertUpperCase(any);
                convertLowerCase(any);
            }
}
