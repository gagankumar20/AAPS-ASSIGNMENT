// Question 44:
// How to find two numbers in an array that add up to a target using hashing.
// Write its algorithm, program. Find its time and space complexities. Explain with suitable example.

import java.util.HashMap;

public class TwoSumSolution {

    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Return indices
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1}; // Return -1 if no solution
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = findTwoSum(nums, target);

        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + nums[result[0]] + ", " + nums[result[1]]);
        } else {
            System.out.println("No two numbers found!");
        }
    }
}

/*
Output:
Indices: 0, 1
Values: 2, 7

Time Complexity:
O(n) - We traverse the array only once.

Space Complexity:
O(n) - We store up to n elements in the hash map.
*/