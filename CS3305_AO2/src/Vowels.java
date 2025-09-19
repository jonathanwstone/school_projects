// Name: Jonathan Stone
// Class: CS 3305/Section# 03
// Term: Fall 2025
// Instructor: Dr. Haddad
// Assignment: 2
// IDE Name: IntelliJ

// Imports
import java.util.Scanner;

public class Vowels {

    // Variables
    public static int vowelCount = 0;

    // Vowel Counting tool
    public static int countVowels( String splitThis , int i){


        // Recursion tool


        // Base case
        if (splitThis.length()-1 < i){
            return 0;
        }

        // Recursive
        else{

            // Pulls character for I and checks them against all vowels
            char charAtIndex = Character.toLowerCase(splitThis.charAt(i));
            if ('a' == charAtIndex ||'e' == charAtIndex || 'i'== charAtIndex || 'o' == charAtIndex || 'u'== charAtIndex){

                return 1 +  countVowels(  splitThis ,i + 1);

            }
            else{

                return countVowels( splitThis , i+ 1);
            }

        }

    }
    public static void main(String[] args) {

        // Tools and variables
        Scanner input = new Scanner(System.in);
        boolean running = true;
        String splitThis = " ";
        int countVowelsResult = 0;


        // While loop to keep menu running till user closes.
        while(running){

            // Menu for user prompts
            System.out.println("---------MAIN MENU---------");
            System.out.println("1. Read input string");
            System.out.println("2. Compute number of vowels");
            System.out.println("3. Exit program");
            System.out.println(" ");

            // Prompts user for option choice
            System.out.print("Enter option number: ");

            // Takes in user input
            int userChoice = input.nextInt();

            // Cover to fix line
            input.nextLine();

            //Spacing Print
            System.out.println(" ");

            // Loop based on userChoice

            // Reads input string
            if (userChoice == 1){

                // Prompts user for input string
                System.out.print("Enter input string: ");

                // Takes in user input
                splitThis = input.nextLine();

                // Spacing prints
                System.out.println(" ");
                System.out.println(" ");



            }

            // Computes number of vowels using countVowels()
            else if (userChoice == 2){

                // Variables needed
                int i = 0;

                // covers for user pushing through without updating splitThis string
                if (splitThis.equals(" ")){

                    // prompts user to use option 1
                    System.out.println("Please use option 1 before using option 2");
                }
                else{
                    // Bring out our total vowels and string itself

                    System.out.println("You entered string: " + splitThis);
                    System.out.println("Number of Vowels: " +  countVowels(splitThis, i));

                }

                // Spacing print
                System.out.println(" ");
            }

            // Exit Program
            if (userChoice == 3){
                // Closes program
                System.out.println("Thank you, goodbye.");
                running = false;
            }
        }
    }
}