package com.kolamomo.leetcode;

public class Ex19 {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode p = head;
		int length = 1;
		for(; p.next != null; p = p.next) {
			length++;
		}
		p = head;
		for(int i = 0; i < length - n - 1; i++) {
			p = p.next;
		}
		if(length == n) {
			head = head.next;
		} else {
			p.next = p.next.next;
		}
	    return head;
	}

	public class ListNode {
		int val;
		ListNode next;
	 	ListNode(int x) { val = x; }
	}

}
