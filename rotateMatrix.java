package leetcode;
import java.util.*;
public class rotateMatrix {
	public static void main(String[] args) {
		// this is the matrxix we have defined it ..
		// 3*3 matrix..
	
		int[][] matrix = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9}
			};
		int n = matrix.length-1;
		int matrix1[][] = new int[3][3];

		for(int i=0;i< matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				matrix1[j][n-i]	= matrix[i][j]	;		
			}
		}
		System.out.print("[");
        for (int i = 0; i < matrix1.length; i++) {
            System.out.print(Arrays.toString(matrix1[i]));
            if (i != matrix1.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

}
 
		
