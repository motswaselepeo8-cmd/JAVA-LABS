import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question1{
    public static void main(String[] args){
        File story = new File("story.txt");

        //try block
        try(Scanner myReader = new Scanner(story)){
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
        }catch (FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}