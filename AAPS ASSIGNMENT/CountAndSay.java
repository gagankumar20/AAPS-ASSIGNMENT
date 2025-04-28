// 38. Count and Say.
// Write its algorithm, program.

public class CountAndSay {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String prev = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder curr = new StringBuilder();
            int count = 1;
            for (int j = 1; j < prev.length(); j++) {
                if (prev.charAt(j) == prev.charAt(j - 1)) {
                    count++;
                } else {
                    curr.append(count).append(prev.charAt(j - 1));
                    count = 1;
                }
            }
            curr.append(count).append(prev.charAt(prev.length() - 1));
            prev = curr.toString();
        }
        return prev;
    }
}

/*
Example:
Input: n = 4
Output: "1211"

Time Complexity: O(n * k) where n is the number of terms and k is the length of the string at each term.
Space Complexity: O(k) for the string builder
*/
