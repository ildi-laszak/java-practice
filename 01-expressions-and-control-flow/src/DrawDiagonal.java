import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        int diagonal = 0;
        draw(diagonal);
    }

    public static void draw(int size) {
        // Write your code to draw a square with the main diagonal here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the square size:");
        size = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size || j == i) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// Write a program that reads a number from the standard input and
// then draws a square with the main diagonal of the specified size
//
// Example:
//
// Please enter the square size: 6
// %%%%%%
// %%   %
// % %  %
// %  % %
// %   %%
// %%%%%%
