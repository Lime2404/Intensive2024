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
        Phone iphone = new Phone("iphone", 1234, 200.20);
        Phone xiaomi = new Phone("xiaomi", 1000, 200.30);
        Phone nokia = new Phone("nokia", 6300, 200.40);

        List<Phone> phones = new ArrayList<>();
        phones.add(iphone);
        phones.add(xiaomi);
        phones.add(nokia);

//  3. Print the values of these variables to the console.
//  4. Call these methods for each of the objects.
        for(Phone p: phones){
            System.out.println("Phone specifications: " + " model: " + p.model + ", version: " + p.number + ", weight(grams)e: " + p.weight);
            p.receiveCall("John");
            p.getNumber();
            p.receiveCall("Petr", p.number);
        }
    }

    public void receiveCall(String name){
        System.out.println("Calling " + name);
    }

    public int getNumber(){
        System.out.println(number);
        return number;
    }

// 5. Add a constructor to the Phone class that takes three parameters as input to initialize the class variables
    public Phone(int number, String model, Double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

// 6. Add a constructor that accepts two parameters for initializing class variables - number, model.
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

// 7. Add a constructor without parameters.
    public Phone() {
    }

// 8. Add an overloaded receiveCall method that accepts two parameters - the caller's name and the
// caller's phone number
    public void receiveCall(String name, int number){
        System.out.println(name + number);
    }

}
