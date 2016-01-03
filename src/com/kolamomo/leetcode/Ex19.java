package com.kolamomo.leetcode;

/**
 * Remove Nth Node From End of List
 * 
 * <p>Given a linked list, remove the nth node from the end of list and return its head.<br><br>
 * For example,<br>
 *    Given linked list: 1->2->3->4->5, and n = 2.<br>
 *    After removing the second node from the end, the linked list becomes 1->2->3->5.<br><br>
 * Note:<br>
 * Given n will always be valid.<br>
 * Try to do this in one pass.<br>
 * @author Jay
 *
 */
public class Ex19 {	
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
