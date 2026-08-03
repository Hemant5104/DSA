class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[]=new int[nums.length];
        int min=Integer.MAX_VALUE;
        Arrays.fill(dp,1);
        
        int ans =1;
        int n=nums.length;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
}