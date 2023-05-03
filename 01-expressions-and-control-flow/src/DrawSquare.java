import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        int square = 0;
        draw(square);
    }

    public static void draw(int size) {
        // Write your code to draw the square here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the square size:");
        size = scanner.nextInt();
        // first attempt:
        for (int i = 1; i <= size; i++) {
            if (i == 1 || i == size) {
                for (int j = 0; j < size; j++) {
                    System.out.print("%");
                }
            } else {
                for (int k = 1; k <= size; k++) {
                    if (k == 1 || k == size) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

        // simpler version:
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}

// Write a program that reads a number from the standard input and
// then draws a square of the specified size
//
// Example:
//
// Please enter the square size: 6
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
