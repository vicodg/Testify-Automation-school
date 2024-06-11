package Javacodingchallange;

import java.util.Arrays;

public class JC3 {

    // Method to find the maximum product of two numbers in an array
    public static int[] findMaxProduct(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        // The possible candidates for the maximum product
        int n = nums.length;
        int product1 = nums[0] * nums[1]; // Product of the two smallest numbers
        int product2 = nums[n - 1] * nums[n - 2]; // Product of the two largest numbers

        // Compare the products and return the pair with the maximum product
        if (product1 > product2) {
            return new int[]{nums[0], nums[1]};
        } else {
            return new int[]{nums[n - 1], nums[n - 2]};
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 10, -5, 1, -100};
        int[] result = findMaxProduct(nums);

        System.out.println("The two numbers with the maximum product are: " + result[0] + " and " + result[1]);
        System.out.println("Their product is: " + (result[0] * result[1]));
    }

}
