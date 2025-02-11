package binarysearchtree;
import java.util.*;
public class searchinsertposition {
	static int insert(int[] arr,int k) {
		int n = arr.length;
		int low=0;
		int high=arr.length-1;
		int result=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==k) return mid;
			if(arr[mid]<k) {
				low=mid+1;
			}
			else { 
				result=mid;
				high=mid-1;
			}
		}
		return result;
		
	}
	public static void main(String[]args) {
		int arr[]= {1,3,5,6};
		int target=4;
		int result=insert(arr,target);
		System.out.println(result);
		
	}

}
