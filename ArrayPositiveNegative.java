package leetcode;
import java.util.*;
public class ArrayPositiveNegative {
    static void arrays(int arr[]) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        // Separate positive and negative numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else if (arr[i] < 0) {
                neg.add(arr[i]);
            }
        }
        // If the sizes of positive and negative arrays are unequal, print 0 and return
        if (pos.size() != neg.size()) {
            System.out.println(0);
            return;
        }
        // Alternately add positive and negative numbers to the result
        for (int j = 0; j < pos.size(); j++) {
            result.add(pos.get(j));
            result.add(neg.get(j));
        }
        // Print the result
        for (int n : result) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 3, -9, 8, -5};
        arrays(arr);
    }
}
