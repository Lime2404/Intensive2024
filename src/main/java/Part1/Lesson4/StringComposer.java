package Part1.Lesson4;

public class StringComposer {

    public static void main(String[] args) {

        int x = 3;
        int y = 56;

        StringBuilder addition = new StringBuilder();
        StringBuilder subtraction = new StringBuilder();
        StringBuilder multiplication = new StringBuilder();

        addition.append(x).append(" + ").append(y).append(" = ").append(x+y);
        subtraction.append(x).append(" - ").append(y).append( " = ").append(x-y);
        multiplication.append(x).append(" * ").append(y).append(" = ").append(x*y);

        String replace_addition = addition.toString().replace(" = ", " equals ");
        String replace_subtraction = subtraction.toString().replace(" = ", " equals ");
        String replace_multiplication = multiplication.toString().replace(" = ", " equals ");

        System.out.println(addition + " and " + replace_addition);
        System.out.println(subtraction + " and " + replace_subtraction);
        System.out.println(multiplication + " and " + replace_multiplication);
    }
}
