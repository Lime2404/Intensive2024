package Part1.Lesson4;

import java.util.Scanner;

public class Palindrome {

    public static void isPalindrome(String input){
        int length = input.length();
        System.out.println(length);
        Character first = input.charAt(0);
        Character last = input.charAt(length-1);
        if(first.equals(last)){
            System.out.println("YES");;
        }
        else System.out.println("NO");;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        isPalindrome(input);

    }
}
