import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a distance in miles:");
        double distanceInMiles = scanner.nextDouble();
        double distanceInKm = distanceInMiles * 1.609344;
        System.out.println("The distance in km: " + distanceInKm);
        scanner.close();
    }
}

// Write a program which prompts the user for a double value
// specifying a distance in miles, converts that value
// to kilometers and prints it
//
// Example:
//
// Please enter a distance in miles: 1.8
// The distance in km: 2.88