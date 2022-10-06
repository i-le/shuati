class Solution {
    public int maximumProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        
        for(int x: nums){
            if(x<min1){
                min1 = x;
                min2 = min1;
            }else if(x<min2){
                min2 = x;
            }
            if(x>max1){
                max3=max2;
                max2=max1;
                max1 = x;
            }else if (x>max2){
                max3=max2;
                max2=x;
            }else{
                max3=x;
            }
        }
        return Math.max(min1*min2*max1, max1*max2*max3);
    }
}
