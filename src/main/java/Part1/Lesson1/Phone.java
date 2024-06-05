package Part1.Lesson1;

import java.util.ArrayList;
import java.util.List;

//  1. Create a Phone class that contains
public class Phone {
    int number;
    String model;
    Double weight;

    public Phone(String model, int number, Double weight) {

        this.model = model;
        this.number = number;
        this.weight = weight;
    }

//  2. Create three instances of this class
    public static void main(String[] args) {
        Phone iphone = new Phone("iphone", 15, 200.20);
        Phone xiaomi = new Phone("xiaomi", 5, 200.30);
        Phone nokia = new Phone("nokia", 6300, 200.40);

        List<Phone> phones = new ArrayList<>();
        phones.add(iphone);
        phones.add(xiaomi);
        phones.add(nokia);

//  3. Print the values of these variables to the console.
        for(Phone p: phones){
            System.out.println("Phone specifications: " + " model: " + p.model + ", version: " + p.number + ", weight(grams): " + p.weight);
        }
    }

}
