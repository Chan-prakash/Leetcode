package leetcode;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int majorityCount = nums.length / 2; // Calculate the majority count

        // Outer loop: iterate over each number in nums
        for (int i = 0; i < nums.length; i++) {
            int count = 0; // Initialize count for current num

            // Inner loop: count occurrences of nums[i]
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) { // Check if nums[j] is equal to nums[i]
                    count += 1; // Increment count if they are equal
                }
            }

            // Check if count exceeds majorityCount
            if (count > majorityCount) {
                return nums[i]; // If so, return nums[i] as the majority element
            }
        }

        return -1; // Return -1 if no majority element is found
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 2};
        int result = majorityElement(nums); // Use a different variable name
        System.out.println("The majority element is: " + result); // Print the result
    }
}

