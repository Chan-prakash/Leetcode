package hardlevel;
import java.util.*;

public class majorityElement {
    public static void main(String[] args) {
        int[] s = {1, 2, 3, 3, 2};  // Example input
        int n = s.length;
        int majority = n / 3;

        ArrayList<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (seen.contains(s[i])) continue; // Skip duplicates

            int count = 0;
            for (int j = 0; j < n; j++) {
                if (s[i] == s[j]) count++;
            }

            if (count > majority) {
                result.add(s[i]);
            }

            seen.add(s[i]); // Mark this number as checked
        }

        System.out.println(result);
    }
}
