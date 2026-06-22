class Solution {
    public double myPow(double x, int n) {

        double pow=x;
        double ans=1;
        while(n>=1)
        {
            int curr=n%2;
            if(curr==1)
            {
                ans=ans*pow;
            }
            //ans=ans+curr*mul;
            n/=2;
            pow*=pow;
        }
        return ans;
    }
}