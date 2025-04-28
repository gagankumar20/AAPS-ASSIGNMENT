// 35. Search insert position.
// Write its algorithm, program.

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}

/*
Example:
Input: nums = [1,3,5,6], target = 5
Output: 2

Time Complexity: O(log n)
Space Complexity: O(1)
*/
