// Question 50:
// Write a program to rotate an array in different ways.
// Write its algorithm, program. Find its time and space complexities. Explain with suitable example.

import java.util.Arrays;

public class RotateArray {

    // Method 1: Rotate using reversal
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle k > n

        reverse(nums, 0, n - 1);         // Reverse entire array
        reverse(nums, 0, k - 1);          // Reverse first k elements
        reverse(nums, k, n - 1);          // Reverse remaining elements
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // Method 2: Rotate using extra array
    public static int[] rotateWithExtraArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums1, 3);
        System.out.println("Rotated using reversal: " + Arrays.toString(nums1));

        int[] nums2 = {1, 2, 3, 4, 5, 6, 7};
        int[] rotated = rotateWithExtraArray(nums2, 3);
        System.out.println("Rotated using extra array: " + Arrays.toString(rotated));
    }
}

/*
Output:
Rotated using reversal: [5, 6, 7, 1, 2, 3, 4]
Rotated using extra array: [5, 6, 7, 1, 2, 3, 4]

Explanation:
Method 1 (Reversal Algorithm):
- Reverse the whole array.
- Reverse first k elements.
- Reverse the remaining elements.
  
Method 2 (Using Extra Array):
- Create a new array.
- Place each element at its rotated position.

Time Complexity:
- Both methods have O(n) time complexity (where n is the array size).

Space Complexity:
- Method 1 (reversal): O(1) - In-place, no extra space.
- Method 2 (extra array): O(n) - Extra array of size n created.
*/