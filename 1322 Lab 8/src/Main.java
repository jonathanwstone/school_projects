import java.util.*;

public class Main {

    // Standard needed tool
    static Scanner input = new Scanner(System.in);
    public static int differenceInSeconds(String time1, String time2) throws InvalidTimeException {

        String[] time1Split = time1.split(":");
        String[] time2Split = time2.split(":");

        if(time1Split.length !=3 || time2Split.length !=3){
            throw new InvalidTimeException("Timestamp must be in format HH:MM:SS");
        }

        // Creates ArrayList used to pull times for later
        ArrayList<Integer> time1Num = new ArrayList<>();
        ArrayList<Integer> time2Num = new ArrayList<>();

        // Converts times entered as Strings into Integers for later calculations
        for (String t:time1Split) {
            time1Num.add(Integer.parseInt(t));
        }
        for (String t:time2Split) {
            time2Num.add(Integer.parseInt(t));
        }

        // Throws InvalidTimeException for hour slot
        if(time1Num.get(0) > 24){
            throw new InvalidTimeException("Hours must be less than 24");
        }
        if(time2Num.get(0) > 24){
            throw new InvalidTimeException("Hours must be less than 24");
        }
        if(time1Num.get(0) < 0){
            throw new InvalidTimeException("Hours must be greater than or equal to 0");
        }
        if(time2Num.get(0) < 0){
            throw new InvalidTimeException("Hours must be greater than or equal to 0");
        }

        // Throws InvalidTimeException for minute slot
        if (time1Num.get(1) > 59){
            throw new InvalidTimeException("Minutes must be less than 60");
        }
        if (time2Num.get(1) > 59){
            throw new InvalidTimeException("Minutes must be less than 60");
        }
        if (time1Num.get(1) < 0){
            throw new InvalidTimeException("Minutes must be greater than or equal to 0");
        }
        if (time2Num.get(1) < 0){
            throw new InvalidTimeException("Minutes must be greater than or equal to 0");
        }

        // Throws InvalidTimeException for second slot
        if (time1Num.get(2) > 59){
            throw new InvalidTimeException("Seconds must be less than 60");
        }
        if (time2Num.get(2) > 59){
            throw new InvalidTimeException("Seconds must be less than 60");
        }
        if (time1Num.get(2) < 0){
            throw new InvalidTimeException("Seconds must be greater than or equal to 0");
        }
        if (time2Num.get(2) < 0){
            throw new InvalidTimeException("Seconds must be greater than or equal to 0");
        }
        else{
            // Converts first entered time into seconds
            int hours1ToSeconds = time1Num.get(0) * 3600;
            int minutes1ToSeconds = time1Num.get(1) * 60;
            int total1Seconds = hours1ToSeconds + minutes1ToSeconds + time1Num.get(2);

            int hours2ToSeconds = time2Num.get(0) * 3600;
            int minutes2ToSeconds = time2Num.get(1) * 60;
            int total2Seconds = hours2ToSeconds + minutes2ToSeconds + time2Num.get(2);

            int timeDifference =  total1Seconds - total2Seconds;
            if (timeDifference < 0){
                timeDifference*=-1;
            }
            return timeDifference;
        }

    }

    public static void main(String[] args) throws InvalidTimeException {

        // Main Menu
        while(true){
            System.out.println("[Time Calculator]");
            System.out.println("1. Calculate difference in seconds");
            System.out.println("2. Exit");

            // Menu Option select
            System.out.print("Enter your option: ");
            int choice = input.nextInt();

            // Was getting a weird error during testing, this is how I have fixed before
            input.nextLine();

            // Choice tools

            // Choice 1 handler
            if (choice == 1){
                System.out.print("Enter the start timestamp: ");
                String start = input.nextLine();
                System.out.print("Enter the end timestamp: ");
                String end = input.nextLine();
                int difference = differenceInSeconds(start,end);
                System.out.println("The time difference between " + start + " and " + end + " is "  + difference + " seconds");
            }

            // Choice 2 handler
            if (choice == 2){
                System.out.println("Shutting off...");
                break;
            }

        }

    }
}
