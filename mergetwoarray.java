package leetcode;
import java.util.*;

public class mergetwoarray {
    
    static void myMethod(int arr1[], int arr2[], int n, int m) {
        int[] arr3 = new int[n + m];
        int left = 0;
        int right = 0;
        int index = 0;

        // Merging both arrays into arr3
        while (left < n && right < m) {
            if (arr1[left] <= arr2[right]) {
                arr3[index++] = arr1[left++];
            } else {
                arr3[index++] = arr2[right++];
            }
        }

        // Copy remaining elements from arr1 if any
        while (left < n) {
            arr3[index++] = arr1[left++];
        }

        // Copy remaining elements from arr2 if any
        while (right < m) {
            arr3[index++] = arr2[right++];
        }

        // Copy back the merged elements into arr1 and arr2
        
        // ** by omitting these we can get merged output ***
        for (int i = 0; i < n + m; i++) {
            if (i < n) {
                arr1[i] = arr3[i];
            } else {
                arr2[i - n] = arr3[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int n = arr1.length;
        int m = arr2.length;

        myMethod(arr1, arr2, n, m);

        System.out.println("Merged arr1: " + Arrays.toString(arr1));
        System.out.println("Merged arr2: " + Arrays.toString(arr2));
    }
}

