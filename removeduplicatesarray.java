package leetcode;

public class removeduplicatesarray {

	    public int removeDuplicates(int[] nums) {
	        int j = 0;
	        int count = 0;

	        for (int i = 0; i < nums.length; i++) {
	            // If it's a new number, reset the count
	            if (i == 0 || nums[i] != nums[i - 1]) {
	                count = 1;
	                nums[j++] = nums[i]; // Place the number in the array
	            } 
	            // If it's the same number, and count is less than 2, add it
	            else if (count < 2) {
	                count++;
	                nums[j++] = nums[i]; // Place the number in the array
	            }
	        }

	        return j; // Return the new length of the array
	    }
	


	    public static void main(String[] args) {
	    	removeduplicatesarray  solution = new removeduplicatesarray ();
	        
	        // Example input
	        int[] nums = {1, 1, 1, 2, 2, 3};

	        // Call the removeDuplicates function
	        int newLength = solution.removeDuplicates(nums);

	        // Output the result
	        System.out.println("New length: " + newLength);
	        System.out.print("Modified array: ");
	        for (int i = 0; i < newLength; i++) {
	            System.out.print(nums[i] + " ");
	        }
	    }
	}



