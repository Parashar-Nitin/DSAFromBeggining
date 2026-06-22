class Solution {
    public double myPow(double x, long n) {

        if(n<0) 
        {
            x=1/x;
            n*=-1;
        }
        double pow=x;
        double ans=1;
        while(n>=1)
        {
            long curr=n%2;
            if(curr==1)
            {
                ans=ans*pow;
            }
            n/=2;
            pow*=pow;
        }
        return ans;
    }
}