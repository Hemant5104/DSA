class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
            
        }
        int c=0;
        
        for(int i=k;i<arr.length;i++){
            int avg=sum/k;
            if(avg>=threshold){
                c++;
            }
            sum-=arr[i-k];
            sum+=arr[i];
        }
        if(sum/k>=threshold) c++;
        return c;
    }
}