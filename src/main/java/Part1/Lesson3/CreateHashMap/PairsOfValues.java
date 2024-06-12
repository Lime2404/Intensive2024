package Part1.Lesson3.CreateHashMap;

import java.util.HashMap;
import java.util.Map;

public class PairsOfValues {
    private HashMap<String, Product> toyMap;

    public PairsOfValues() {
        toyMap = new HashMap<>();
    }

    public void addToy(String name, Product product) {
        toyMap.put(name, product);
    }

    public void printEntrySet() {
        for (Map.Entry<String, Product> entry : toyMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    public void printKeySet() {
        for (String key : toyMap.keySet()) {
            System.out.println("Key: " + key);
        }
    }

    public void printValues() {
        for (Product product : toyMap.values()) {
            System.out.println("Value: " + product);
        }
    }

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