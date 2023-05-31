import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int storedNumber = 23;
        int userGuess = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter your guess:");
            userGuess = scanner.nextInt();
            if (userGuess < storedNumber) {
                System.out.println("The stored number is greater than " + userGuess);
            }
            if (userGuess > storedNumber) {
                System.out.println("The stored number is smaller than " + userGuess);
            }
            if (userGuess == storedNumber) {
                System.out.println("You found the stored number " + storedNumber);
            }
        } while (userGuess != storedNumber);
        scanner.close();
    }
}

// Write a program that stores a number and the user has to figure it out.
// The user can input guesses. After each guess the program responds
// with a message indicating whether the stored number is smaller or
// greater than the guess.
// The program ends (exits) when the user finds the stored number
//
// Example:
//
// Please enter your guess: 3
// The stored number is greater than 3
// Please enter your guess: 10
// The stored number is smaller than 10
// Please enter your guess: 8
// You have found the stored number 8


