package Part1.Lesson2;

//Print the numbers with a do-while loop.
public class DoWhile {
    public static void main(String[] args) {
//  Option 1 logical
//        int i = 5;
//        do{
//            System.out.println(i);
//            i +=5;
//        } while(i <= 100);

//    Option 1 technical
        int j = 1;
        do{
            if(j % 5 ==0) {
                System.out.println(j);
            }
            j++;
        } while (j <=100);
    }
}
