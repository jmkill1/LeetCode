/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    private int lo, maxLen;

    public String longestPalindrome(String s) {
        lo = 0;
        maxLen = 0;
        int n = s.length();
        if (n < 2) {
            return s;
        }
        for (int i = 0; i < n - 1; i++) {
            expand(s, i, i);
            expand(s, i, i + 1);
        }
        return s.substring(lo, lo + maxLen);
    }

    private void expand(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        if (maxLen < j - i - 1) {
            lo = i + 1;
            maxLen = j - i - 1;
        }
    }
}
// @lc code=end
