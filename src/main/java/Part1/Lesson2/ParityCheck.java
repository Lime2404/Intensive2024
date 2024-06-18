package Part1.Lesson2;

import java.util.Scanner;

//  1 Create a program that will tell you whether an integer entered by the user is even or not.
public class ParityCheck {
    public static void main(String[] args) {
            checkParity();
   }

//   2 Create a method that will take two arguments (numbers) and output the result.
    public static void checkParity() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int value1 = scanner.nextInt();
            int value2 = scanner.nextInt();

//            if (value1 % 2 == 0) { System.out.println(value1 + " - четное значенией");}
//            if (value1 % 2 != 0) { System.out.println(value1 + "- нечетное значение" );}
//            if (value2 % 2 == 0){ System.out.println(value2 + "- четное значение");}
//            if (value2 % 2 != 0){ System.out.println(value2 + " - нечетное значение");}
            System.out.println(value1 + " - " + (value1 % 2 == 0 ? "четное значение" : "нечетное значение"));
            System.out.println(value2 + " - " + (value2 % 2 == 0 ? "четное значение" : "нечетное значение"));
        }

//    3 If the user enters a non-integer number, then inform him about the error.
        if (!scanner.hasNextInt()) {
            System.out.println("error : you have entered non integer value");
        }
        scanner.close();
    }
}
