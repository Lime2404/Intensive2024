package Part1.Lesson1;

import java.util.ArrayList;
import java.util.List;

//  1. Create a Phone class that contains
public class Phone {
    int number;
    String model;
    Double weight;

//  2. Create three instances of this class
    public static void main(String[] args) {
        Phone iphone = new Phone(1234, "iphone",200.20);
        Phone xiaomi = new Phone(1000,"xiaomi",200.30);
        Phone nokia = new Phone(6300,"nokia",200.40);

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
        }
    }

    public void receiveCall(String callerName){
        System.out.println("Calling " + callerName);
    }

    public int getNumber(){
//        System.out.println(number);
        return number;
    }

// 5. Add a constructor to the Phone class that takes three parameters as input to initialize the class variables
        public Phone(int number, String model, Double weight) {
        this.model = model;
        this.number = number;
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
    public void receiveCall(String callerName, int callerNumber){
        System.out.println(callerName + callerNumber); //if needed to verify the result
    }

}
