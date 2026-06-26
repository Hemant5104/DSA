class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[]=new int[nums.length];
        int n=nums.length;
        Stack<Integer>st=new Stack<>();
        Arrays.fill(ans,-1);
        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty()&&st.peek()<=nums[i%n]){
                st.pop();
            }
            if(i<n){
                if(!st.isEmpty()){
                    ans[i]=st.peek();
                }
            }
            st.push(nums[i%n]);
        }
        return ans;
    }
}