import java.util.Scanner;

public class Question10 {

    public static double area(double length, double width) {
        return length * width;
    }

    public static double perimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width: ");
        double width = sc.nextDouble();

        System.out.println("Area: " + area(length, width));
        System.out.println("Perimeter: " + perimeter(length, width));

        sc.close();
    }
}