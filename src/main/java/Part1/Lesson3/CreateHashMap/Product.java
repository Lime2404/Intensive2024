package Part1.Lesson3.CreateHashMap;

public class Product {
    private String name;
    private String type;

    public Product(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Product{name='" + getName() + "', type=" + getType() + "}";
    }
}
