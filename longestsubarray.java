package problem;
import java.util.*;
public class longestsubarray {
	   static int longestSub(int arr[], int target) {
	        int max = 0;

	        // Outer loop to start the subarray
	        for (int i = 0; i < arr.length; i++) {
	            int sum = 0; // Reset sum for each starting point

	            // Inner loop to extend the subarray
	            for (int j = i; j < arr.length; j++) {
	                sum += arr[j];

	                // Check if the current sum equals the target
	                if (sum == target) {
	                    int count = j - i + 1; // Length of the subarray
	                    max = Math.max(max, count); // Update max length
	                } else if (sum > target) {
	                    break; // No need to continue if sum exceeds target
	                }
	            }
	        }
	        return max;
	    }
	
	public static void main(String[]args) {
		int arr[]= {10,5,2,7,1,9};
		int target=15;
		 int num =longestSub(arr,target);
		 System.out.println(num);
		
	}

}
