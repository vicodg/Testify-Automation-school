package Javacodingchallange;

public class JC7 {
    // Method to reverse a string using recursion
    public static String reverse(String str) {
        // Base case: if the string is empty or has one character, return it
        if (str.isEmpty()) {
            return str;
        }

        // Recursive case: take the first character and call reverse on the rest of the string
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "TestifyAutomation";
        String reversed = reverse(input);

        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }
}
