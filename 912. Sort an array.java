class Solution {
    /*public static int[] selectionSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            int small = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[small]){
                    small = j;
                }
            }
            //swap
            int temp = nums[i];
            nums[i] = nums[small];
            nums[small] = temp;
        }
        return nums;
    }*/ // it has time coml n^2 therefor time limit 
    public static void merge(int[] nums, int st, int end, int mid){
        int i = st;
        int j = mid+1;
        int[] temp = new int[nums.length];
        int idx = st;
        while(i<=mid && j<=end){
            if(nums[i]<nums[j]){
                temp[idx] = nums[i++];
                idx++;
            }
            else{
                temp[idx] = nums[j++];
                idx++;
            }
        }
        while(i<=mid){
            temp[idx++] = nums[i++];
        }
        while(j<=end){
            temp[idx++] = nums[j++];
        }
        for(int k=st;k<=end;k++){
            nums[k] = temp[k];
        }
    }
    public static void divide(int[] nums, int st, int end){
        if(st>=end) return;
        int mid = st + (end-st)/2;
        divide(nums,st,mid);
        divide(nums,mid+1,end);
        merge(nums,st,end,mid);
    }
    public int[] mergeSort(int[] nums, int st, int end){
        divide(nums,st,end);
        return nums;
    }

    public int[] sortArray(int[] nums) {
        //return selectionSort(nums);
        return mergeSort(nums,0,nums.length-1);
    }
}
