package concepts;
import java.util.*;
public class hashing {
	public static void main(String[]args) {
		Scanner scan =new Scanner(System.in);
		int n =scan.nextInt();
		int []arr =new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		// pre calculation
		int[] hash =new int[13];
		for(int i =0;i<n;i++) {// a=a+1;
			hash[arr[i]] +=1; // hash[arr[i]]=hash[arr[i]]+1;
			/*hash[arr[i]]=hash[arr[i]]+1;
			hash[arr[0]]=hash[arr[0]]+1;
			hash[arr[0]]=hash[1]+1;
			hash[1]= default value 0
			Then after it the value of the hash[1] is increased by 1 if it is found the value int he arr[i]*/
		}
		int q= scan.nextInt();
		while(q--!=0) {
			     int number=scan.nextInt();
			     System.out.println(hash[number]);
		}
	}

}
