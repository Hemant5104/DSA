class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
       
        // ans.add(new ArrayList<>(List.of(1)));
        // ans.add(new ArrayList<>(List.of(1,1)));
        for(int i=0;i<numRows;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    temp.add(1);
                }
                else{
                int x=ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                temp.add(x);
            }}
            ans.add(temp);

        }
        return ans;
    }
}