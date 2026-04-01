class Solution {
    public int majorityElement(int[] nums) {
       /* Arrays.sort(nums);
        int major = nums[0];
        int currNum = nums[0];
        int freq = 1;
        int maxFreq = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==currNum){
                freq++;
                if(freq>maxFreq) major = currNum;
                maxFreq = Math.max(maxFreq,freq);
            }
            else{
                freq = 1;
                currNum = nums[i];
            }
        }
        return major;*/
    Arrays.sort(nums);
    int n = nums.length;
    return nums[(n-1)/2];
    }
}
