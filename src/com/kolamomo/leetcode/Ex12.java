package com.kolamomo.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Integer to Roman (阿拉伯数字转罗马数字)
 * 
 * Given an integer, convert it to a roman numeral. <br>
 * Input is guaranteed to be within the range from 1 to 3999. <br>
 * @author Jay
 *
 */
public class Ex12 {
	
	public static Map<Integer, String>romanMap = new HashMap<Integer, String> ();
	static {
		romanMap.put(1, "I");
		romanMap.put(5, "V");
		romanMap.put(10, "X");
		romanMap.put(50, "L");
		romanMap.put(100, "C");
		romanMap.put(500, "D");
		romanMap.put(1000, "M");
	}
	
    public String intToRoman(int num) {
    	String result = "";
    	int base = 1000;
    	while(base != 0) {
    		if(num / base >= 5 && num / base <= 8) {
    			result += romanMap.get(base * 5);
    			num = num - base * 5;
    		} else {
	    		if(num / base == 9) {
	    			result += romanMap.get(base);
	    			result += romanMap.get(base * 10);
	    		} else if(num / base == 4) {
	    			result += romanMap.get(base);
	    			result += romanMap.get(base * 5);
	    		} else {
	    			for(int i = 0; i < num / base; i++) {
	    				result += romanMap.get(base);
	    			}
	    		}
        		num %= base;
        		base /= 10;
    		}
    	}
    	return result;
    }
    
    public static void main(String args[]) {
    	Ex12 ex12 = new Ex12();
    	System.out.println(5% 1);
    	System.out.println(ex12.intToRoman(399));
    }
}
