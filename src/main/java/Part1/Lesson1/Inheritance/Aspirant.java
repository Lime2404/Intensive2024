package Part1.Lesson1.Inheritance;

// 1 implement the  Aspirant class
public class Aspirant extends Student {

    boolean hasPdD = true;

    @Override
    int getScholarship(double averageMark){
        if(averageMark == 5){
            return 2500;
        }
        else return 2200;
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }
}
