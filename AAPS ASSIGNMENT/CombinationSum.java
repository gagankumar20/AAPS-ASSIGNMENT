// 37. Combination Sum.
// Write its algorithm, program.

import java.util.*;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
            temp.add(candidates[i]);
            backtrack(result, temp, candidates, remain - candidates[i], i);  // i instead of i + 1 to allow repetition
            temp.remove(temp.size() - 1);
        }
    }
}

/*
Example:
Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]

Time Complexity: O(2^n)
Space Complexity: O(target) (space for storing result combinations)
*/
