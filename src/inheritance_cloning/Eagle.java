package inheritance_cloning;

public class Eagle extends Animal implements Cloneable{
    public Eagle(String name, int weight, int length) {
        super(name, weight, length);
    }

    public Eagle() {
    }

    public Eagle (Eagle eagle) {
        this(eagle.getName(), eagle.getWeight(), eagle.getLength());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
