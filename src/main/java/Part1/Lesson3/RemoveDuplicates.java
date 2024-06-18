package Part1.Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//Dialing numbers
public class RemoveDuplicates {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
//  1. The user enters a set of numbers as a single string 1,2,3,4,4,5
        String[] inputArray = input.split(",");
//  2. Get rid of duplicate items in a row.
        //Серег, содаю numberSet. тк он не даст хранить не уникальные знаяения
        Set<Integer> numberSet = new LinkedHashSet<>();
        for (String element : inputArray) {
            try {
                int number = Integer.parseInt(element.trim());
                numberSet.add(number);
            } catch (NumberFormatException e){
                System.out.println("input contain non integer symbols");
            }
        }
        List<Integer> resultList = new ArrayList<>(numberSet);
//  3. Display the result on the screen.
        System.out.println("Массив после удаления дубликатов:");
        for (int number : resultList) {
            System.out.print(number + " ");
        }
    }
}