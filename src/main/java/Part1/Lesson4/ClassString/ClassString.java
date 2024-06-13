package Part1.Lesson4.ClassString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassString {

    // Возиожно тут надо было всё ы одном методе сделать, но как-то громоздко всё начинает выглядеть, поэтому я на отдельгые методы разбил требования
            public static void printLastCharacter(String any) {
                String[] favorites = {"I", "Java", "@", "!!", "like"};
                for (String s : favorites) {
                    if (any.contains(s)) {
                        System.out.println("Input data contains famorite words");
                        System.out.println("the last character of the line is " + any.charAt(any.length() - 1));
                        break;
                    }
                }
            }

            public static void checkEnd (String any){
                if (any.endsWith("!!")) {
                    System.out.println("Input sting ends with \"!!\"");
                } else System.out.println("Input sting doesn't contain symbol \"!!\"");
            }

            public static void checkStart (String any){
                if (any.startsWith("I like")) {
                    System.out.println("Input sting starts from \"I like\"");
                } else System.out.println("Input sting doesn't contain symbol \"!!\"");
            }

            public static void checkPresence (String any){
                if (any.contains("Java")) {
                    System.out.println("Input sting contain  \"Java\"");
                } else System.out.println("Input sting doesn't contain symbol \"Java\"");
            }

            public static void findPosition (String any){
                if (any.contains("Java")) {
                    String substing = "Java";
                    System.out.println("Еhe position of the substring \"Java\" is " + any.indexOf(substing));
                } else System.out.println("Input sting doesn't contain symbol \"Java\"");
            }

            public static String replaceCharacter (String any,char oldChar, char newChar){
                return any.replace(oldChar, newChar);
            }

       public static void main (String[]args){
//           String any = "I like Java!!";
           String any = "gtr";

                printLastCharacter(any);
                checkEnd(any);
                checkStart(any);
                checkPresence(any);
                findPosition(any);

                String replacedString = replaceCharacter(any, 'a', 'o');
                System.out.println(replacedString);
            }
}
