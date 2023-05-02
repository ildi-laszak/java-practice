import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int inputNumber = scanner.nextInt();
        if (inputNumber % 2 != 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
        scanner.close();
    }
}

// Write a program that reads a number from the standard input,
// then prints "Odd" if the number is odd, or "Even" if it is even
//
// Please enter a number: 7
// Odd
