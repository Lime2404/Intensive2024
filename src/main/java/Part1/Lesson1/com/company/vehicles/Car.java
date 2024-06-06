package Part1.Lesson1.com.company.vehicles;

import Part1.Lesson1.com.company.details.Engine;
import Part1.Lesson1.com.company.professions.Driver;

public class Car {
    String carBrand;
    String carClass;
    double weight;
    Driver driver;
    Engine motor;

    void start(){System.out.println("Let's go");}
    void stop(){System.out.println("Stop");}
    void turnRight(){System.out.println("Turn right");}
    void turnLeft(){System.out.println("Turn left");}
}
