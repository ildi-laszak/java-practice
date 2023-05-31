import java.util.Scanner;

public class GuessTheNumberAlternativeCode {
    public static void main(String[] args) {
        int storedNumber = 23;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter your guess:");
            int userGuess = scanner.nextInt();
            if (storedNumber == userGuess) {
                System.out.println("You have found the stored number " + storedNumber);
                break;
            } else if (userGuess < storedNumber) {
                System.out.println("The stored number is greater than " + userGuess);
            } else {
                System.out.println("The stored number is smaller than " + userGuess);
            }
        }
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
