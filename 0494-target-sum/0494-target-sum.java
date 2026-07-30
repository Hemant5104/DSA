class Solution {
    int dp[][];
    public int solve(int nums[],int target, int idx,int sum){
        if(idx>=nums.length){
            if(sum==target)return 1;
            else return 0;
        }
        if(dp[idx][sum+1000]!=-1)return dp[idx][sum+1000];
        int a=solve(nums,target,idx+1,sum+nums[idx]);
        int b=solve(nums,target,idx+1,sum-nums[idx]);
        return dp[idx][sum+1000]=a+b;
        
    }

    public int findTargetSumWays(int[] nums, int target) {
        int sum=0,idx=0;
        dp=new int[nums.length][2001];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<2001;j++){
                dp[i][j]=-1;
            }
        }
        return solve(nums,target,idx,sum);
    }
}