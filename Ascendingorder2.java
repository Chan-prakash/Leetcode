package leetcode;
import java.util.*;

public class Ascendingorder2{

    public static void main(String[] args) {
        // Defining an array of integers
        int array[] = {90, 23, 5, 109, 12, 22, 67, 34};
        int array1[] = new int[5];

        // Scanner outside of the loop to prevent multiple instantiations
        Scanner scan = new Scanner(System.in);
        // Taking inputs for array1 from the user
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter element " + (i + 1) + " for array1:");
            array1[i] = scan.nextInt();
        }

        // Sorting the array
        Arrays.sort(array1);
        System.out.println("ELEMNETS OF ARRAY SORTED IN ASCENDING ORDER :");
        for(int j=0;j<array1.length;j++) {
        	System.out.print(array1[j] + " ");
        }
        Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order: ");
        // Printing the sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

        scan.close(); // Close the Scanner to avoid resource leak
    }
}
