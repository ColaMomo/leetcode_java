package com.kolamomo.leetcode;

/**
 * Add Two Numbers (大整数相加)
 * 
 * <p>You are given two linked lists representing two non-negative numbers. <br>
 * The digits are stored in reverse order and each of their nodes contain a single digit. <br>
 * Add the two numbers and return it as a linked list.<br><br>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)<br>
 * Output: 7 -> 0 -> 8
 * 
 * @author Jay
 *
 */
public class Ex2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode head = null;
    	ListNode p = null;
    	int temp = 0;
    	while(l1 != null &&  l2 != null) {
    		if(head == null) {
    			if(l1.val + l2.val + temp>= 10) {
    				p = new ListNode(l1.val + l2.val + temp - 10);
    				head = p;
    				temp = 1;
    			} else {
    				p = new ListNode(l1.val + l2.val + temp);
    				head = p;
    				temp = 0;
    			}
    		} else {
    			if(l1.val + l2.val + temp>= 10) {
    				p.next = new ListNode(l1.val + l2.val + temp - 10);
    				temp = 1;
    				p = p.next;
    			} else {
    				p.next = new ListNode(l1.val + l2.val + temp);
    				temp = 0;
    				p = p.next;
    			}
    		}
    		l1 = l1.next;
    		l2 = l2.next;
    	}
    	
        while(l1 != null) {
			if(l1.val + temp>= 10) {
				p.next = new ListNode(l1.val + temp - 10);
				temp = 1;
			} else {
				p.next = new ListNode(l1.val + temp);
				temp = 0;
			}
			l1 = l1.next;
			p = p.next;
        }
        while(l2 != null) {
			if(l2.val + temp>= 10) {
				p.next = new ListNode(l2.val + temp - 10);
				temp = 1;
			} else {
				p.next = new ListNode(l2.val + temp);
				temp = 0;
			}
			l2 = l2.next;
			p = p.next;
        }
        if(temp != 0) {
        	p.next = new ListNode(1);
        }
        return head;
    }
	    
	
    public class ListNode {
   	    int val;
   	    ListNode next;
 	    ListNode(int x) { val = x; }
    }
    
    public static void main(String[] args) {
    	Ex2 ex2 = new Ex2();
    	Ex2.ListNode l1 = ex2.new ListNode(5);
    	Ex2.ListNode l2 = ex2.new ListNode(5);
    	ListNode l3= ex2.addTwoNumbers(l1, l2);
    	while(l3 != null) {
    		System.out.print(l3.val);
    		l3=l3.next;
    	}
    }

}
 