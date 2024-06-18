package Part1.Lesson3.CreateHashMap;

import java.util.HashMap;
import java.util.Map;
//Create a HashMap
public class PairsOfValues {
//  1. Create a HashMap containing pairs of values - the name of the toy and the toy object
    private HashMap<String, Product> toyMap;

    public PairsOfValues() {
        toyMap = new HashMap<>();
    }

    public void addToy(String name, Product product) {
        toyMap.put(name, product);
    }
//  2. Iterate over and print pairs of values - entrySet().
    public void printEntrySet() {
        for (Map.Entry<String, Product> entry : toyMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
//  3. Iterate over and print a set of product names - keySet().
    public void printKeySet() {
        for (String key : toyMap.keySet()) {
            System.out.println("Key: " + key);
        }
    }
//  4. Iterate over and print product values - values().
    public void printValues() {
        for (Product product : toyMap.values()) {
            System.out.println("Value: " + product);
        }
    }
//  5. For each iteration, create a separate method.
    public static void main(String[] args) {
        PairsOfValues store = new PairsOfValues();
        store.addToy("Teddy", new Product("Bear", "plush toy"));
        store.addToy("Uno", new Product("Uno", "card"));
        store.addToy("Lada", new Product("Lada", "car"));

        System.out.println("Printing Entry Set:");
        store.printEntrySet();

        System.out.println("\nPrinting Key Set:");
        store.printKeySet();

        System.out.println("\nPrinting Values:");
        store.printValues();
    }
}