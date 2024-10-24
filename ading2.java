package leetcode;
import java.util.*;
public class ading2 {
	public static void main(String[]args) {
	int[] a = {10, 20, 30, 40};

    // second array
    int[] b = {50, 60, 70, 80};

    // determine the length of the resultant array
    int[] c = new int[a.length + b.length];

    // copy elements from the first array to the resultant array
    for (int i = 0; i < a.length; i++) {
        c[i] = a[i];
    }

    // copy elements from the second array to the resultant array
    for (int i = 0; i < b.length; i++) {
        c[a.length + i] = b[i];
    }

    // print the resultant array
    System.out.println(Arrays.toString(c));
}
}


