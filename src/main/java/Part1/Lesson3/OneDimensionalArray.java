package Part1.Lesson3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class OneDimensionalArray {
    public static void main(String[] args) {
        List<String> days = new ArrayList<>(7);
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        System.out.println(days.get(6));
    }
}
