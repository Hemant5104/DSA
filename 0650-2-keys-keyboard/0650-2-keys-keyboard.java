class Solution {
    public int minSteps(int n) {
        int seive[]=new int[1001];
        for(int i=0;i<=n;i++){
            seive[i]=i;
        }
        for(int i=2;i*i<=n;i++){
            if(seive[i]==i){
                for(int j=i*i;j<seive.length;j+=i){
                    if(seive[j]==j){
                        seive[j]=i;
                    }
                }
            }
        }
        int c=0;
        while(n>1){
            c+=seive[n];
            n/=seive[n];
        }
        return c;
    }
}