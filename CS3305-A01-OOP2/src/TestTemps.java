// Name: Jonathan Stone
// Class: CS 3305/Section# 03
// Term: Fall 2025
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: IntelliJ

public class TestTemps {
    public static void main(String[] args) {
        DailyTemps tempOne = new DailyTemps(57); // Test temp 1
        DailyTemps tempTwo = new DailyTemps(66); // Test temp 2
        DailyTemps tempThree = new DailyTemps(63); // Test temp 3
        DailyTemps tempFour = new DailyTemps(30); // Test temp 4
        DailyTemps tempFive = new DailyTemps(29); // Test temp 5
        DailyTemps tempSix = new DailyTemps(61); // Test temp 6
        DailyTemps tempSeven = new DailyTemps(15); // Test temp 7

        // Prints using printTemps()
        DailyTemps.printTemps();
        // Spacer for cleanliness
        System.out.println(" ");
        // Prints warmest day
        System.out.println("The Warmest Day of the week is " + DailyTemps.Warmest() +".");
        // Prints freezing days
        System.out.println("Number of freezing days is " + DailyTemps.Freezing() + " days.");


    }
}