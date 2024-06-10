package Part1.Lesson2;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int value = scanner.nextInt();
            if(value >= 1 && value <= 7) {
                // first option
//                switch (value){
//                    case 1:
//                        System.out.println("Monday");
//                        break;
//                    case 2:
//                        System.out.println("Tuesday");
//                        break;
//                    case 3:
//                        System.out.println("Wednesday");
//                        break;
//                    case 4:
//                        System.out.println("Thursday");
//                        break;
//                    case 5:
//                        System.out.println("Friday");
//                        break;
//                    default:
//                        System.out.println("Day off");
//                        break;
//
//                }
                //second
                if (value == 1)
                    System.out.println("Monday");
                if(value == 2)
                    System.out.println("Tuesday");
                if(value == 3)
                    System.out.println("Wednesday");
                if(value == 4)
                    System.out.println("Thursday");
                if(value == 5)
                    System.out.println("Friday");
                else if(value==6 || value==7)
                    System.out.println("Day off");

            }
        }
        scanner.close();
    }
}
