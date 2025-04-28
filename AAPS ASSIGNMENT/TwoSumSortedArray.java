/*
11. Find two numbers in a sorted array that add up to a target.
    Write its algorithm, program. Find its time and space complexities.
    Explain with suitable example.
*/

public class TwoSumSortedArray {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] {left + 1, right + 1}; // 1-based index
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {-1, -1}; // Not found
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numbers, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)

Example:
Input: numbers = [2,7,11,15], target = 9
Output: [1,2] (2+7=9)
*/
