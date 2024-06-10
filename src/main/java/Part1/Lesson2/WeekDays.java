package Part1.Lesson2;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int value = scanner.nextInt();
            if(value >= 1 && value <= 7) {

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
                else if(value==6 || value==7)
                    System.out.println("Day off");

            }
        }
        scanner.close();
    }
}
