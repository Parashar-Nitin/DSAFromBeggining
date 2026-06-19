class Solution {
    public int majorityElement(int[] nums) {
        int fre=1, ans=nums[0];
        for(int i=1; i<nums.length; i++)
        {
            if(ans==nums[i])
            {
                fre++;
            }
            else if(fre>1)
            {
                fre--;
            }
            else
            {
                ans=nums[i];
            }
        }
        return ans;
    }
}