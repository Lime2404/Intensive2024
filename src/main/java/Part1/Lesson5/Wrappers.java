package Part1.Lesson5;

public class Wrappers {
    public static void main(String[] args) {
        // 2. Create objects of the Double class using the valueOf() methods
        Double doubleObj1 = Double.valueOf(3.14);
        Double doubleObj2 = Double.valueOf("2.718");

        // 3. Convert a value of type String to type double using Double.parseDouble()
        String doubleString = "42.195";
        double parsedDouble = Double.parseDouble(doubleString);

//        Надо попробовать приведение типов
        Double doubleObj3 = Double.valueOf(1.618);
        byte byteValue = doubleObj3.byteValue();
        short shortValue = doubleObj3.shortValue();
        int intValue = doubleObj3.intValue();
        long longValue = doubleObj3.longValue();
        float floatValue = doubleObj3.floatValue();
        double doubleValue = doubleObj3.doubleValue();

//        Спросить у Серегея, если надо что-то конкретное сделать кроме как выполнить то действие что в задании
        String doubleAsString = Double.toString(3.14);
//        String doubleAsString = doubleObj1.toString(3.14);

        // 6. Output the obtained values to the console
        System.out.println("Double object 1: " + doubleObj1);
        System.out.println("Double object 2: " + doubleObj2);
        System.out.println("Parsed double: " + parsedDouble);
        System.out.println("Double object 3: " + doubleObj3);
        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Int value: " + intValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Double as string: " + doubleAsString);
    }
}
