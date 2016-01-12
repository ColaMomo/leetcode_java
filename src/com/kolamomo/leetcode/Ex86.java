package com.kolamomo.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

import com.kolamomo.leetcode.utils.ListNodeUtils;
import com.kolamomo.leetcode.utils.ListNodeUtils.ListNode;

/**
 * Partition List
 *
 * <p>Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
 * You should preserve the original relative order of the nodes in each of the two partitions.<br>
 *
 * For example,
 * Given 1->4->3->2->5->2 and x = 3,
 * return 1->2->2->4->3->5.
 *
 * @author jay
 */
public class Ex86 {
    public ListNode partition(ListNode head, int x) {
        if(head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode q = head;
        Queue<ListNode> queue = new LinkedList<ListNode>();
        while(q != null) {
            if(q.val >= x) {
                queue.offer(q);
                q = q.next;
            } else {
                if(prev == null) {
                    prev = q;
                    head = q;
                } else {
                    prev.next = q;
                    prev = prev.next;
                }
                q = q.next;
            }
        }
        while(!queue.isEmpty()) {
            q = queue.poll();
            if(prev == null) {
                head = q;
                prev = q;
            } else {
                prev.next = q;
                prev = prev.next;
            }
        }
        prev.next = null;
        return head;
    }

    public static void main(String[] args) {
        Ex86  ex86 = new Ex86();
//        ListNode head = ListNodeUtils.createList(new int[]{1, 4, 3, 2, 5, 2});
        ListNode head = ListNodeUtils.createList(new int[]{1});
        head = ex86.partition(head, 0);
        List<Integer> list = ListNodeUtils.getListValues(head);
        System.out.println(Arrays.toString(list.toArray(new Integer[0])));
    }
}
