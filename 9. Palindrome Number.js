public class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int y = 0;
        while (num > 0) {
            y = y * 10 + num % 10;
            num /= 10;
        }
        return x == y;
    }
}
