import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        try {
            Scanner myReader = new Scanner(new File("results.txt"));
            PrintWriter writer = new PrintWriter("passed.txt");

            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                int score = Integer.parseInt(parts[1]);

                if (score >= 50) {
                    writer.println(name + "," + score);
                }
            }

            myReader.close();
            writer.close();

            System.out.println("Passing students written to passed.txt");

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An error occurred while writing.");
            e.printStackTrace();
        }
    }
}