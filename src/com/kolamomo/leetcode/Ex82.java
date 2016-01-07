package com.kolamomo.leetcode;

/**
 * Remove Duplicates from Sorted List II
 *
 * <p>Given a sorted linked list, delete all nodes that have duplicate numbers, <br>
 * leaving only distinct numbers from the original list.<br><br>
 *
 * For example,<br>
 * Given 1->2->3->3->4->4->5, return 1->2->5.<br>
 * Given 1->1->1->2->3, return 2->3.<br>
 *
 * @author jay
 */
public class Ex82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = null;
        ListNode pNode = head;
        while(pNode != null) {
            boolean duplicate = false;
            while(pNode.next != null && pNode.val == pNode.next.val) {
                duplicate = true;
                pNode = pNode.next;
            }
            if(!duplicate) {
                if(prev == null) {
                    head = pNode;
                    prev = pNode;
                } else {
                    prev.next = pNode;
                    prev = prev.next;
                }
            }
            pNode = pNode.next;
        }
        if(prev == null) {
            head = null;
        } else {
            prev.next = pNode;
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
