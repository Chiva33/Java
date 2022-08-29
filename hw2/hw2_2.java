package hw2;

public class hw2_2 {
    class Solution {
        public List<List<Integer>> combine(int n, int k) {
            List<Integer> nums = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                nums.add(i);
            }
            List<List<Integer>> ret = new ArrayList<>();
            dfs(nums, k, 0, new ArrayList<>(), ret);
            return ret;
        }

        private void dfs(List<Integer> nums, int k, int idx, List<Integer> path, List<List<Integer>> ret) {
            if (k == 0) {
                ret.add(path);
                return; // backtracking
            }
            for (int i = idx; i < nums.size(); i++) {
                List<Integer> p = new ArrayList<>(path);
                p.add(nums.get(i));
                dfs(nums, k-1, i+1, p, ret);
            }
        }
    }
    
}
