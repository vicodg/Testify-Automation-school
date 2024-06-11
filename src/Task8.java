import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Ask the user for the interest rate
        System.out.print("Enter the annual interest rate (in percentage): ");
        double rate = scanner.nextDouble();

        // Convert the annual interest rate to a decimal
        rate /= 100;

        // Ask the user for the time period
        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        // Calculate the simple interest
        double simpleInterest = (principal * rate * time);

        // Close the scanner to prevent resource leak
        scanner.close();

        // Communicate the simple interest back to the user
        System.out.println("The simple interest is " + simpleInterest + " is a good sentence.");
    }
}
