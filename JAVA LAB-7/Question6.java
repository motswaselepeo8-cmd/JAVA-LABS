import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        try {
            Scanner myReader = new Scanner(new File("story.txt"));
            PrintWriter writer = new PrintWriter("story_copy.txt");

            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                writer.println(line);
            }

            myReader.close();
            writer.close();

            System.out.println("story.txt copied to story_copy.txt");

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An error occurred while writing.");
            e.printStackTrace();
        }
    }
}