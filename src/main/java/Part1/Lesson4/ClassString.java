package Part1.Lesson4;

public class ClassString {
    public static void analyzeString(String any){
        String[] favorites = {"I", "Java", "@", "!!", "LIke"};
        for(String s: favorites){
        if(any.contains(s)){
                System.out.println(any.charAt(any.length()-1));
            }
        }
    }

    public static void checkEnd(String any){
        if(any.endsWith("!!")){
            System.out.println("Input sting contains symbol \"!!" );
        }
        else System.out.println("Input sting doesn't contain symbol \"!!");
    }

    public static void main(String[] args) {
        analyzeString("Hel@lo!!");
        checkEnd("Hello!!");
    }
}
