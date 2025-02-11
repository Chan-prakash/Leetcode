package binarysearchtree;
import java.util.*;
public class upper$low {
	static int [] upper(int []arr,int x) {
		int n =arr.length;
		Arrays.sort(arr);
		int floor=-1;
		int ceil=-1;
		int low=0;
		int high=n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==x)return new int[]{x,x};
			if(arr[mid]<x) {
				floor=arr[mid];
				low=mid+1;
			}
			if(arr[mid]>x) {
				ceil=arr[mid];
				high=mid-1;
			}
		}
		
		return new int[] {floor,ceil};
	}
public static void main(String[]args) {
	int arr[]= {5, 6, 8, 9, 6, 5, 5, 6};
	int target=7;
	int[] result=upper(arr,target);
	for(int i :result) {
		System.out.print(i+" ");
	}
	
	
	
}
}
