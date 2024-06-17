package Part1.Lesson2;

import java.util.Scanner;

public class ParityCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int value = scanner.nextInt();
            if(value % 2 == 0)
                System.out.println(value);
        }
        if(!scanner.hasNextInt()){
            System.out.println("error : you have entered non integer value");
        }
        scanner.close();
   }
}
