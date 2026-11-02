import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int[] candidates, int target, int index,
                           List<Integer> current, List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0 || index == candidates.length) {
            return;
        }

        // Include the current candidate
        current.add(candidates[index]);

        // Same number can be used again
        backtrack(candidates, target - candidates[index],
                  index, current, result);

        // Backtrack: remove the last element
        current.remove(current.size() - 1);

        // Skip the current candidate
        backtrack(candidates, target, index + 1, current, result);
    }
}