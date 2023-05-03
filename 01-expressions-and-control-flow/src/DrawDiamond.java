import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        int diamond = 0;
        draw(diamond);
    }

    public static void draw(int size) {
        // Write your code to draw the diamond here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the diamond height:");
        size = scanner.nextInt();
        scanner.close();

        for (int i = 0; i <= size - 1; i++) {
            for (int j = size - 1; j >= i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = size - 2; i >= 0; i--) {
            for (int j = size - 1; j >= i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Write a program that reads a number from the standard input and
// then draws a diamond of the specified height
//
// Example:
//
// Please enter the diamond height: 4
//    * -> 1
//   *** -> 3 +2
//  ***** -> 5 +2
// ******* -> 7 +2
//  ***** -> 5 -2
//   *** -> 3 -2
//    * -> 1 -2
//
// Note: the height of the diamond is taken from its base
// (where it is the widest) to the top.
// The total number of lines produced is 2*height-1
