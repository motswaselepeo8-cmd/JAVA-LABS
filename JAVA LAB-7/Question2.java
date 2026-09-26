import java.io.PrintWriter;
import java.io.IOException;

public class Question2 {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter("output.txt");

            writer.println("i wish i was a lot more motivated to create.");
            writer.println("All my friends are very passionate about thier creativity and then there is me.");
            writer.println("But everyone has their own journey, i giess mineis just slow.");
            writer.println("I will be patient with myself.");
            writer.println("And i will pour out my creative expression when it feels right.");

            writer.close();

            System.out.println("Finished writing to output.txt");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}