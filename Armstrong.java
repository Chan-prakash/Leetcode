package leetcode;
import java.util.*;
public class Armstrong {
	
	static void armstrong(int n) {
		int digit=0;
		int temp=n;// original value to maintain
		int digits = 0;
		int count= String.valueOf(n).length();
		
		while(n>0) {
			digit=n%10;
			digits += (int) Math.pow(digit,count);
			n/=10;
		}
		if(digits == temp) {
			System.out.println("ArmStrong");
		}
		else System.out.println("Not Armstrong");
		
	}
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int n =scan.nextInt();
		armstrong(n);
	}

}
