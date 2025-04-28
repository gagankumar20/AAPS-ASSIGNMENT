/*
6. Find the length of the longest substring without repeating characters.
   Write its algorithm, program. Find its time and space complexities.
   Explain with suitable example.
*/

import java.util.HashSet;

public class LongestUniqueSubstring {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring(s));
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)

Example:
Input: "abcabcbb"
Output: 3 ("abc")
*/
