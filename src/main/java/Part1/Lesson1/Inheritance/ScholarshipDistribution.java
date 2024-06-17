package Part1.Lesson1.Inheritance;

import java.util.ArrayList;

public class ScholarshipDistribution {
    public static void main(String[] args) {
        Student student1  = new Student("Ivan", "Ivanov", "115", 4);
        Student student2  = new Student("Petr", "Petrov", "115", 5);
        Student aspirant1 = new Aspirant("Andrey", "Andreev", "112", 4);
        Student aspirant2 = new Aspirant("Nikolay", "Nikolaev", "113", 5);

//      4 Create an array of type Student containing objects of the Student class and Aspirant.
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(aspirant1);
        students.add(aspirant2);

        for(Student s: students){
            int scholarship = s.getScholarship(s.getAverageMark());
            System.out.println(s.getFirstName() + " gets " + scholarship + " UAH");
        }
    }
}
