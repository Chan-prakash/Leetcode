package strangelesson;
import java.util.*;
public class palindome {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		String input= scan.next();
		String reversed="";
		for(int i=input.length()-1;i>=0;i--) {
			reversed+=input.charAt(i);
			
		}
		if(input.equals(reversed)) {
			System.out.println("it is  palindrome");
		}
		else {
			System.out.println("it is not an palindrome");
		}
		
		
	}
	

}
