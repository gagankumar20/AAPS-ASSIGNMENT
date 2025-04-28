// 39. Combination Sum II.
// Write its algorithm, program.

import java.util.*;

public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] candidates, int remain, int start) {
        if (remain < 0) return;
        if (remain == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue; // skip duplicates
            temp.add(candidates[i]);
            backtrack(result, temp, candidates, remain - candidates[i], i + 1); // i + 1 to avoid repetition
            temp.remove(temp.size() - 1);
        }
    }
}

/*
Example:
Input: candidates = [10,1,2,7,6,5], target = 8
Output: [[1,2,5],[1,7],[2,6]]

Time Complexity: O(2^n)
Space Complexity: O(target) (space for storing result combinations)
*/
