import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Orange");

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Original fruit list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nOriginal number list:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Try two ArrayList methods: remove() and set().
        fruits.remove(1);
        fruits.set(0, "Grape");
        numbers.remove(1);
        numbers.set(0, 99);

        System.out.println("\nFruit list after remove() and set():");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nNumber list after remove() and set():");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
