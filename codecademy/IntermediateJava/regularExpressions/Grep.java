package codecademy.IntermediateJava.regularExpressions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Grep {
    public static void main(String[] args) {
        String fName;
        File f;
        Scanner s;
        
        // Define the regex pattern to match one or more digits
        Pattern pattern = Pattern.compile("\\w*\\d+\\w*");
        
        // Loop through files TestFile1.txt to TestFile5.txt
        for (int fileNumber = 1; fileNumber <= 5; fileNumber++) {
            fName = "TestFile" + fileNumber + ".txt";
            try {
                f = new File(fName);
                s = new Scanner(f);
                
                // Read each line in the file
                while (s.hasNextLine()) {
                    String line = s.nextLine();
                    Matcher matcher = pattern.matcher(line);
                    
                    // Check if the line contains a match
                    if (matcher.find()) {
                        System.out.println(fName + ":" + line);
                    }
                }
                s.close();
            } catch (FileNotFoundException e) {
                System.out.println("Problem opening file " + fName);
                e.printStackTrace();
                return;
            }
        }
    }
}