/*
21. How to count the number of 1s in the binary representation of numbers from 0 to n.
    Write its algorithm, program. Find its time and space complexities. Explain with suitable example.
*/

public class CountBits {
    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] result = countBits(n);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)

Example:
Input: 5
Output: [0,1,1,2,1,2]
(0->0, 1->1, 2->1, 3->2, 4->1, 5->2)
*/
