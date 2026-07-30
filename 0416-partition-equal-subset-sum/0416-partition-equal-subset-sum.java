class Solution {
    Boolean dp[][];
    public boolean solve (int idx,int nums[], int target){
      
        if(target==0)return true;
       if( idx>=nums.length){
            return false;
        }
        if(dp[idx][target]!=null)return dp[idx][target];
        if(solve(idx+1,nums,target))return dp[idx][target]=true;
        if(target>=nums[idx] && solve(idx+1,nums,target-nums[idx])){
            return dp[idx][target]=true;
        }
        return dp[idx][target]=false;
    }

    public boolean canPartition(int[] nums) {
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        dp=new Boolean[nums.length][sum/2+1];
        
        if(sum%2!=0)return false;

        return solve(0,nums,sum/2);
         
    }
}