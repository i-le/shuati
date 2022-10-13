class Solution {
    public int findGCD(int[] nums) {
        int l = nums[0];
        int s = nums[0];
        for(int i : nums){
            l = Math.max(l,i);
            s = Math.min(s,i);
        }
        
        if(l%s == 0){
            return s;
        } else {
            for (int i = s;i>0;i--){
                if(l%i==0 && s%i==0){
                    return i;
                }
            }
        }
        
        
        
        return 0;
    }
}
