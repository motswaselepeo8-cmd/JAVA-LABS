import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        try {
            Scanner myReader = new Scanner(new File("missing.txt"));

            while (myReader.hasNextLine()) {
                System.out.println(myReader.nextLine());
            }

            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Sorry, that file could not be found.");
        }
    }
}