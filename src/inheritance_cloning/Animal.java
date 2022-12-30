package inheritance_cloning;

public class Animal {
    private String name;
    private int weight;
    private int length;

    public Animal() {
    }

    public Animal(String name, int weight, int length) {
        this.name = name;
        this.weight = weight;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Animal{ " +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                '}';
    }
}
