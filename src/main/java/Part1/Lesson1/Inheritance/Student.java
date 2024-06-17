package Part1.Lesson1.Inheritance;

// 1 implement the  Student class
public class Student {

//    2 The Student class contains variables
    String firstName;
    String lastName;
    String group;
    double averageMark;
    boolean hasPdD = false;

//    3 Create a getScholarship() method for the Student class
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
