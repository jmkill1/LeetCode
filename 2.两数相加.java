/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode p1 = l1, p2 = l2;
        ListNode head = new ListNode();
        ListNode p = head;
        while(p1!=null || p2!=null || carry!=0){
            if(p1 != null){
                carry += p1.val;
                p1 = p1.next;
            }
            if(p2 != null){
                carry += p2.val;
                p2 = p2.next;
            }
            p.next = new ListNode(carry%10);
            carry /= 10;
            p = p.next;
        }
        return head.next;
    }
}
// @lc code=end

