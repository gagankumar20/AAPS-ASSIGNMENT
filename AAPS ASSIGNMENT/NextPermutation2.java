// Question 48:
// Write a program to find the next permutation of a given array.
// Write its algorithm, program. Find its time and space complexities. Explain with suitable example.

import java.util.Arrays;

public class NextPermutation2 {

    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        // Step 1: Find the first decreasing element from the end
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = nums.length - 1;

            // Step 2: Find element just greater than nums[i]
            while (nums[j] <= nums[i]) {
                j--;
            }

            // Step 3: Swap nums[i] and nums[j]
            swap(nums, i, j);
        }

        // Step 4: Reverse the elements after position i
        reverse(nums, i + 1, nums.length - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println("Next Permutation: " + Arrays.toString(nums));
    }
}

/*
Output:
Next Permutation: [1, 3, 2]

Explanation:
- Find the first number from the end which is smaller than its next number (pivot).
- Find the number just larger than the pivot and swap them.
- Reverse the array from pivot+1 to the end.

Example Walkthrough:
Input: [1,2,3]
- Pivot at 2 (index 1)
- Swap 2 and 3
- Reverse elements after index 1 => [1,3,2]

Time Complexity:
O(n) - Single pass for finding pivot, another pass for reversing.

Space Complexity:
O(1) - In-place operations, no extra space used.
*/