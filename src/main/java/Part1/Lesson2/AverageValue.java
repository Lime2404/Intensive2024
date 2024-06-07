package Part1.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AverageValue {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> data = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            data.add(Integer.parseInt(reader.readLine()));
        }
        float averageValue = average(data.get(0), data.get(1), data.get(2));
        System.out.println("The average value is " + averageValue);
    }
       static float average(int first, int second, int third){
        return (first + second + third)/3;
    }


}
