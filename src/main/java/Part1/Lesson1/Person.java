package Part1.Lesson1;

public class Person {
//    1
    String fillName;
    int age;

//    2
    void move(){
        System.out.println("So-and-so Person is speaking");
    }
    void talk(){
        System.out.println("So-and-so Person is speaking");
    }

//    3
    public Person() {
    }

    public Person(String fillName, int age) {
        this.fillName = fillName;
        this.age = age;
    }

    public static void main(String[] args) {
//    4
        Person boy = new Person();
        Person man = new Person("Ivanov Ivan Ivanovich", 35);

//    5
        boy.move();
        boy.talk();
        man.move();
        man.talk();
    }
}
