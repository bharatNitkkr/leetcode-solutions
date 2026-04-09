class Solution {
    public static int helper(int[] nums, int target,int st,int end){
        if(st>end) return -1;
        int mid =st + (end-st)/2;

        if(nums[mid]==target) return mid;
        else {
            if(target>nums[mid]){
                return helper(nums,target,mid+1,end);
            }
            else if(target<nums[mid]){
                return helper(nums,target,st,mid-1);
            }
        }
        return -1;
        
    }
    public int search(int[] nums, int target) {
        return helper(nums,target,0,nums.length-1);
    }


}
