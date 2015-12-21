package com.kolamomo.leetcode;

import java.util.Stack;

public class Ex20 {
    public boolean isValid(String s) {
    	Stack<Character> chQueue = new Stack<Character> ();
        for(int i = 0; i < s.length(); i++) {
        	char ch = s.charAt(i);
        	if(ch == '(' || ch == '[' || ch=='{') {
        		chQueue.push(ch);
        	}
        	else if(ch == ')') {
        		if(chQueue.isEmpty() || chQueue.pop() != '(') {
        			return false;
        		}
        	}  else if(ch == ']') {
        		if(chQueue.isEmpty() || chQueue.pop() != '[') {
        			return false;
        		}
        	}  else if(ch == '}') {
        		if(chQueue.isEmpty() || chQueue.pop() != '{') {
        			return false;
        		}
        	}
        }
        if(chQueue.isEmpty()) {
        	return true;
        } else {
        	return false;
        }
    }
    
}
