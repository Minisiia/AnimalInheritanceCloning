package inheritance_cloning;

/**
 * Створити клас Animal та Eagle.
 * Створити 3 поля у класі Animal, Eagle має успадкувати клас Animal.
 * Клонувати об'єкт Eagle.
 **/

public class Main {
    public static void main(String[] args) {
        Eagle originalEagle = new Eagle("Flash",2,50);
        System.out.println("Original eagle " + originalEagle);
            // shallow coping
        try {
            Eagle otherEagle = (Eagle) originalEagle.clone();
            System.out.println("Copied eagle using shallow coping " + otherEagle);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
            // deep coping
        Eagle otherEagleDeepCoping = new Eagle(originalEagle);
        System.out.println("Copied eagle using deep coping " + otherEagleDeepCoping);
    }
}
