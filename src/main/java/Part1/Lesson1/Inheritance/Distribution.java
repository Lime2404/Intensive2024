package Part1.Lesson1.Inheritance;

import java.util.ArrayList;

public class Distribution {
    public static void main(String[] args) {
        Student student1  = new Student("Ivan", "Ivanov", "115", 4);
        Student student2  = new Student("Petr", "Petrov", "115", 5);
        Aspirant aspirant1 = new Aspirant("Andrey", "Andreev", "112", 4);
        Aspirant aspirant2 = new Aspirant("Nikolay", "Nikolaev", "113", 5);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(aspirant1);
        students.add(aspirant2);

        for(Student s: students){
            int scholarship = s.getScholarship(s.averageMark);
            System.out.println(s.firstName + " gets " + scholarship + " UAH");
        }
    }
}
