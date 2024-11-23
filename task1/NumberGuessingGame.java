import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Create a Random object to generate random numbers
        Random random = new Random();
        
        // Welcome message
        System.out.println("Welcome to the Number Guessing Game!");
        
        // Game loop for multiple rounds
        boolean playAgain = true;
        int totalScore = 0;
        int roundsWon = 0;

        while (playAgain) {
            // Generate a random number between 1 and 100 for each round
            int numberToGuess = random.nextInt(100) + 1; // Number between 1 and 100
            int userGuess = 0;
            int numberOfTries = 0;
            int roundScore = 0; // Score for the current round
            
            // Maximum attempts allowed
            int maxAttempts = 7;
            
            System.out.println("I have selected a number between 1 and 100. Try to guess it!");
            System.out.println("You have " + maxAttempts + " attempts to guess the number.");
            
            // Start the game loop
            while (userGuess != numberToGuess) {
                if (numberOfTries >= maxAttempts) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. Game Over!");
                    System.out.println("The correct number was " + numberToGuess);
                    break;
                }

                // Prompt the user to enter their guess
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                numberOfTries++;

                // Check the user's guess
                if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number!");
                    System.out.println("It took you " + numberOfTries + " tries.");
                    roundScore = Math.max(0, maxAttempts - numberOfTries + 1); // Calculate score based on attempts
                    totalScore += roundScore;
                    roundsWon++;
                    System.out.println("You earned " + roundScore + " points this round.");
                    break;
                }
            }

            // Ask the user if they want to play another round
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next().toLowerCase();
            if (response.equals("no") || response.equals("n")) {
                playAgain = false;
                System.out.println("Thank you for playing! Goodbye.");
            }
        }

        // Display the total score and rounds won
        System.out.println("\nGame Over!");
        System.out.println("Total Score: " + totalScore);
        System.out.println("Rounds Won: " + roundsWon);
        System.out.println("Thanks for playing!");

        // Close the scanner object
        scanner.close();
    }
}