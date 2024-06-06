package Part1.Lesson1.Inheritance;

import java.util.ArrayList;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    int getScholarship(double averageMark){
        if(averageMark == 5){
            return 2000;
        }
        else return 1900;
    }

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

}
