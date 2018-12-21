package p009.palindrome.number;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        return x == reverse(x);
    }

    private int reverse(int x) {

        int rev = 0;
        int pop;
        int maxcheck = Integer.MAX_VALUE / 10;
        int mincheck = Integer.MIN_VALUE / 10;
        while (x != 0) {
            pop = x % 10;
            x /= 10;
            if (rev > maxcheck || (rev == maxcheck && pop > 7)) return 0;
            if (rev < mincheck || (rev == mincheck && pop < -8)) return 0;
            rev = rev * 10 + pop;

        }
        return rev;
    }
}
