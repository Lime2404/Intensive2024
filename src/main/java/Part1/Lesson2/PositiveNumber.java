package Part1.Lesson2;

import java.util.Scanner;

//5. A number from 0 to 10.
public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int value = scanner.nextInt();
            validateInput(value);
        }
       scanner.close();
    }
//  1. Implement a method that accepts an argument of type int.
    static void validateInput(int value){
        if(value > 0 && value < 10)
            System.out.println("Positive number is less than 10 or zero");
        else
            System.out.println("Positive number is greater than 10 or negative.");
//    2.  display a message on the console
    }
}
