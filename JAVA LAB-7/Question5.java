import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        try {
            Scanner myReader = new Scanner(new File("story.txt"));

            int wordCount = 0;
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String[] words = line.split(" ");
                wordCount += words.length;
            }

            myReader.close();

            System.out.println("Number of words: " + wordCount);

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}