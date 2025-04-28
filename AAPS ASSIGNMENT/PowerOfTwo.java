// 23. How to check if a number is a power of two.
// Write its algorithm, program.

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return (n > 0) && (n & (n - 1)) == 0;
    }
}

/*
Example:
Input: n = 16
Output: true

Time Complexity: O(1)
Space Complexity: O(1)
*/
