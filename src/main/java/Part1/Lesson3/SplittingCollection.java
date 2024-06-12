package Part1.Lesson3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SplittingCollection {
    public static void main(String[] args) {
        ArrayList<Integer> collection = new ArrayList<>(50);
        for(int i = 0; i < 50; i++){
            collection.add(i);
        }
        iterateElements(collection);
    }

    static void iterateElements(Collection<Integer> collection) {
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number > 20 && number < 30){
                System.out.println(number); }
        }
    }
}



