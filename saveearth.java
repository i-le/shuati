class HelloWorld {
    
    

    
    public static void main(String[] args) {
        int[] arr = {2 ,-3, 8, -6, -7, 18, 1};
        int total = 0;
        for (int i=0; i<arr.length;i++){
            if (i%2 == 0){
                total = total + arr[i];
            }
        }
        System.out.println(total);
    }
}
