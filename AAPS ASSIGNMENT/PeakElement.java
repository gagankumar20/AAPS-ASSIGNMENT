// 34. Find the peak element.
// Write its algorithm, program.

public class PeakElement {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

/*
Example:
Input: nums = [1,2,3,1]
Output: 2

Time Complexity: O(log n)
Space Complexity: O(1)
*/
