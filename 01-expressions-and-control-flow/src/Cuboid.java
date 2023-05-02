public class Cuboid {
    public static void main(String[] args) {
        double a = 10.4;
        double b = 13.5;
        double c = 8.2;

        double surfaceArea = 2 * (a * b + a * c + b * c);
        double volume = a * b * c;
        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);
    }
}

// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid.
//
// Set the 3 sides to 10.4, 13.5, 8.2 and your program should
// produce the following output:
//
// Surface Area: 672.76
// Volume: 1151.28
