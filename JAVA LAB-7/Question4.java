import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        try {
            Scanner myReader = new Scanner(new File("story.txt"));

            int lineCount = 0;
            while (myReader.hasNextLine()) {
                myReader.nextLine();
                lineCount++;
            }

            myReader.close();

            System.out.println("Number of lines: " + lineCount);

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}