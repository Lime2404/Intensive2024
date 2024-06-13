package Part1.Lesson4.ClassString;

public class ClassStringAlternative {

    // Варианта в одном методе сделать, но как-то громоздко всё начинает выглядеть, поэтому я на отдельгые методы разбил требования
            public static void validateInputData(String any) {
                String[] favorites = {"I", "Java", "@", "!!", "like"};
                for (String s : favorites) {
                    if (any.contains(s)) {
                        System.out.println("Input data contains famorite words");
                        System.out.println("the last character of the line is " + any.charAt(any.length() - 1));

                        if (any.endsWith("!!")) {
                            System.out.println("Input sting ends with \"!!\"");
                        } else System.out.println("Input sting doesn't contain symbol \"!!\"");

                        if (any.endsWith("!!")) {
                            System.out.println("Input sting ends with \"!!\"");
                        } else System.out.println("Input sting doesn't contain symbol \"!!\"");

                        if (any.startsWith("I like")) {
                            System.out.println("Input sting starts from \"I like\"");
                        } else System.out.println("Input sting doesn't contain symbol \"!!\"");

                        if (any.contains("Java")) {
                            System.out.println("Input sting contain  \"Java\"");
                        } else System.out.println("Input sting doesn't contain symbol \"Java\"");

                        if (any.contains("Java")) {
                            String substing = "Java";
                            System.out.println("Еhe position of the substring \"Java\" is " + any.indexOf(substing));
                        } else System.out.println("Input sting doesn't contain symbol \"Java\"");
                        break;
                    } else System.out.println("Input sting doesn't contain symbols");
                    System.exit(1);
                }
            }
            public static String replaceCharacter (String any,char oldChar, char newChar){
                return any.replace(oldChar, newChar);
            }

       public static void main (String[]args){
           String any = "I like Java!!";
//           String any = "gtr";

           validateInputData(any);

           String replacedString = replaceCharacter(any, 'a', 'o');
           System.out.println(replacedString);
       }
}
