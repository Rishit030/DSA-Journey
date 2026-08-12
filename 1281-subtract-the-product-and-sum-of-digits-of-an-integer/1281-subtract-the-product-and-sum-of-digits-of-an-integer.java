class Solution {
    public int subtractProductAndSum(int n) {
            int m=0;
            int sum=0;
            int prod=1;
            
        while(n>0){
                m=n%10;
                sum=sum+m;
                prod=prod*m;
                n=n/10;
        }
        int res=prod-sum;
        return res;
    }
}