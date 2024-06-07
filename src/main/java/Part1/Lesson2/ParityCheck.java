package Part1.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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
