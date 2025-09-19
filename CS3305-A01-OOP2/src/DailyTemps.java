// Name: Jonathan Stone
// Class: CS 3305/Section# 03
// Term: Fall 2025
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: IntelliJ

// Import
import java.util.ArrayList;

public class DailyTemps {
    // Variable
    private int dailyTemp;
    private static ArrayList<String> days = new ArrayList<>();
    private static ArrayList<Integer> temperatures = new ArrayList<>();;
    private String day;


    DailyTemps(int dailyTemp){

        // Add days
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        this.dailyTemp = dailyTemp;
        temperatures.add(this.dailyTemp);
        int i = 0;
        this.day = days.get(i);
        i++;

        // If we pass Sunday this will reset to the next monday
        if ((i > days.size()-1)){
            i = 0;
        }

    }

    // Set Temp
    public void setTemp(int resetTemp){
        this.dailyTemp = resetTemp;
    }

    // Calculates the amount of freezing days
    public static int Freezing(){
        int i = 0;
        for ( int index = 0; index < temperatures.size(); index++){
            if (32.0 > temperatures.get(index)){
                i++;

            }
        }
        return i;
    }

    // Gives us the name of the warmest Day
    public static String Warmest(){

        // needed variables
        double highest = temperatures.getFirst();
        int highestIndex = 0;

        for (int index = 0; index < temperatures.size(); index++){
            if (temperatures.get(index) > highest ){
                highest = temperatures.get(index);
                highestIndex = index;

            }
        }
        return days.get(highestIndex);

    }
    public static void printTemps(){
        System.out.println( days.getFirst() + "        " + temperatures.getFirst());
        System.out.println( days.get(1) + "       " + temperatures.get(1));
        System.out.println( days.get(2) + "     " + temperatures.get(2));
        System.out.println( days.get(3) + "      " + temperatures.get(3));
        System.out.println( days.get(4) + "        " + temperatures.get(4));
        System.out.println( days.get(5) + "      " + temperatures.get(5));
        System.out.println( days.get(6) + "        " + temperatures.get(6));

    }


}
