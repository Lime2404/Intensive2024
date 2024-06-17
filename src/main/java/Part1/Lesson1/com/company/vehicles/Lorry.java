package Part1.Lesson1.com.company.vehicles;

//    5 To create a derivative of the Car class - Lorry (truck),
public class Lorry extends Car{
    double capacity;

    public Lorry(double capacity, double weight) {
        this.capacity = capacity;
        super.weight = weight;
    }

    public static void main(String[] args) {
        Lorry truck = new Lorry(225.50, 10);
        truck.start();
        truck.stop();
    }

}
