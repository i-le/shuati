class HelloWorld {
    
    
    static int gcd(int a , int b ){
        if (a == 0){
            return b;
        }
        if (b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    
    static int findgcd(int[] nums){
        int res = 0;
        for (int i =0; i<nums.length;i++){
            res = gcd(res,nums[i]);
        }
        return res;
    }
    
    
    public static void main(String[] args) {
        int[] arr = {12,36,48};
        System.out.println(findgcd(arr));
    }
}
