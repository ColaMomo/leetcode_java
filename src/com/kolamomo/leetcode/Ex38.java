package com.kolamomo.leetcode;

/**
 * Count and Say
 * 
 * <p>The count-and-say sequence is the sequence of integers beginning as follows: <br>
 * 1, 11, 21, 1211, 111221, ... <br>
 * 1 is read off as "one 1" or 11. <br>
 * 11 is read off as "two 1s" or 21. <br>
 * 21 is read off as "one 2, then one 1" or 1211. <br>
 * Given an integer n, generate the nth sequence. <br>
 * 
 * Note: The sequence of integers will be represented as a string. <br>
 * @author Jay
 *
 */
public class Ex38 {
    public String countAndSay(int n) {
    	String s = "1";
    	for(int i = 1; i < n; i++) {
    		s = getCountAndSayString(s);
    	}
        return s;
    }
    
    private String getCountAndSayString(String str) {
    	int index = 0;
    	int count = 1;
    	StringBuilder strBuilder = new StringBuilder();
    	while(index < str.length() - 1) {
    		if(str.charAt(index) == str.charAt(index + 1)) {
    			count++;
    		} else {
    			strBuilder.append(count).append(str.charAt(index));
    			count = 1;
    		}
    		index++;
    	}
    	strBuilder.append(count).append(str.charAt(str.length() - 1));
    	return strBuilder.toString();
    }
   
    public static void main(String[] args){
    	Ex38 ex38 = new Ex38();
    	System.out.println(ex38.countAndSay(6));
    }
}
