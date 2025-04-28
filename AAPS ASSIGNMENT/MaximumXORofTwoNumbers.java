/*
18. Find the maximum XOR of two numbers in an array.
    Write its algorithm, program. Find its time and space complexities. Explain with suitable example.
*/

import java.util.HashSet;

public class MaximumXORofTwoNumbers {
    public static int findMaximumXOR(int[] nums) {
        int max = 0, mask = 0;
        for (int i = 31; i >= 0; i--) {
            mask |= (1 << i);
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num & mask);
            }
            int temp = max | (1 << i);
            for (int prefix : set) {
                if (set.contains(temp ^ prefix)) {
                    max = temp;
                    break;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3, 10, 5, 25, 2, 8};
        System.out.println("Maximum XOR: " + findMaximumXOR(nums));
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)

Example:
Input: [3,10,5,25,2,8]
Output: 28
*/
