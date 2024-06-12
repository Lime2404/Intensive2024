package Part1.Lesson3.Pet;

import Part1.Lesson3.CreateHashMap.Product;

import java.util.HashMap;
import java.util.Map;

public class Pet {
    HashMap<String, Pet> animal = new HashMap<>();

    public void addPet(String name, Pet pet) {
        animal.put(name, pet);
    }

    public static void main(String[] args) {
        Pet pet = new Pet();

        pet.addPet("Murzik", new Cat());
        pet.addPet("Sharik", new Dog());
        pet.addPet("Kesha", new Parrot());

        pet.displayName();
    }

    public void displayName(){
        for(String key : animal.keySet()){
            System.out.println("Key: " + key);
        }
    }
}
