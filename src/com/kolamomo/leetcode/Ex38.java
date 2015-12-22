package com.kolamomo.leetcode;

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
