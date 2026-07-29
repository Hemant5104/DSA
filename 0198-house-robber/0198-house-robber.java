class Solution {
    int dp[];
    public int solve(int []nums,int idx){
        if(idx>=nums.length)return 0;
        if(dp[idx]!=-1)return dp[idx];
        int take=nums[idx]+solve(nums,idx+2);
        int notake=solve(nums,idx+1);
        return dp[idx]=Math.max(take,notake);
    }

    public int rob(int[] nums) {
        dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(nums,0);
    }
}