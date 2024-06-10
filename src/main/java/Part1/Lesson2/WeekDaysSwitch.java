package Part1.Lesson2;

import java.util.Scanner;

public class WeekDaysSwitch {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value >= 1 && value <= 7) {
//     Option 1:
//                    System.out.println(
//     Option 2:
                    switch (value) {
                        case 1:
                            System.out.println("Monday");
                            break;
                        case 2:
                            System.out.println("Tuesday");
                            break;
                        case 3:
                            System.out.println("Wednesday");
                            break;
                        case 4:
                            System.out.println("Thursday");
                            break;
                        case 5:
                            System.out.println("Friday");
                            break;
                        default:
                            System.out.println("Day off");
                            break;
//                        case 1 -> "Monday";
//                        case 2 -> "Tuesday";
//                        case 3 -> "Wednesday";
//                        case 4 -> "Thursday";
//                        case 5 -> "Friday";
//                        default -> "Day off";
//                    } );
                    }
                }
            }
        }
}
