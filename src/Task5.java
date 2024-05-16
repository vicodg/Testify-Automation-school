public class Task5 {
    public static void main(String[] args) {
        // Loop from 1 to 100, as an example
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) { // If divisible by both 3 and 5
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) { // If divisible by 3
                System.out.println("Fizz");
            } else if (i % 5 == 0) { // If divisible by 5
                System.out.println("Buzz");
            } else {
                System.out.println(i); // Print the number
            }
        }
    }
}
