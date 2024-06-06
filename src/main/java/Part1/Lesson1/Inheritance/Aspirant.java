package Part1.Lesson1.Inheritance;

public class Aspirant extends Student {
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
