package leetcode;
public class pascalncr {
    // Function to calculate nCr
    public static long funcncr(int n, int r) {
        if (r > n) {
            return 0;  // nCr is undefined if r > n
        }
        if (r == 0 || r == n) {
            return 1;  // nC0 or nCn is 1
        } 
        long res = 1;

        // Calculate nCr iteratively
        for (int i = 0; i < r; i++) {
            res = res * (n - i);  // Multiply the numerator (n * (n-1) * ... * (n-r+1))
            res = res / (i + 1);  // Divide by the denominator (1 * 2 * ... * r)
        }

        return res;
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println(funcncr(2,4));  // Output: 10
        System.out.println(funcncr(6, 3));  // Output: 20
        System.out.println(funcncr(10,3)); // Output: 210
    }
}

