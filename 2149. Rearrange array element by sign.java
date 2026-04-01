class Solution {
    public int[] rearrangeArray(int[] nums) {
        /*Queue<Integer>pos = new LinkedList<>();
        Queue<Integer>neg = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) pos.add(nums[i]);
            else neg.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(i%2==0) nums[i] = pos.poll();
            else nums[i] = neg.poll();
        }
        return nums;*/

        int pos = 0;
        int neg = 1;
        int []ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[pos] = nums[i];
                pos += 2;
            }
            else{
                ans[neg] = nums[i];
                neg +=2;
            }
        }
        return ans;
    }
}
