class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Stack<Integer> s = new Stack<>();
        for (int i : nums2) {
            s.push(i);
        }
        
        for(int i =0; i<nums1.length; i++){
            Stack<Integer> temp = new Stack<>();
            boolean f = false;
            int cur = nums1[i];
            int max = -1;
            while(!s.isEmpty() && !f){
                int top = s.pop();
                if(top > cur) {
                    max = top;
                }else if (top == cur){
                    f = true;
                }
                temp.push(top);
            }
            res[i] = max;
            while(!temp.isEmpty()) {
                s.push(temp.pop());
            }
        }
        return res;
    }
}
