package Part1.Lesson2;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int value = scanner.nextInt();
            if(value > 0 && value < 10)
                System.out.println("Positive number is less than 10 or zero");
            else
                System.out.println("Positive number is greater than 10 or negative.");
        }
        scanner.close();
    }
}
