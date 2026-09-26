import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        try {
            Scanner myReader = new Scanner(new File("numbers.txt"));

            int total = 0;
            while (myReader.hasNextLine()) {
                int number = Integer.parseInt(myReader.nextLine().trim());
                total += number;
            }

            myReader.close();

            System.out.println("Total: " + total);

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}