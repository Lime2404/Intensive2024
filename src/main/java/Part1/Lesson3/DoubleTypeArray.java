package Part1.Lesson3;

import java.util.Arrays;

public class DoubleTypeArray {
    public static void main(String[] args) {
        double[] doubleArray = {1.0, 2.0, 3.0, 4.0};
        System.out.println(Arrays.stream(doubleArray).findFirst());
    }
}
