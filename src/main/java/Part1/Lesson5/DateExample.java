package Part1.Lesson5;

import java.time.LocalDate;

//LocalDate
public class DateExample {

    public static void main(String[] args) {
//  1. Create an object of the LocalDate class specifying your date of birth
        LocalDate myDateOfBirth = LocalDate.of(1987, 4, 24);

// `2. Display the day of the week, day of the year, month, and year on the console
        System.out.println("Date of BirthDay: " + myDateOfBirth);
        System.out.println("Week day: " + myDateOfBirth.getDayOfWeek());
        System.out.println("Day of the Year: " + myDateOfBirth.getDayOfYear());
        System.out.println("Month: " + myDateOfBirth.getMonth());
        System.out.println("Year: " + myDateOfBirth.getYear());

//  3. Create a LocalDate class object that represents the current time
        LocalDate currentDate = LocalDate.now();

        System.out.println("Current Date: " + currentDate);

//  4. Compare it to your birthday using the methods isAfter(), isBefore()
        if (currentDate.isAfter(myDateOfBirth)) {
            System.out.println("The current date is after my birthday.");
        } else if (currentDate.isBefore(myDateOfBirth)) {
            System.out.println("The current date is before my birthday.");
        } else {
            System.out.println("Happy Birthday!");
        }
    }
}
