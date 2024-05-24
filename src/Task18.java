import java.util.InputMismatchException;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            System.out.println("Your age is: " + age);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid age as an integer.");
        } finally {
            scanner.close();
        }
    }
}
