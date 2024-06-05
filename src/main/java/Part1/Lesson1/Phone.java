package Part1.Lesson1;

import java.util.ArrayList;
import java.util.List;

//  1. Create a Phone class that contains
public class Phone {
    int number;
    String model;
    Double weight;

    public Phone(int number, String model, Double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

//  2. Create three instances of this class
    public static void main(String[] args) {
        Phone iphone = new Phone(15, "Pro", 200.20);
        Phone xiaomi = new Phone(5, "Pro", 200.30);
        Phone nokia = new Phone(6300, "brick", 200.40);

        List<Phone> phones = new ArrayList<>();
        phones.add(iphone);
        phones.add(xiaomi);
        phones.add(nokia);

//  3. Print the values of these variables to the console.
        for(Phone p: phones){
            System.out.println("Характеристики iphone: " + " версия: "+ p.number + ", модель: " + p.model + ", вес в граммах: " + p.weight);
        }
    }

}
