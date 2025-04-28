// 40. Combination Sum III.
// Write its algorithm, program.

import java.util.*;

public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), k, n, 1);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> temp, int k, int remain, int start) {
        if (temp.size() == k && remain == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i <= 9; i++) {
            temp.add(i);
            backtrack(result, temp, k, remain - i, i + 1); // avoid using same number again
            temp.remove(temp.size() - 1);
        }
    }
}

/*
Example:
Input: k = 3, n = 7
Output: [[1,2,4]]

Time Complexity: O(2^n) (due to backtracking)
Space Complexity: O(k) for the temporary list storage
*/
