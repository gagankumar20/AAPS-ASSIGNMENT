// Question 49:
// Write a program to search an element in a rotated sorted array.
// Write its algorithm, program. Find its time and space complexities. Explain with suitable example.

public class SearchRotatedSortedArray {

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            }

            // Check if left half is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // Target in left half
                } else {
                    left = mid + 1; // Target in right half
                }
            }
            // Otherwise, right half is sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // Target in right half
                } else {
                    right = mid - 1; // Target in left half
                }
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = search(nums, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in array.");
        }
    }
}

/*
Output:
Target found at index: 4

Explanation:
- The array is rotated.
- We perform a modified binary search:
  - Check which half is sorted.
  - Decide where to search based on target position relative to sorted half.

Example Walkthrough:
Input: [4,5,6,7,0,1,2], target = 0
- Mid element 7
- Left half sorted but 0 < 4, so search right
- New mid is 0 -> found at index 4

Time Complexity:
O(log n) - Because we are doing binary search.

Space Complexity:
O(1) - Only a few variables used for pointers.
*/