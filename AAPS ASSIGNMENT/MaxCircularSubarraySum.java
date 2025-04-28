// 22. Find the maximum sum of a circular subarray.
// Write its algorithm, program.

public class MaxCircularSubarraySum {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int maxSum = nums[0], curMax = 0;
        int minSum = nums[0], curMin = 0;

        for (int num : nums) {
            curMax = Math.max(curMax + num, num);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin + num, num);
            minSum = Math.min(minSum, curMin);
            total += num;
        }
        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
    }
}

/*
Example:
Input: nums = [1, -2, 3, -2]
Output: 3

Time Complexity: O(n)
Space Complexity: O(1)
*/
