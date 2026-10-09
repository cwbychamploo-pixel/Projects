
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        // Instantiate a Calc object
        Calc myCalculator = new Calc();

        // Get user input for two numbers
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        double n1 = scan.nextDouble();

        System.out.println("Please enter the second number: ");
        double n2 = scan.nextDouble();

        // Pass the numbers to the Calc object
        myCalculator.setNum1(n1);
        myCalculator.setNum2(n2);

        // Output from Calc instance
        System.out.println(myCalculator);

        // Call the get methods
        System.out.println("Calling num1 get method: "
                + myCalculator.getNum1());

        System.out.println("Calling num2 get method: "
                + myCalculator.getNum2());

        // Call the calculation methods
        double sum = myCalculator.add();

        System.out.println("The sum is: " + sum);

        System.out.println("The difference is: "
                + myCalculator.subtract());

        System.out.println("The product is: "
                + myCalculator.multiply());

        System.out.println("The quotient is: "
                + myCalculator.divide());
    }
}
