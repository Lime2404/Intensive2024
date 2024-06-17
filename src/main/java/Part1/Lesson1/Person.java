package Part1.Lesson1;

public class Person {
//    1 Create a Person class that contains variables
    String fillName;
    int age;

//    2 move() and talk() methods, to print the message "So-and-so Person is speaking" to the console.
    void move(){
        System.out.println("So-and-so Person is speaking");
    }
    void talk(){
        System.out.println(fillName + " is speaking");
    }

//    3 Add two constructors
    public Person() {
    }

    public Person(String fillName, int age) {
        this.fillName = fillName;
        this.age = age;
    }

    public static void main(String[] args) {
//    4 Create two objects of this class
        Person boy = new Person();
        Person man = new Person("Ivanov Ivan Ivanovich", 35);

//    5 Calling methods for each object
        boy.move();
        boy.talk();
        man.move();
        man.talk();
    }
}
