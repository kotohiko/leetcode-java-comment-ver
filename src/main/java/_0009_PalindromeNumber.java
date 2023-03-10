/**
 * <h2>9. 回文数</h2>
 * <p>
 * <a href="https://leetcode.cn/problems/palindrome-number/">LeetCode link</a>
 *
 * @author Jacob Suen
 */
class PalindromeNumber_Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int y = 0;
        int z = x;
        while (x != 0) {
            y = y * 10 + x % 10;
            x /= 10;
        }
        return z == x;
    }
}
