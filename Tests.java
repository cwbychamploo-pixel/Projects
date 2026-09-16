import java.util.Scanner;

public class Tests
{
    private int numberOfScores;
    private double average;

    public Tests()
    {
        numberOfScores = 0;
        average = 0.0;
    }

    public void getAverage()
    {
        Scanner keyboard = new Scanner(System.in);

        double sum = 0.0;
        int count = 0;

        System.out.print("Enter a test score (-1 to quit): ");
        double score = keyboard.nextDouble();

        while (score != -1)
        {
            sum = sum + score;
            count++;

            System.out.print("Enter a test score (-1 to quit): ");
            score = keyboard.nextDouble();
        }

        numberOfScores = count;
        average = sum / count;
    }

    public String toString()
    {
        return "The average of the " + numberOfScores
            + " scores entered is "
            + String.format("%.2f", average) + ".";
    }
}