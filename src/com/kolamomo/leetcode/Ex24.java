package com.kolamomo.leetcode;

/**
 * Swap Nodes in Pairs
 * <P>Given a linked list, swap every two adjacent nodes and return its head.<br><br>
 * For example,<br>
 * Given 1->2->3->4, you should return the list as 2->1->4->3.<br>
 * Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.<br>
 * @author Jay
 *
 */
public class Ex24 {
    public ListNode swapPairs(ListNode head) {
    	ListNode p = null; 
    	ListNode q = null;
    	ListNode r = null;
    	if(head == null || head.next == null) {
    		return head;
    	}
        q = head.next.next;
        head.next.next = head;
        head = head.next;
        p = head.next;
        if(q != null) {
        	r = q.next;
        }
        while(r != null) {
	        p.next = r;
	        p = q;
	        q = r.next;
	        r.next = p;
	        if(q != null) {
		        r = q.next;
	        } else {
	        	break;
	        }
        }
        p.next = q;
	    return head;
    }
	
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	 
	public static void main(String[] args) {
		 
	}
}
