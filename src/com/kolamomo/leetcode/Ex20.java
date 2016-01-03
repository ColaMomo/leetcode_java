package com.kolamomo.leetcode;

import java.util.Stack;

/**
 * Valid Parentheses (括号匹配问题)
 * 
 * <p>Given a string containing just the characters '(', ')', '{', '}', '[' and ']', <br>
 * determine if the input string is valid.<br>
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.<br>
 * 
 * @note 使用栈
 * @author Jay
 *
 */
public class Ex20 {
    public boolean isValid(String s) {
    	Stack<Character> stack = new Stack<Character> ();
        for(int i = 0; i < s.length(); i++) {
        	char ch = s.charAt(i);
        	if(ch == '(' || ch == '[' || ch=='{') {
        		stack.push(ch);
        	}
        	else if(ch == ')') {
        		if(stack.isEmpty() || stack.pop() != '(') {
        			return false;
        		}
        	}  else if(ch == ']') {
        		if(stack.isEmpty() || stack.pop() != '[') {
        			return false;
        		}
        	}  else if(ch == '}') {
        		if(stack.isEmpty() || stack.pop() != '{') {
        			return false;
        		}
        	}
        }
        if(stack.isEmpty()) {
        	return true;
        } else {
        	return false;
        }
    }
    
}
