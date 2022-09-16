/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, ans = 0;
        Set<Character> set = new HashSet<>();
        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, set.size());
            }else{
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
// @lc code=end

