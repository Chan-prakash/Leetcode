package hardlevel;
import java.util.*;
public class FourSum {
	
	public static List<List<Integer>> four(int[] nums, int target) {
		List<List<Integer>> last = new ArrayList<>();
		HashSet<List<Integer>> arr = new HashSet<>(); 
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				for(int k=j+1;k<nums.length;k++) {
					for(int z=k+1;z<nums.length;z++) {
						if(nums[i]+nums[j]+nums[k]+nums[z]==target) {
		 
							List<Integer> temp = new ArrayList<>();
							temp.add(nums[i]);
							temp.add(nums[j]);
							temp.add(nums[k]);
							temp.add(nums[z]);
							Collections.sort(temp);
							if(!last.contains(temp)) {
								arr.add(temp);
								last.add(temp);
							}
						}
						
					}
				}
			}
		}
		//Collections.sort(null);
		return last;
         
	    }
	 public static void main(String[]args) {
		// FourSum ch = new FourSum();
		 List<List<Integer>> list = new ArrayList<>();
		 int [] nums = {2,2,2,2,2,2};
		 int target =8;
		 list = four(nums,target);
		 System.out.println(list);
		
		
	 }


}
