package hardlevel;
import java.util.*;
// brute force approach
public class longestsubarray {
	public static void main(String[] args) {
	int arr[]= {0,0,0,0,0,0,0,0,0,0};
	int target=0;
	int max=0;
	int count=0;
	for(int i=0;i<arr.length;i++) {
		int sum=arr[i];
		for(int j=i+1;j<arr.length;j++) {
			sum+=arr[j];
			 if(sum==target) {
				count++;
				max=Math.max(max,j-i+1);
			} 		
		}	
	}
	System.out.println(count);	
	} 
}
