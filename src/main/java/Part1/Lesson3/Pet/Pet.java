package Part1.Lesson3.Pet;

import java.util.HashMap;

//Pets
//  1. Create the Pet class and its successors
public class Pet {
//  2. Create a HashMap of pets, where the key is the name of the animal and the value is Pet.
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
//  3. Create a method that outputs all display keys to the console
    public void displayName(){
        for(String key : animal.keySet()){
            System.out.println("Key: " + key);
        }
    }
}
