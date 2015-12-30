package com.kolamomo.leetcode;

public class Ex24 {
	/**
	 * Definition for singly-linked list.
	 */
	public class Solution {
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
	}
	
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	 
	 public static void main(String[] args) {
		 
	 }
}
