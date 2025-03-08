package leetcode;
import java.util.*;
public class peakelementBrute {
	static int peakElement(int[]arr,int n) {
		int low=0;
		int high=n-1;
		int ans=-1;
		if(arr.length==1) {
			return 0;
		}
		if(arr[0]>arr[1]) {
			return 0;
		}
		if(arr[n-1]>arr[n-2]){
			return n-1;
		}
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) {
				return mid;
			}
		    if(arr[mid]<arr[mid+1]) {
		    	low=mid+1;
		    }else {
		    	high=mid-1;
		    }
		     
		}
		return -1;
		
	}
	public static void main(String[]args) {
		int arr[]= {3,4,3,2,1};
		int n= arr.length;
		int res=-1;
	    int result=  peakElement(arr,n);
	    System.out.println("Using the binary search");
	    System.out.println("The Peak element of the array is "+result);
	    System.out.println();
	    
		if(arr.length==1) {
			res=0;
		}
		if(arr[0]>arr[1]) {
			res=0;
		}
		if(arr[n-1]>arr[n-2]){
			res=n-1;
		}
		for(int i = 1;i <n-1;i++) {
                if(arr[i]>arr[i+1] && arr[i]>arr[i-1]) {
                	res=i;
                }
		}
		 System.out.println("Using the brute force approach");
		 System.out.println("The peak element of the array is " + res);
		
		 
		
	}

}
