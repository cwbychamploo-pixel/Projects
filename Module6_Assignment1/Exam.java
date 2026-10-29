/**
 * Represents an exam graded out of 100 points.
 * Inherits score and letter-grade functionality from Assessment.
 */
public class Exam extends Assessment {
    private final int numQuestions;
    private final int numMissed;
    private final double pointsEach;

    /**
     * Creates an exam and calculates the student's score.
     *
     * @param questions total number of questions on the exam
     * @param missed number of questions answered incorrectly
     * @throws IllegalArgumentException if the question counts are invalid
     */
    public Exam(int questions, int missed) {
        if (questions <= 0) {
            throw new IllegalArgumentException("The exam must have at least one question.");
        }
        if (missed < 0 || missed > questions) {
            throw new IllegalArgumentException("Missed questions must be between 0 and the total questions.");
        }

        numQuestions = questions;
        numMissed = missed;
        pointsEach = 100.0 / numQuestions;

        // Assessment stores an integer score, so round to the nearest point.
        int finalScore = (int) Math.round(100.0 - numMissed * pointsEach);
        setScore(finalScore);
    }

    /**
     * Returns the number of points that each question is worth.
     *
     * @return points per question
     */
    public double getPointsEach() {
        return pointsEach;
    }

    /**
     * Returns the total number of questions.
     *
     * @return total questions
     */
    public int getNumQuestions() {
        return numQuestions;
    }

    /**
     * Returns the number of missed questions.
     *
     * @return missed questions
     */
    public int getNumMissed() {
        return numMissed;
    }
}
