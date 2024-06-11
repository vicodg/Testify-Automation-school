import javax.swing.*;
import java.util.Scanner;

public class Task9b {
    public static void main(String[] args) {
        //Write a logic that takes in input from the user

        Scanner scanner = new Scanner(System.in);
        String userInput= "";

        while (true){
            if(!userInput.equalsIgnoreCase("Testify")) {
                System.out.println("welcome please enter \"Testify\" to enter this loop ");
                userInput = scanner.nextLine();
                continue;
            }else if (userInput.equalsIgnoreCase("Testify")){
                System.out.println("welcomne");
                break;
            }

            System.out.println("Try again");

        }
    }
}
