package Part1.Lesson5;


import java.time.LocalDate;

public class DateExample {

        public static void main(String[] args) {
            // 1. Create an object of the LocalDate class specifying your date of birth
            LocalDate dateOfBirth = LocalDate.of(1987, 4, 24);  // Replace with your actual date of birth

            // 2. Display the day of the week, day of the year, month, and year on the console
            System.out.println("Date of Birth: " + dateOfBirth);
            System.out.println("Day of the Week: " + dateOfBirth.getDayOfWeek());
            System.out.println("Day of the Year: " + dateOfBirth.getDayOfYear());
            System.out.println("Month: " + dateOfBirth.getMonth());
            System.out.println("Year: " + dateOfBirth.getYear());

            // 3. Create a LocalDate class object that represents the current time
            LocalDate currentDate = LocalDate.now();

            // Display current date information
            System.out.println("Current Date: " + currentDate);

            // 4. Compare it to your birthday using the methods isAfter(), isBefore()
            if (currentDate.isAfter(dateOfBirth)) {
                System.out.println("The current date is after your birthday.");
            } else if (currentDate.isBefore(dateOfBirth)) {
                System.out.println("The current date is before your birthday.");
            } else {
                System.out.println("The current date is your birthday!");
            }
        }
}
