package leetcode;
import java.util.*;
public class plusone66  {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3};
	        StringBuilder sb = new StringBuilder();
	        for (int num : arr) {
	            sb.append(num);
	        }
	        ArrayList<Integer> scan= new ArrayList<>();
	        
	        int number = Integer.parseInt(sb.toString());
	        System.out.println(number+1); 
	        
	       String str = Integer.toString(number);
	       for(int i=0;i<4;i++) {
	    	   scan.add((int) str.charAt(i));
	       }
	    }
	}


