import java.util.Scanner;
public class Calc {
    private double num1;
    private double num2;

    // Keep asking until the user enters a valid, finite number.
    public static double readNumber(Scanner scan, String prompt) {
        while (true) {
            System.out.println(prompt);

            if (!scan.hasNext()) {
                throw new java.util.NoSuchElementException("No number was entered.");
            }

            if (scan.hasNextDouble()) {
                double value = scan.nextDouble();
                if (Double.isFinite(value)) {
                    return value;
                }
            } else {
                scan.next(); // Discard invalid input before trying again.
            }

            System.out.println("Invalid input. Please enter a numeric value.");
        }
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        return num1 / num2;
    }

    @Override
    public String toString() {
        return "Displaying private data fields using toString():\n"
                + "Num1: " + num1 + "\n"
                + "Num2: " + num2;
    }
}
