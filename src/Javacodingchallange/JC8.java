package Javacodingchallange;
import java.util.Arrays;
public class JC8 {

        public static void main(String[] args) {
            // Example collection of 1 million integers ranging between 1 and 9
            int[] array = new int[1000000];
            // Fill the array with random integers between 1 and 9 for demonstration purposes
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 9) + 1;
            }

            // Print the first 100 elements of the unsorted array
            System.out.println("Unsorted array (first 100 elements): " + Arrays.toString(Arrays.copyOf(array, 100)));

            // Sort the array using counting sort
            countingSort(array, 9);

            // Print the first 100 elements of the sorted array
            System.out.println("Sorted array (first 100 elements): " + Arrays.toString(Arrays.copyOf(array, 100)));
        }

        // Counting sort algorithm
        public static void countingSort(int[] array, int maxVal) {
            int[] count = new int[maxVal + 1]; // Create a count array with size maxVal + 1

            // Count the occurrences of each value in the input array
            for (int num : array) {
                count[num]++;
            }

            // Reconstruct the sorted array based on the count array
            int index = 0;
            for (int i = 1; i <= maxVal; i++) {
                while (count[i] > 0) {
                    array[index++] = i;
                    count[i]--;
                }
            }
        }


}
