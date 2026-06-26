class SolutionByRecursion {

    public int binary(int start, int end, int [] nums, int target){
        int mid = start + (end-start)/2;

        if(start <= end)
        {
            if(nums[mid] < target) return binary(mid+1, end, nums, target);
            else if(nums[mid] > target) return binary(start, mid-1, nums, target);
            else return mid;
        }

        return -1;
        
    }
    public int search(int[] nums, int target) {
        int result = binary(0, nums.length-1, nums, target);
        return result;
    }
}