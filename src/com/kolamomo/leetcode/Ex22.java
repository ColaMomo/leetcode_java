package com.kolamomo.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * Generate Parentheses
 * 
 * <p>Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.<br>
 * For example, given n = 3, a solution set is:<br>
 * "((()))", "(()())", "(())()", "()(())", "()()()"<br>
 * 
 * @note 字符串排列问题
 * @author Jay
 *
 */
public class Ex22 {
    public List<String> generateParenthesis(int n) {
    	char[] chArr = new char[n * 2];
    	List<String> result= new ArrayList<String> ();
    	doGenerateParenthesis(chArr, 0, result);
    	return result;
    }
    
    private void doGenerateParenthesis(char[] chArr, int index, List<String> list) {
    	if(index == chArr.length) {
    		list.add(String.valueOf(chArr));
    	} else {
    		int countLeft = 0;
    		int countRight = 0;
    		for(int i = 0; i < index; i++) {
    			if(chArr[i] == '(') {
    				countLeft++;
    			} else {
    				countRight++;
    			}
    		}
    		if(countLeft <= countRight) {
    			chArr[index] = '(';
    			doGenerateParenthesis(chArr, index+1, list);
    		} else if(countLeft == chArr.length / 2) {
    			chArr[index] = ')';
    			doGenerateParenthesis(chArr, index+1, list);
    		} else {
    			chArr[index] = '(';
    			doGenerateParenthesis(chArr, index+1, list);
    			chArr[index] = ')';
    			doGenerateParenthesis(chArr, index+1, list);
    		}
    	}
    }
	
	
	//字符串全排列，再校验是否合法，超时
	/*
    public List<String> generateParenthesis(int n) {
    	List<String> resultList = new ArrayList<String> ();
    	char[] chArr = new char[n*2];
    	for(int i = 0; i < 2*n; i = i+2) {
    		chArr[i] = '(';
    		chArr[i+1] = ')';
    	}
    	Set<String> chSet = new HashSet<String> ();
    	perm(chArr, 0, n*2-1, chSet);
    	Iterator<String> setItr = chSet.iterator();
    	while(setItr.hasNext()) {
    		String str = setItr.next();
    		if(isReguler(str)) {
    			resultList.add(str);
    		}
    	}
    	return resultList;
    }
	private void perm(char[] chArr, int begin, int end, Set<String> set) {
		if(begin == end) {
			set.add(String.valueOf(chArr));
		} else {
			for(int i = begin; i <= end; i++) {
				char temp = chArr[begin];
				chArr[begin] = chArr[i];
				chArr[i] = temp;
				perm(chArr, begin+1, end, set);
				temp = chArr[begin];
				chArr[begin] = chArr[i];
				chArr[i] = temp;
			}
		}
	}
	
	private boolean isReguler(String str) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < str.length(); i++) {
        	Character ch = str.charAt(i);
        	if(ch == '(') {
        		stack.push(ch);
        	} else {
        		if(stack.isEmpty()) {
        			return false;
        		}  else {
        			stack.pop();
        		}
        	}
        }
        return stack.isEmpty();
    }
	*/
	public static void main(String[] args) {
		Ex22 ex22 = new Ex22();
		List<String> list = ex22.generateParenthesis(6);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
