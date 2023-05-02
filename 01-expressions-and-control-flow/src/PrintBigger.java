import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter a number:");
        int secondNumber = scanner.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber);
        }
        if (secondNumber >= firstNumber) {
            System.out.println(secondNumber);
        }
        scanner.close();
    }
}

// Write a program that asks for two numbers and prints the bigger one.
// If they are equal, it prints the second one.
//
// Example
//
// Please enter a number: 5
// Please enter a number: 13
// 13