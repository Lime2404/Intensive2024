package Part1.Lesson3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//Splitting the collection
public class SplittingCollection {
    public static void main(String[] args) {
//  1. Create a collection of numbers from 0 to 50
        ArrayList<Integer> collection = new ArrayList<>(50);
        for(int i = 0; i < 50; i++){
            collection.add(i);
        }
        iterateElements(collection);
    }
//  2. Write a method that iterates through the elements of a collection
    static void iterateElements(Collection<Integer> collection) {
//  4. To iterate over the elements, use an iterator
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
//  3. If the number is greater than 20 and less than 30, display them on the screen
            if (number > 20 && number < 30){
                System.out.println(number);
            }
        }
    }
}



