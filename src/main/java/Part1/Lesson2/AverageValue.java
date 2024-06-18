package Part1.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Calculate the average value of the three real numbers passed to the program
//        input as arguments. The arguments of the method are of type String.
public class AverageValue {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Double> data = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            data.add(Double.parseDouble(reader.readLine()));
        }
        Double averageValue = average(data.get(0), data.get(1), data.get(2));
        System.out.println("The average value is " + averageValue);
    }
    static Double average(Double first, Double second, Double third){
      return (first + second + third)/3;
    }
}