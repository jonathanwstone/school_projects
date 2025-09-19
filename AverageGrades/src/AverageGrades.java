// Name: Jonathan Stone
// Class: CS 3305/Section# 03
// Term: Fall 2025
// Instructor: Dr. Haddad
// Assignment: 2
// IDE Name: IntelliJ

// Imports
import java.util.Arrays;
import java.util.Scanner;

public class AverageGrades {

    static double findAverage( int[] gradesToAverage, int index){
        // Takes in our gradesToAverage and Averages them using recursion
        if(gradesToAverage.length == index){
            return 0;

        }
        else{
            return gradesToAverage[index] + findAverage(gradesToAverage, index+1);
        }

    }



    public static void main(String[] args) {
        // Useful tools and variables
        boolean running = true;
        Scanner input = new Scanner(System.in);
        int classSize = 0;
        int[] gradesToAverage = null;

        // Menu loop to repeat
        while(running){

            // Actual menu
            System.out.println("--------MAIN MENU-------");
            System.out.println("1. Read class size");
            System.out.println("2. Read class grades");
            System.out.println("3. Compute class average");
            System.out.println("4. Exit program");

            // Spacing
            System.out.print(" ");

            // Prompts user for input then receives input
            System.out.print("Enter option number: ");
            int userChoice = input.nextInt();
            System.out.println(" ");

            // Reads out class size
            if(userChoice == 1){

                // Requests and receives class size
                System.out.print("Enter the class size: ");
                classSize = input.nextInt();

                // Clear
                input.nextLine();

                // Spacing
                System.out.println(" ");

            }

            // Reads out class grades
            if(userChoice == 2){

                // Covers for class size not being entered
                if (classSize == 0){
                    System.out.print("Please enter class size using option 1 first.");
                }

                // If class size is entered allows you to enter grades
                else{
                    gradesToAverage = new int[classSize];

                    // Grade inputs tool
                    for (int i = 0; i < classSize; i++) {
                        while (true) {
                            System.out.print("Please enter Grade " + (i + 1) + ": ");
                            int grade = input.nextInt();

                            if (grade >= 0 && grade <= 100) {
                                gradesToAverage[i] = grade;
                                break;
                            } else {
                                System.out.println("Amounts entered should be between 0 and 100, please reenter.");
                            }
                        }
                    }


                }

                // Spacing
                System.out.println(" ");

            }

            // Computes class average using recursion method
            if(userChoice == 3){

                // Needed index value
                int index = 0;

                // Asks user to use both earlier options before continuing
                // Says both options because without using option 1 you cannot use 2
                if (classSize == 0){

                    System.out.println("Please use option 1 and 2 before continuing");

                }

                // If 2 has not been used asks for user to use 2
                else if(gradesToAverage == null ){

                    System.out.println("Please use option 2 before continuing.");

                }

                // Prints out results needed
                else{
                    System.out.println("You entered class size: " + classSize);
                    System.out.println("You entered grades: " + Arrays.toString(gradesToAverage));
                    System.out.println( (findAverage(gradesToAverage,index))/ (double) classSize);
                }

                // Spacing
                System.out.println(" ");

            }

            // Exits Program and displays thank you message
            if(userChoice == 4){
                System.out.println("Thank you, goodbye.");
                running = false;

            }
        }

    }
}