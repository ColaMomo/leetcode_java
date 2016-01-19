package com.kolamomo.leetcode;

import com.kolamomo.leetcode.utils.ListNodeUtils;
import com.kolamomo.leetcode.utils.ListNodeUtils.ListNode;
import com.kolamomo.leetcode.utils.ListUtils;

/**
 * Reverse Linked List II
 *
 * <p>Reverse a linked list from position m to n. Do it in-place and in one-pass. <br>
 * For example:
 * Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 * return 1->4->3->2->5->NULL.<br>
 * Note:
 * Given m, n satisfy the following condition:
 * 1 ≤ m ≤ n ≤ length of list.
 *
 * @author jay
 */
public class Ex92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode p = head;
        ListNode q = null;
        ListNode r = null;
        ListNode prev = null;
        ListNode start = null;
        int index = 1;
        if(m > 1) {
            while (index != m - 1) {
                p = p.next;
                index++;
            }
            prev = p;
            start = p.next;
            p = p.next;
            index++;
        } else {
            start = p;
        }
        q = p.next;
        while(index != n ) {
            r = q.next;
            q.next = p;
            p = q;
            q = r;
            index++;
        }
        if(m > 1) {
            prev.next = p;
        } else {
            head = p;
        }
        start.next = q;
        return head;
    }

    public static void main(String[] args) {
        Ex92 ex92 = new Ex92();
        ListNode head = ListNodeUtils.createList(new int[]{1, 2,3,4,5});
        ListUtils.printList(ListNodeUtils.getListValues(head));

        head = ex92.reverseBetween(head, 1, 5);
        ListUtils.printList(ListNodeUtils.getListValues(head));
    }
}
