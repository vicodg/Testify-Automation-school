package Javacodingchallange;

public class JC1 {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // If characters don't match, it's not a palindrome
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true; // If loop completes, it's a palindrome
    }


    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "10801";

        // Check if the first string is a palindrome
        if (isPalindrome(str1)) {
            System.out.println(str1 + " is a palindrome.");
        } else {
            System.out.println(str1 + " is not a palindrome.");
        }

        // Check if the second string is a palindrome
        if (isPalindrome(str2)) {
            System.out.println(str2 + " is a palindrome.");
        } else {
            System.out.println(str2 + " is not a palindrome.");
        }
    }


}
