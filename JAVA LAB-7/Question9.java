import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            PrintWriter writer = new PrintWriter("results.txt");

            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter name for student " + i + ": ");
                String name = sc.nextLine();

                System.out.print("Enter score for student " + i + ": ");
                int score = sc.nextInt();
                sc.nextLine(); // consume leftover newline

                writer.println(name + "," + score);
            }

            writer.close();

            System.out.println("Results written to results.txt");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        sc.close();
    }
}