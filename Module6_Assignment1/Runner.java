import javax.swing.JOptionPane;

/**
 * This program demonstrates the Exam class,
 * which extends the Assessment class.
 */
public class Runner {
    public static void main(String[] args) {
        try {
            // Get the number of questions on the exam.
            String input = JOptionPane.showInputDialog("How many questions are on the exam?");
            int questions = Integer.parseInt(input);

            // Get the number of questions the student missed.
            input = JOptionPane.showInputDialog("How many questions did the student miss?");
            int missed = Integer.parseInt(input);

            // Create an Exam object and display the results.
            Exam exam = new Exam(questions, missed);
            String message = "Each question counts " + exam.getPointsEach();
            message += " points.\nThe exam score is " + exam.getScore();
            message += "\nThe exam grade is " + exam.getGrade();
            JOptionPane.showMessageDialog(null, message);

        } catch (NumberFormatException e) {
            // Integer.parseInt fails when the user enters text instead of an integer.
            JOptionPane.showMessageDialog(null,
                    "Please enter whole numbers for the exam questions and missed questions.",
                    "Invalid Number", JOptionPane.ERROR_MESSAGE);

        } catch (ArithmeticException e) {
            // Protect against invalid arithmetic, including division by zero.
            JOptionPane.showMessageDialog(null,
                    "The exam cannot be calculated because of a math error: " + e.getMessage(),
                    "Calculation Error", JOptionPane.ERROR_MESSAGE);

        } catch (IllegalArgumentException e) {
            // Exam rejects zero questions and impossible missed-question counts.
            JOptionPane.showMessageDialog(null,
                    "Invalid exam values: " + e.getMessage(),
                    "Invalid Exam", JOptionPane.ERROR_MESSAGE);
        }

        System.exit(0);
    }
}
