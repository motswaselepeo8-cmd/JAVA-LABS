import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Question7 {
    public static void main(String[] args) {
        try {
            // "true" means append instead of overwrite
            FileWriter fw = new FileWriter("output.txt", true);
            PrintWriter writer = new PrintWriter(fw);

            writer.println("This is a new appended line.");
            writer.println("This is another appended line.");

            writer.close();

            System.out.println("Lines appended to output.txt");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}