package leetcode;
import java.util.*;
public class Remove27 {
	public static void main(String []args) {
		int nums[]= {3,2,2,4,5,2,4};
		int val=3;
		int k=0;
		
		for (int i=0;i<nums.length;i++) {
			if(nums[i]!=val) {
				nums[k]	= nums[i];
				k++;
				
			}
		}
		
		   System.out.println(Arrays.toString(nums));

		
	}

}
