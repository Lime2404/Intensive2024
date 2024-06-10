package Part1.Lesson2;

import java.util.Scanner;

public class FiveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int length = input.length();

        for(int i = 1; i < length; i++){
            System.out.print(input.charAt(i));
        }
    }
}
