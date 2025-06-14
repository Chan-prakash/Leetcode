package hardlevel;
import java.util.*;
public class maxConsecutiveElement {
 public static void main(String[] args) {
	int array[]= {1,1,2,3,3,3,3};
	int count=0;
	int max=0;
	int first=0;
	int next=1;
		while(next<array.length) {
		if(array[first]==array[next]) {
			count++; 
			max=Math.max(count,max);
			
		}
		else {
			count=1;
			first=next;
		}
		
		next++;
	
}
	System.out.println("The maximum consecutive time is"+" "+ max);
	
}
}
