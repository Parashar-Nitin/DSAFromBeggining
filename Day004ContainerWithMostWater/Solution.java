class Solution {
    public int maxArea(int[] height) {
        int start=0, end=height.length-1, result=0;
        while (start<end)
        {
            int h = (height[start]<height[end]) ? height[start] : height[end];
            int area = end-start;
            int curr = h*area;
            result = (result>curr) ? result : curr;
            if(height[end]>height[start]) start++;
            else end--;
        }
        return result;
    }
}