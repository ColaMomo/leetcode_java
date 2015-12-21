package com.kolamomo.leetcode;

import com.kolamomo.leetcode.Ex19.ListNode;

public class Ex21 {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode p1 = l1;
		ListNode p2 = l2;
		ListNode head = null;
		if(l1 == null) {
			return l2;
		}
		if(l2 == null) {
			return l1;
		}
		if(l1.val < l2.val) {
			head = l1;
			p1 = p1.next;
		} else {
			head= l2;
			p2 = p2.next;
		}
		ListNode p = head;
		while( p1 != null && p2 != null ) {
			if(p1.val < p2.val) {
				p.next = p1;
				p1 = p1.next;
				p = p.next;
			} else {
				p.next = p2;
				p2 = p2.next;
				p = p.next;
			}
		}
		if(p1 == null) {
			p.next = p2;
		} else {
			p.next = p1;
		}
		return head;
	}
	
	public class ListNode {
		int val;
		ListNode next;
	 	ListNode(int x) { val = x; }
	}
}
