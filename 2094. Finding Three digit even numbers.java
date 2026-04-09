class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer>set = new HashSet<>();// to avoid similar no.s
        
        for(int i=0;i<digits.length;i++){
            int num = 0;
            if(digits[i]%2 == 0){
                 num += digits[i];
                for(int j=0;j<digits.length;j++){
                    if(j!=i){
                        num += 10*digits[j];
                        for(int k=0;k<digits.length;k++){
                            if(digits[k] != 0 && (k!=i && k!=j)){
                                num += 100*digits[k];
                                set.add(num);
                                num -= 100*digits[k];
                            }
                        }
                        num -= 10*digits[j]; 
                    }
                }
                num -= digits[i];
                 }
        }
        int []ans = new int[set.size()];
        int r= 0;
        for (int value : set) { // for loop to traverse each element of set. 
            ans[r] = value; 
            r++;
        }
        Arrays.sort(ans);
        return ans;
    }
}
