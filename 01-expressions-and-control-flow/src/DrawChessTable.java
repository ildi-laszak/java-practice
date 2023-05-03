import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        int chessTable = 0;
        draw(chessTable);
    }

    public static void draw(int size) {
        // Write your code to draw the chess table here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the chess table size:");
        size = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i % 2 != 0 && j % 2 != 0 || i % 2 == 0 && j % 2 == 0) {
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
// then draws a chess table of the specified size
//
// Example:
//
// Please enter the chess table size: 8
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %