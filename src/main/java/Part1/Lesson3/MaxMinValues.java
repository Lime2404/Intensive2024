package Part1.Lesson3;

import javax.naming.InitialContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxMinValues {
    public static void main(String[] args) {

//     Option 1
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8};

        int min = data[0];
        for(int i = 1; i < data.length; i++){
            if(data[i] < min){
                min = data[i];
            }
        }
        int max = data[0];
        for(int i = 1; i < data.length; i++){
            if(data[i] > max){
                max = data[i];
            }
        }

        int[] extremes = {min, max};

        for(int i = 0; i<2; i++){
            System.out.println(extremes[i]);
        }

    }

//      Option 2
//        ArrayList<Integer> intArray = new ArrayList<>(8);
//        for(int i = 0; i<=7; i++){
//            intArray.add(i);
//        }
//        Collections.sort(intArray);
//        ArrayList<Integer> extremes = new ArrayList<>(2);
//        extremes.add(intArray.get(0));
//        extremes.add(intArray.get(7));
//
//        System.out.println(extremes);

}
