import java.util.*;

public class Lab7 {
    static int index = 0;

    public static int recursiveMultiply(int x, int y) {
       if (y == 0){
           // Base
           return 0;
       }

       return  x + recursiveMultiply(x,y-1);
    }

    public static int recursiveDivision(int x, int y){
        if (x < y){
            return 0;
        }

        return 1 + recursiveDivision( x - y, y);
    }
    public static int recursiveRemainder(int x, int y){
        if (y == x){
            return 0;
        }
        if (x < y){
            return 0;
        }
        return 1 + recursiveRemainder(x-y ,y);
    }

    public static String recursiveEcho(String Phrase, int n){
        if (n == 0){
            return ".";
        }
        return Phrase + recursiveEcho(Phrase, n-1);
    }

    // Took a lot of research
    public static boolean recursiveReverse(String original, String reverse){

        if (original.length() != reverse.length()){
            return false;
        }

        else if (reverse.charAt(index) != reverse.charAt(reverse.length() - 1 - index)) {
            return false;
        }

        else if ( index > original.length())
            return true;

        else{
            index += 1;
        }
        return recursiveReverse(original, reverse);


    }
    public static void main(String[] args) {

        // Tool
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("1. Multiply 2 numbers");
            System.out.println("2. Divide 2 numbers");
            System.out.println("3. Mod 2 numbers");
            System.out.println("4. Echo Sentence");
            System.out.println("5. Determine if reverse");
            System.out.println("6. Quit");

            System.out.print("Enter option: ");
            int option = input.nextInt();


            if (option == 1){
                System.out.print("Enter the first number: ");
                int x = input.nextInt();
                System.out.print("Enter the second number: ");
                int y = input.nextInt();
                System.out.print(recursiveMultiply(x,y));

            }
            else if (option == 2){
                System.out.print("Enter the first number: ");
                int x = input.nextInt();
                System.out.print("Enter the second number: ");
                int y = input.nextInt();
                System.out.print(recursiveDivision(x,y));

            }
            else if (option == 3){
                System.out.print("Enter the first number: ");
                int x = input.nextInt();
                System.out.print("Enter the second number: ");
                int y = input.nextInt();
                System.out.print(recursiveRemainder(x,y));

            }
            else if (option == 4){
                System.out.print("Enter your sentence: ");
                String phrase = input.nextLine();
                System.out.print("Repeat how many times? ");
                int n = input.nextInt();
                System.out.print(recursiveEcho(phrase,n));

            }
            else if (option == 5){
                System.out.print("Enter a sentence: ");
                String original = input.nextLine();
                System.out.print("Enter another sentence: ");
                String reverse = input.nextLine();
                System.out.println(recursiveReverse(original,reverse));

            }
            else if (option == 6){
                System.out.println("Shutting off...");
                break;
            }
        }



    }
}