package Part1.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Even-odd.
public class EvenOdd {
    public static void main(String[] args) throws IOException {
//    1. Pass a number as an argument to the program's input.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    4. Use the Integer.parseInt() method to convert from String to int.
        int value = Integer.parseInt(reader.readLine());
//    3. Use the if statement.
            if(value % 2 == 0) {
//    2. If it is odd, print it.
                System.out.println(value);
            }
        }
}
