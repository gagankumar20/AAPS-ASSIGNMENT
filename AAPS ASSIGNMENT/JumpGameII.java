// 45. Jump Game II.
// Write its algorithm, program.

public class JumpGameII {
    public int jump(int[] nums) {
        int jumps = 0, curEnd = 0, curFarthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            curFarthest = Math.max(curFarthest, i + nums[i]);
            if (i == curEnd) {
                jumps++;
                curEnd = curFarthest;
            }
        }
        return jumps;
    }
}

/*
Example:
Input: nums = [2,3,1,1,4]
Output: 2

Time Complexity: O(n)
Space Complexity: O(1)
*/
