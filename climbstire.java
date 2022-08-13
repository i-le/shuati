class Solution {
    public int climbStairs(int n) {
        if (n==1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        
        int curr = 0;
        int pre2 = 2;
        int pre1 = 1;
        
        
        for (int i =3; i<=n; i++){
            curr = pre2 + pre1;
            pre2 = pre1;
            pre1 = curr;
        }
        
        return curr;
    }
    
}
