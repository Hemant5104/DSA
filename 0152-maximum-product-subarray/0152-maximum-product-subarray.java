class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int currmax=nums[0];
        int currmin=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        for(int i=1;i<nums.length;i++){
            int pro=currmax*nums[i];
            currmax=Math.max(pro,Math.max(currmin*nums[i],nums[i]));
            currmin=Math.min(pro,Math.min(currmin*nums[i],nums[i]));

            max=Math.max(max,currmax);
        }
        
        return max;
    }
}