// 24. Find the missing number from 0 to n.
// Write its algorithm, program.

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }
}

/*
Example:
Input: nums = [3,0,1]
Output: 2

Time Complexity: O(n)
Space Complexity: O(1)
*/
