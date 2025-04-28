// Question 46:
// Write a program to find the longest palindromic substring in a given string.
// Write its algorithm, program. Find its time and space complexities. Explain with suitable example.

public class LongestPalindromeSubstring {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);      // Odd length palindrome
            int len2 = expandAroundCenter(s, i, i + 1);   // Even length palindrome
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
        String input = "babad";
        String result = longestPalindrome(input);
        System.out.println("Longest Palindromic Substring: " + result);
    }
}

/*
Output:
Longest Palindromic Substring: bab
(or "aba" — both are correct)

Explanation:
- We expand around every center and check the maximum length palindrome.
- For each character (and between each pair of characters), expand outward.

Time Complexity:
O(n^2) - For each character, we expand around center which could take O(n) time.

Space Complexity:
O(1) - We only use constant extra space.
*/