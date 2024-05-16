import java.lang.reflect.Array;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        //String[] fruit = {"apple", "banana", "orange", "pineapple"};
        //System.out.println(Arrays.toString(fruit));

                // Create a two-dimensional array with 4 rows and 3 columns
                String[][] fruitsArray = new String[4][3];

                // Fill the first column with fruits
                fruitsArray[0][0] = "Apple";
                fruitsArray[1][0] = "Banana";
                fruitsArray[2][0] = "Orange";
                fruitsArray[3][0] = "Grape";

                System.out.println(Arrays.deepToString(fruitsArray));



    }
}
