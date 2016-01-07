package com.kolamomo.leetcode;

/**
 * Remove Duplicates from Sorted List
 *
 * <p>Given a sorted linked list, delete all duplicates such that each element appear only once. <br><br>
 *
 * For example,<br>
 * Given 1->1->2, return 1->2.<br>
 * Given 1->1->2->3->3, return 1->2->3.  <br>
 *
 * @author jay
 */
public class Ex83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pNode = head;
        while(pNode != null) {
            if(pNode.next != null && pNode.val == pNode.next.val) {
                pNode.next = pNode.next.next;
            } else {
                pNode = pNode.next;
            }
        }
        return head;
    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
