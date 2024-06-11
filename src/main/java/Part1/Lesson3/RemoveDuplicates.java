package Part1.Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        // 1,2,3,4,4,5

        String[] inputArray = input.split(",");

        //  numberSet не даст хранить не уникальные знаяения
        Set<Integer> numberSet = new LinkedHashSet<>();


        for (String element : inputArray) {
            try {
                int number = Integer.parseInt(element.trim());
                numberSet.add(number);
            } catch (NumberFormatException e) {
            }
        }

        List<Integer> resultList = new ArrayList<>(numberSet);

        System.out.println("Массив после удаления дубликатов:");
        for (int number : resultList) {
            System.out.print(number + " ");
        }
    }
}