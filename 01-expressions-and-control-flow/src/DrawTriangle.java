import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        int height = 0;
        draw(height);
    }

    public static void draw(int height) {
        // Write your code to draw the triangle here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the triangle height:");
        height = scanner.nextInt();
        for (int i = 0; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

// Write a program that reads a number from the standard input and
// then draws a triangle of the specified height
//
// Example:
//
// Please enter the triangle height: 4
// *
// **
// ***
// ****