/*
8. Find the longest palindromic substring in a given string.
   Write its algorithm, program. Find its time and space complexities.
   Explain with suitable example.
*/

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); // odd length
            int len2 = expandAroundCenter(s, i, i + 1); // even length
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        
        return s.substring(start, end + 1);
    }
    
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(s));
    }
}

/*
Time Complexity: O(n^2)
Space Complexity: O(1)

Example:
Input: "babad"
Output: "bab" or "aba"
*/
