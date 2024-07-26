import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Guess the Number Game!!");
        System.out.println("I have selected a number between 1 and 100.And you have To Try to guess it!");

        // Loop until the user guess the correct number.
        while (guess != targetNumber) {
            System.out.print("Enter your Guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Too low!! Try Again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high!! Try Again.");
            } else {
                System.out.println("Congratulations! You've Guessed the Correct Number And You Won the Game.");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }
        scanner.close();
    }
}
