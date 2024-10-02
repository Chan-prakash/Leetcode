package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        if (numRows == 0) return pascal;

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1); // Add 1 at the beginning and end of each row
                } else {
                    List<Integer> previousRow = pascal.get(i - 1);
                    row.add(previousRow.get(j) + previousRow.get(j - 1)); // Calculate the internal elements
                }
            }
            pascal.add(row);
        }

        return pascal;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int numRows = 5; // You can change the number of rows here
        
        List<List<Integer>> result = solution.generate(numRows);
        
        // Print the Pascal's Triangle
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
