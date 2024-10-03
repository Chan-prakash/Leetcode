package leetcode;

import java.util.Arrays; // Import required for printing arrays

public class sorting88 { // Class name corrected to Solution
	
    // Merge function to merge two sorted arrays
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;     // nums1's index (the actual nums)
        int j = n - 1;     // nums2's index
        int k = m + n - 1; // nums1's index (the next filled position)

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    public static void main(String[] args) {
        // Create a Solution object to use the merge method
        sorting88 solution = new sorting88();
        
        // Test case 1
        int[] nums1 = {1, 3, 5, 0, 0, 0}; // nums1 has 3 valid elements and extra space for nums2
        int m = 3; // Number of valid elements in nums1
        int[] nums2 = {2, 4, 6}; // nums2 has 3 elements
        int n = nums2.length;

        // Call the merge method
        solution.merge(nums1, m, nums2, n);
        
        // Output the result
        System.out.println("Merged array: " + Arrays.toString(nums1));
        
        // Additional test case
        int[] nums1b = {1, 2, 3, 0, 0, 0}; // nums1 has 3 valid elements
        int[] nums2b = {2, 5, 6};          // nums2 has 3 elements
        solution.merge(nums1b, 3, nums2b, 3);
        System.out.println("Merged array: " + Arrays.toString(nums1b));
    }
}
