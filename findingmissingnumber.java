package geeksforgeeks;
import java.util.*;

public class findingmissingnumber {
    public static void main(String[] args) {
        int n = 5;  // The expected number range is from 1 to 5
        int arr[] = {1, 2, 3, 5};  // Given array with a missing number
        
        // Step 1: Sort the array
        Arrays.sort(arr);
        
        // Step 2: Loop through the expected numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            
            // Step 3: Check if the current number 'i' exists in the array
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;  // If found, break out of the inner loop
                }
            }
            
            // Step 4: If the number is not found, print it as the missing number
            if (!found) {
                System.out.println("The missing number is: " + i);
                break;  // Exit the loop since we found the missing number
            }
        }
    }
}
