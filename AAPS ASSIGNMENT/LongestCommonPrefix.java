/*
9. Find the longest common prefix among a list of strings.
   Write its algorithm, program. Find its time and space complexities.
   Explain with suitable example.
*/

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(strs));
    }
}

/*
Time Complexity: O(n * m), where n = number of strings, m = length of shortest string
Space Complexity: O(1)

Example:
Input: ["flower","flow","flight"]
Output: "fl"
*/
