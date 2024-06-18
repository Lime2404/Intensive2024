package Part1.Lesson3;

//Find the maximum and minimum value in each row of the array.
public class MaxMinValues {
    public static void main(String[] args) {
//  1. Create an array of size 8 of type int and initialize it
//     Option 1
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8};

        int min = data[0];
        for(int i = 1; i < data.length; i++){
            if(data[i] < min){
                min = data[i];
            }
        }
        int max = data[0];
        for(int i = 1; i < data.length; i++){
            if(data[i] > max){
                max = data[i];
            }
        }
//  2. Find the maximum and minimum values and write these values to a new array
        int[] extremes = {min, max};
//  3. Print an array containing the maximum and minimum values.
        for(int i = 0; i<2; i++){
            System.out.println(extremes[i]);
        }
    }
}
//      Option 2
//        ArrayList<Integer> intArray = new ArrayList<>(8);
//        for(int i = 0; i<=7; i++){
//            intArray.add(i);
//        }
//        Collections.sort(intArray);
//        ArrayList<Integer> extremes = new ArrayList<>(2);
//        extremes.add(intArray.get(0));
//        extremes.add(intArray.get(7));
//
//        System.out.println(extremes); }

