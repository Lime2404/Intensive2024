package Part1.Lesson4;

//Compose a string using the StringBuilder class
public class StringComposer {

    public static void main(String[] args) {
        int x = 3;
        int y = 56;

        StringBuilder addition = new StringBuilder();
        StringBuilder subtraction = new StringBuilder();
        StringBuilder multiplication = new StringBuilder();

//  1.  Two numbers are given, for example, 3 and 56, you need to make the following lines: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168. Use the
//      StringBuilder.append() method
        addition.append(x).append(" + ").append(y).append(" = ").append(x+y);
        subtraction.append(x).append(" - ").append(y).append( " = ").append(x-y);
        multiplication.append(x).append(" * ").append(y).append(" = ").append(x*y);

//  2. Replace the "=" symbol with the word "equals". Use the StringBuilder.replace() methods.
        String replace_addition = addition.toString().replace(" = ", " equals ");
        String replace_subtraction = subtraction.toString().replace(" = ", " equals ");
        String replace_multiplication = multiplication.toString().replace(" = ", " equals ");

        System.out.println(addition + " and " + replace_addition);
        System.out.println(subtraction + " and " + replace_subtraction);
        System.out.println(multiplication + " and " + replace_multiplication);
    }
}
