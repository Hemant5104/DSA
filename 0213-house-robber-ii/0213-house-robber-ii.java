class Solution {
    int dp[];
   

    public int solve(int[] nums, int start, int end) {
        if (start >= end)
            return 0;
        if (dp[start] != -1)
            return dp[start];
        int notake = solve(nums, start + 1, end);
        int take = nums[start] + solve(nums, start + 2, end);
        return dp[start] = Math.max(take, notake);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp, -1);
        if (nums.length == 1)
            return nums[0];
        int a = solve(nums, 0, n - 1);
    
        Arrays.fill(dp, -1);

        int b = solve(nums, 1, n);
        return Math.max(a, b);
    }
}