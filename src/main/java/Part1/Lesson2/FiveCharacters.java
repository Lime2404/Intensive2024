package Part1.Lesson2;

import java.util.Scanner;

//Print with a 5-character for loop.
public class FiveCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
//  Print 5 characters in one line starting with the 2nd letter. Use the for loop
        for(int i = 1; i < 6; i++){
            System.out.print(input.charAt(i));
        }
    }
}
