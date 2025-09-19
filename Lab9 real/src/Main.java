import java.io.*;
import java.util.*;

public class Main {

    public static String diff(File file1, File file2){
        Scanner sc1 = null, sc2 = null;
        String result = "";

        try {
            sc1 = new Scanner(file1);
            sc2 = new Scanner(file2);

            int LineNumber = 1;
            boolean hasDifference = false;

            while (sc1.hasNextLine() && sc2.hasNextLine()) {
                String line1 = sc1.hasNextLine()? sc1.nextLine() : null;
                String line2 = sc2.hasNextLine()? sc2.nextLine() : null;

                if(line1 == null || line2 == null) {
                    result += "Files have a different number of lines";
                    hasDifference = true;
                }

                if(!line1.equals(line2)) {
                    result += "Line " + LineNumber + "\n";
                    result += "<" + line1 + "\n";
                    result += ">" + line2 + "\n";
                    hasDifference = true;
                }

                LineNumber++;
            }

            if(!hasDifference) {
                result = "Files are identical";
            }

        }
        catch(FileNotFoundException e) {
            result += file1.exists()? file2.getName() + " (The system cannot find the file specified)" : file1.getName() + " (The system cannot find the file specified)";

        }

        finally {
            if(sc1 != null) sc1.close();

            if (sc2 != null) sc2.close();

            return result;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[Diff Detector]");
        System.out.print("Enter the name of file 1: ");
        String f1 = sc.nextLine();
        System.out.print("Enter the name of file 2: ");
        String f2 = sc.nextLine();

        File file1 = new File(f1);
        File file2 = new File(f2);

        String result = diff(file1,file2);
        System.out.println(result);

        System.out.println(" ");
        System.out.println("Program complete");

        sc.close();
    }
}