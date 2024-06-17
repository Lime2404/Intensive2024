package Part1.Lesson1.com.company.vehicles;

import Part1.Lesson1.com.company.details.Engine;
import Part1.Lesson1.com.company.professions.Driver;

//  1 Создать класс Car в пакете
public class Car {

//  4. The Car class contains fields - car brand, car class,
    String carBrand;
    String carClass;
    double weight;
    Driver driver;
    Engine motor;

//    4 Methods start(), stop(), turnRight(), turnLeft(),
    void start(){System.out.println("Let's go");}
    void stop(){System.out.println("Stop");}
    void turnRight(){System.out.println("Turn right");}
    void turnLeft(){System.out.println("Turn left");}
}
