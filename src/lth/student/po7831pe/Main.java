package lth.student.po7831pe;

import java.util.Scanner;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        try
        {
            File testFile = new File("src/data.txt");
            Scanner fileReader = new Scanner(testFile);
            if(fileReader.hasNextLine() && fileReader.nextLine().equalsIgnoreCase("FINISHED"))
            {
                int testCount = 0;
                while(fileReader.hasNextLine()){
                    String line = fileReader.nextLine();
                    if(line.equalsIgnoreCase("TEST PASS"))
                        testCount++;
                }

                System.out.println("We found " + testCount + " occurrences of \"TEST PASS\"");
            }
            else
            {
                System.out.println("File is not finished!");
            }
        }
	    catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
