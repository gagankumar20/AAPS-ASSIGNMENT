// 25. Find if a number is a perfect square.
// Write its algorithm, program.

public class PerfectSquare {
    public boolean isPerfectSquare(int num) {
        long left = 1, right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid == num) return true;
            if (mid * mid < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}

/*
Example:
Input: num = 16
Output: true

Time Complexity: O(log n)
Space Complexity: O(1)
*/
