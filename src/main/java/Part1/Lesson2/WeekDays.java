package Part1.Lesson2;

import java.util.Scanner;

// Days of the week.
public class WeekDays {
    public static void main(String[] args) {
//    1. Pass a number from 1 to 7 as an argument to the program.
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int value = scanner.nextInt();
//    2. If the number is 1, output "Monday" to the console,
            if(value >= 1 && value <= 7) {
//    3. Use the if-else-if construct.
                if (value == 1)
                    System.out.println("Monday");
                else if(value == 2)
                    System.out.println("Tuesday");
                else if(value == 3)
                    System.out.println("Wednesday");
                else if(value == 4)
                    System.out.println("Thursday");
                else if(value == 5)
                    System.out.println("Friday");
                else System.out.println("Day off");
            }
        }
        scanner.close();
    }
}
