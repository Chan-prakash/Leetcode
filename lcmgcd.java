package leetcode;
import java.util.*;
public class lcmgcd {
   static int[] lcgc(int a ,int b) {
	 int gcd=1;
	 int arr[]=new int[2];
	 for(int i =1;i<Math.min(a, b);i++) {         // (a,b)/gcd;
		 if(a%i==0&&b%i==0) {
			 gcd=i;
		 }
	 }// LCM --
	 arr[1]=gcd;
	 arr[0]=(a*b)/gcd;  
	return arr;
	   
   }
   public static void main(String[]args) {
	   Scanner scan=new Scanner(System.in);
	   int a = scan.nextInt();
	   int b=scan.nextInt();
	   int[] result = lcgc(a, b);
       System.out.println("LCM: " + result[0]);
       System.out.println("GCD: " + result[1]);
   }
}
