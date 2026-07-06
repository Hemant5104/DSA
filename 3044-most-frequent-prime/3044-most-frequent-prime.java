class Solution {
    static boolean isPrime(int x){
        if(x==0 || x==1) return false;
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0)return false;
        }
        return true;
    }

    public int mostFrequentPrime(int[][] mat) {
        int[][] dirs = {{-1, -1}, {-1, 0}, {-1, 1},{0, -1},{0, 1},{1, -1},  {1, 0},  {1, 1}};
        int n=mat.length;
        int m=mat[0].length;
        HashMap<Integer,Integer>map=new HashMap<>();
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    for(int []dir:dirs){
                        int x=i;
                        int y=j;
                        int nums=0;
                        while(x>=0 && x<n && y>=0 && y<m){
                            nums=nums*10+mat[x][y];
                            if(nums>=10 && isPrime(nums)){
                                map.put(nums,map.getOrDefault(nums,0)+1);
                            }
                            x+=dir[0];
                        y+=dir[1];
                        }
                        
                    }
                }
            }
            int max=Integer.MIN_VALUE;
            int ans=-1;
            for(int prime:map.keySet()){
                if(map.get(prime)>max || (map.get(prime)==max &&prime>ans)){
                    ans=prime;
                    max=map.get(prime);
                }
            }
            return ans;
    }
}