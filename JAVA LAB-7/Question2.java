import java.io.PrintWriter;
import java.io.IOException;

public class Question2 {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter("output.txt");

            writer.println("This is the first line.");
            writer.println("This is the second line.");
            writer.println("This is the third line.");
            writer.println("This is the fourth line.");
            writer.println("This is the fifth line.");

            writer.close();

            System.out.println("Finished writing to output.txt");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}