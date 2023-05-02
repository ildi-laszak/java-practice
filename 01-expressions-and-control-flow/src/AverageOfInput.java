import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter a number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter a number:");
        int thirdNumber = scanner.nextInt();
        System.out.println("Please enter a number:");
        int fourthNumber = scanner.nextInt();
        System.out.println("Please enter a number:");
        int fifthNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
        double average = (double)sum / 5;
        System.out.println("Sum: " + sum + ", Average: " + average);
        scanner.close();
    }
}

// Write a program prompts the user for 5 integers in a row,
// then it prints their sum and their average:
//
// Please enter a number: 3
// Please enter a number: 7
// Please enter a number: 1
// Please enter a number: 6
// Please enter a number: 5
// Sum: 22, Average: 4.4
