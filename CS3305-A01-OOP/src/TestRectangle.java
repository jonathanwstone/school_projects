// Name: Jonathan Stone
// Class: CS 3305/Section# 03
// Term: Fall 2025
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: IntelliJ

// Imports
import java.util.Scanner;

public class TestRectangle {

    public static void main(String[] args) {
        // Tools
        Scanner input = new Scanner(System.in);

        // Default
        Rectangle myRectangle = new Rectangle();

        // Your rectangle creator

        // Width
        System.out.print("Enter the width of your rectangle: ");
        double yourWidth = input.nextDouble();
        System.out.println();

        // Height
        System.out.print("Enter the length of your rectangle: ");
        double yourHeight = input.nextDouble();
        System.out.println();

        // Creates new object yourRectangle
        Rectangle yourRectangle = new Rectangle( yourWidth, yourHeight);

        // Prints out myRectangle
        System.out.println("myRectangle: ");
        System.out.println("------------");
        System.out.println("Width:      " + myRectangle.getWidth());
        System.out.println("Height:     " + myRectangle.getHeight());
        System.out.println("Area:       " + myRectangle.getArea());
        System.out.println("Perimeter:  " + myRectangle.getPerimeter());
        System.out.println();
        System.out.println(myRectangle.printRectangle("myRectangle"));

        // Spacer
        System.out.println();

        // Prints out yourRectangle
        System.out.println("yourRectangle: ");
        System.out.println("--------------");
        System.out.println("Width:      " + yourRectangle.getWidth());
        System.out.println("Height:     " + yourRectangle.getHeight());
        System.out.println("Area:       " + yourRectangle.getArea());
        System.out.println("Perimeter:  " + yourRectangle.getPerimeter());
        System.out.println();
        System.out.println(yourRectangle.printRectangle("yourRectangle"));

    }
}