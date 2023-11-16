import javax.swing.JOptionPane;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        final int MAX_ATTEMPTS = 5; // Limiting the number of attempts
        final int RANGE = 100; // Range of numbers for guessing

        int randomNumber = new Random().nextInt(RANGE) + 1; // Generates a random number within the range
        int attempts = 0;
        int userGuess = 0;
        boolean hasGuessed = false;

        JOptionPane.showMessageDialog(null, "Welcome to the Number Guessing Game! Guess a number between 1 and " + RANGE);

        while (attempts < MAX_ATTEMPTS) {
            String userInput = JOptionPane.showInputDialog("Enter your guess:");
            try {
                userGuess = Integer.parseInt(userInput);
                attempts++;

                if (userGuess == randomNumber) {
                    hasGuessed = true;
                    break;
                } else if (userGuess < randomNumber) {
                    JOptionPane.showMessageDialog(null, "Too low! Try again.");
                } else {
                    JOptionPane.showMessageDialog(null, "Too high! Try again.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number!");
            }
        }

        if (hasGuessed) {
            JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number in " + attempts + " attempts.");
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, you have reached the maximum number of attempts. The number was: " + randomNumber);
        }
    }
}