package hardlevel;
import java.util.*;
public class countSubarraywithsumk {
	public static void main(String[] args) {
		int num[]= {1,2,3};
		int n =num.length;
		int target = 3;
		int count =0;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) { 
				sum+=num[j];
				if(sum==target) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
