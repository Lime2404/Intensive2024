package Part1.Lesson5;

//Wrappers
public class Wrappers {
    public static void main(String[] args) {
// 1. Create objects of the Double class using the valueOf() methods
        Double double1 = Double.valueOf(1.0);
        Double double2 = Double.valueOf("1.1");

// 2. Convert a value of type String to type double using Double.parseDouble()
        double double3 = Double.parseDouble("1.2");

//  3. Convert a Double object to all primitive types.
//        Спросить у Сергея какая запись приведения типа нужне
        Double double4 = 1.3;
        byte convertedToByte = double4.byteValue();
        short convertedToShort = double4.shortValue(); //short convertedToShort = (short)1.3;
        int convertedToInt = double4.intValue();  //int convertedToInt = (int)1.3;
        long convertedToLong = double4.longValue(); //long convertedToLong = (long)1.3;
        float convertedToFloat = double4.floatValue(); //float convertedToFloat = (float)1.3;

//  4. Convert a literal of type double to a string
//  Спросить у Серегея, если надо что-то конкретное сделать кроме как выполнить то действие что в задании
        String convertedDouble = Double.toString(3.14);

// 5. Output the obtained values to the console
        System.out.println("Double object 1: " + double1);
        System.out.println("Double object 2: " + double2);
        System.out.println("Parsed double: " + double3);
        System.out.println("Byte value: " + convertedToByte);
        System.out.println("Short value: " + convertedToShort);
        System.out.println("Int value: " + convertedToInt);
        System.out.println("Long value: " + convertedToLong);
        System.out.println("Float value: " + convertedToFloat);
        System.out.println("Double as string: " + convertedDouble);
    }
}
