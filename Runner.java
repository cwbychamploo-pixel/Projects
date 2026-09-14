import java.util.Scanner;

public class Runner
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        Pet pet1 = new Pet();

        System.out.println(pet1.toString());
        System.out.println();

        Pet pet2 = new Pet("Dog", "Max", 5);

        System.out.println(pet2.toString());
        System.out.println();

        Pet pet3 = new Pet();

        System.out.println("Enter animal type:");
        pet3.setType(scnr.next());

        System.out.println("Enter animal name:");
        pet3.setName(scnr.next());

        System.out.println("Enter animal age:");
        pet3.setAge(scnr.nextInt());

        System.out.println();
        System.out.println(pet3.toString());
    }
}