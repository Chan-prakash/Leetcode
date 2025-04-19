package HackwithInfyDP;
import java.util.*;
public class climbingstairs {
	static int stiars(int n) {
    	int a = 1,b=1;
    	for(int i=2;i<=n;i++) {
    	   int temp=a;
    	   a=a+b;
    	   b=temp;
    	}
    	
    	return a;
    	 
    }
    public static void main(String[] args) { 
        int target=4;
        int count =stiars(4);
        System.out.println(count);

    }
}
