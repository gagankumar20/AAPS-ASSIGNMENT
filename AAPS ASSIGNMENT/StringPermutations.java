/*
10. Generate all permutations of a given string.
    Write its algorithm, program. Find its time and space complexities.
    Explain with suitable example.
*/

public class StringPermutations {
    public static void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i); // backtrack
            }
        }
    }
    
    private static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        System.out.println("All permutations:");
        permute(str, 0, n - 1);
    }
}

/*
Time Complexity: O(n * n!) 
Space Complexity: O(n) (due to recursion stack)

Example:
Input: "ABC"
Output: ABC, ACB, BAC, BCA, CAB, CBA
*/
