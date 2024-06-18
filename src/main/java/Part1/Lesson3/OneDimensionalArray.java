package Part1.Lesson3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

//A one-dimensional array of the String type.
public class OneDimensionalArray {
    public static void main(String[] args) {
//  1. Create an array of type String with size 7
        List<String> days = new ArrayList<>(7);
//  2. Write down the values of the days of the week in it.
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
//  3. Display the value of the last item on the console
        System.out.println(days.get(6));
    }
}
