import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of chickens:");
        int numberOfChickens = scanner.nextInt();
        System.out.println("Please enter the number of pigs:");
        int numberOfPigs = scanner.nextInt();
        int totalNumberOfLegs = (numberOfChickens * 2) + (numberOfPigs * 4);
        System.out.println("The number of legs: " + totalNumberOfLegs);
    }
}

// Write a program that asks for two integers
// The first represents the number of chickens the farmer has
// The second represents the number of pigs owned by the farmer
// Print how many legs all the animals have in total
//
// Example
//
// Please enter the number of chickens: 4
// Please enter the number of pigs: 2
// The number of legs: 16
