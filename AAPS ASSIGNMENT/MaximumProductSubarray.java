/*
19. How to find the maximum product subarray.
    Write its algorithm, program. Find its time and space complexities. Explain with suitable example.
*/

public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], result = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            
            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);
            
            result = Math.max(result, max);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println("Maximum product subarray: " + maxProduct(nums));
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)

Example:
Input: [2,3,-2,4]
Output: 6
*/
