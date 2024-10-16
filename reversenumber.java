package leetcode;
import java.util.*;
public class reversenumber {
	static int reversenumbers(int num) {
        int revnum = 0;
        int sign = num < 0 ? -1 : 1; 
        num = Math.abs(num);

        while (num > 0) {
           
            if (revnum > (Integer.MAX_VALUE - num % 10) / 10) {
                return 0; 
            }
            revnum = revnum * 10 + num % 10; 
            num /= 10; 
        }

        return revnum * sign;
	}
	public static void main(String[]args) {
		int num= 1534236469;
		int reverse_number=reversenumbers(num);
		System.out.println(reverse_number);
		
		}
	}


