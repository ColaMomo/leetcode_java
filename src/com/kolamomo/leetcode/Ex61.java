package com.kolamomo.leetcode;

import com.kolamomo.leetcode.Ex19.ListNode;

/**
 * Rotate List
 * 
 * <p>Given a list, rotate the list to the right by k places, where k is non-negative.<br><br>
 * 
 * For example:
 * Given 1->2->3->4->5->NULL and k = 2,<br>
 * return 4->5->1->2->3->NULL.<br>
 * @author jiangchao<br>
 *
 */
public class Ex61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) {
            return head;
        }
    	ListNode pNode = head;
    	int count = 0;
    	while(pNode != null) {
    		count++;
    		pNode = pNode.next;
    	}
    	k = k % count;
    	if(k == 0) {
    		return head;
    	}
    	pNode = head;
    	for(int i = 1; i < count - k; i++) {
    		pNode = pNode.next;
    	}
    	ListNode qNode = pNode.next;
    	pNode.next = null;
    	pNode = qNode;
    	while(qNode.next != null) {
    		qNode = qNode.next;
    	}
    	qNode.next = head;
    	return pNode;
    }
}
