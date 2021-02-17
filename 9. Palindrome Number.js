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

js solution:

const isPalindrome = x => {
    if (x < 0) return false

    let reversed = 0, y = x

    while (y > 0) {
        const lastDigit = y % 10
        reversed = (reversed * 10) + lastDigit
        y = (y / 10) | 0
    }
    return x === reversed
}
