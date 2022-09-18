/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int j = 0; j < sb.length; j++) {
            sb[j] = new StringBuilder();
        }
        int len = s.length();
        int i = 0;
        while (i < len) {
            for (int idx = 0; idx < numRows && i < len; idx++) {
                sb[idx].append(c[i++]);
            }
            for (int idx = numRows - 2; idx >= 1 && i < len; idx--) {
                sb[idx].append(c[i++]);
            }
        }
        for (int j = 1; j < sb.length; j++) {
            sb[0].append(sb[j]);
        }
        return sb[0].toString();
    }
}
// @lc code=end
