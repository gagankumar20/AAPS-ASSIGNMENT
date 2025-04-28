/*
5. Find the maximum sum of any subarray of size K in a given array.
   Write its algorithm, program. Find its time and space complexities.
   Explain with suitable example.
*/

public class MaxSumSubarraySizeK {
    public static int maxSum(int[] arr, int k) {
        if (arr.length < k) return -1;
        
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        
        int maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k = 2;
        System.out.println("Maximum sum of subarray of size " + k + ": " + maxSum(arr, k));
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)

Example:
arr = [100, 200, 300, 400], k = 2
Max sum = max(100+200, 200+300, 300+400) = 700
*/
