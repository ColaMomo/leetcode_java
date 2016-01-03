package com.kolamomo.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Roman to Integer (罗马数字转阿拉伯数字)
 * 
 * <p>Given a roman numeral, convert it to an integer.<br>
 * Input is guaranteed to be within the range from 1 to 3999.<br>
 * @author Jay
 *
 */
public class Ex13 {
	
	private static Map<Character, Integer>romanMap = new HashMap<Character, Integer> ();
	static {
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
	}

    public int romanToInt(String s) {
    	int x = 0;
    	int i = s.length() - 1;
    	for(; i > 0; i--) {
    		char ch = s.charAt(i);
        	char preCh = s.charAt(i-1);
        	if(romanMap.get(ch) <= romanMap.get(preCh)) {
        		x += romanMap.get(ch);
        	} else {
        		x += (romanMap.get(ch) - romanMap.get(preCh));
        		i--;
        	}
    	}
    	if(i == 0) {
    		x += romanMap.get(s.charAt(0));
    	}
    	return x;
    }
    
    public static void main(String[] args) {
    	Ex13 ex13 = new Ex13();
    	System.out.println(ex13.romanToInt("DCXXI"));
    }
}
