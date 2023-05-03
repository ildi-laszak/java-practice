import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        int height = 0;
        draw(height);
    }

    public static void draw(int height) {
        // Write your code to draw the pyramid here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the triangle height:");
        height = scanner.nextInt();
        for (int i = 0; i <= height - 1; i++) {
            for (int j = height - 1; j >= i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();

        // version 2:
//        for (int i = 1; i <= height; i++) {
//            for (int j = 0; j <= height - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}

// Write a program that reads a number from the standard input and
// then draws a pyramid of the specified height
//
// Example:
//
// Please enter the pyramid height: 4
//    * ->  1
//   *** ->  3 (+ 2)
//  ***** ->  5 (+ 2)
// ******* ->  7 (+ 2)