/*
16. Find the majority element in an array that appears more than n/2 times.
    Write its algorithm, program. Find its time and space complexities.
    Explain with suitable example.
*/

public class MajorityElementFinder {
    public static int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println("Majority Element: " + majorityElement(nums));
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)

Example:
Input: [2,2,1,1,1,2,2]
Output: 2
*/
