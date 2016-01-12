package com.kolamomo.leetcode.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jay on 16-1-12.
 */
public class ListNodeUtils {
    public static ListNode createList(int[] nums) {
        ListNode head = new ListNode(nums[0]);
        ListNode p = head;
        for(int i = 1; i < nums.length; i++) {
            p.next = new ListNode(nums[i]);
            p = p.next;
        }
        p.next = null;
        return head;
    }

    public static List<Integer> getListValues(ListNode head) {
        ListNode p = head;
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;
        while(p != null) {
            list.add(p.val);
            p = p.next;
        }
        return list;
    }

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) { val = x; }
    }
}
