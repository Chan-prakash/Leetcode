package leetcode;
public class Containsduplicate {
    public static boolean hasDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true; // Duplicates found
                }
            }
        }
        return false; // No duplicates
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        if (hasDuplicates(arr)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}


/* Great question! Let's break down how the comparison between the values `4` and `5` works in the inner loop.

### Here's how the logic works:

Given an array like `{1, 2, 3, 4, 5, 1}`, we want to check each element in the array for duplicates. The inner loop (`j`) always starts at `i + 1` to compare the current element (`arr[i]`) with the rest of the elements that come after it. 

#### Let's walk through the iteration process:

1. **Outer loop (`i`)**: It starts from `i = 0` (the first element) and goes up to `arr.length - 1`.

2. **Inner loop (`j`)**: For each `i`, the inner loop starts from `i + 1` and compares `arr[i]` with `arr[j]` for every `j`.

3. **Example with array `{1, 2, 3, 4, 5, 1}`**:

    - **i = 0 (arr[0] = 1)**:
        - Compare `arr[0]` with `arr[1]`, `arr[2]`, `arr[3]`, `arr[4]`, and `arr[5]`.
        - No duplicates until we reach `arr[5]` where `arr[0] == arr[5]` (both are `1`), so the function returns `true` here. But let's assume the duplicate is at the end and you want to continue iterating.

    - **i = 1 (arr[1] = 2)**:
        - Compare `arr[1]` with `arr[2]`, `arr[3]`, `arr[4]`, and `arr[5]`. No duplicates found.
    
    - **i = 2 (arr[2] = 3)**:
        - Compare `arr[2]` with `arr[3]`, `arr[4]`, and `arr[5]`. No duplicates found.
    
    - **i = 3 (arr[3] = 4)**:
        - Compare `arr[3]` with `arr[4]` and `arr[5]`. No duplicates found when comparing `arr[3]` with `arr[4]` and `arr[5]`.

    - **i = 4 (arr[4] = 5)**:
        - Compare `arr[4]` with `arr[5]`. No duplicates found when comparing `arr[4] == arr[5]`.

#### Why `j < arr.length` works:

- **When `i = 4`**, `j = i + 1 = 5`. The inner loop will compare `arr[4]` (which is `5`) with `arr[5]` (which is `1`).
- After this, `j` increments to `6`, and since `6 >= arr.length`, the inner loop stops, ensuring there are no out-of-bounds errors.

#### Correct iteration logic:

- For the last two elements (`arr[4] = 5` and `arr[5] = 1`), they are compared exactly once in the inner loop, ensuring the comparison is valid without trying to access `arr[6]`, which would be out of bounds.

### Final Code:

```java
public static boolean hasDuplicates(int[] arr) {
    for (int i = 0; i < arr.length; i++) {             // Outer loop for each element
        for (int j = i + 1; j < arr.length; j++) {     // Inner loop to compare with remaining elements
            if (arr[i] == arr[j]) {
                return true;  // Duplicate found
            }
        }
    }
    return false;  // No duplicates found
}
```

- **Correct Comparisons**:
  - `arr[3]` is compared with `arr[4]`.
  - `arr[4]` is compared with `arr[5]`.

Since the inner loop stops before going out of bounds, this approach ensures that all valid comparisons are made.*/
