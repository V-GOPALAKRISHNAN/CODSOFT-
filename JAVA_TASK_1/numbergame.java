package karthickjava;
import java.util.Random;
import java.util.Scanner;

public class numbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
        int maxAttempts = 6;
        int attempts = 0;
        int score = 0;
        
        boolean playAgain = true;
        
        System.out.println("HELLO THERE, WELCOME TO NUMBER GAME!!!");
        
        while (playAgain) {
            attempts = 0;
            int guess = 0;
            
            System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange + ".");
            
            while (guess != numberToGuess && attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;
                
                if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                    score++;
                }
            }
            
            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + numberToGuess);
            }
            
            System.out.println("Your current score: " + score);
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next();
            
            if (playAgainResponse.equalsIgnoreCase("no")) {
                playAgain = false;
                System.out.println("Thanks for playing! Your final score is: " + score);
            } else if (playAgainResponse.equalsIgnoreCase("yes")) {
                numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
            }
        }
        
        scanner.close();
    }
}


