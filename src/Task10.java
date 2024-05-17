import java.util.Scanner;

public class Task10 {
    // Method to verify if visitors are coming for Testify Trainings
    public static void verifyVisitor(String message) {
        if (message.equalsIgnoreCase("Testify")) {
            System.out.println("Welcome! We're glad you're here for Testify Trainings.");
        } else {
            System.out.println("Sorry, you're not here for Testify Trainings. Access denied.");
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their message
        System.out.print("Enter your message: ");
        String visitorMessage = scanner.nextLine();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Call the verifyVisitor method to check the visitor's message
        verifyVisitor(visitorMessage);
    }
}
