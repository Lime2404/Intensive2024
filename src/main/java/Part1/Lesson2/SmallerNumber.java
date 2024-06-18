package Part1.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//To create a program that will display the smallest of the three real numbers entered by the user
public class SmallerNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> data = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            data.add(Integer.parseInt(reader.readLine()));
        }
        System.out.println("The smalles numner is " + Collections.min(data));
    }
}
