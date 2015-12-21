package com.kolamomo.leetcode;

public class Ex9 {
    public boolean isPalindrome(int x) {
    	if(x < 0) {
    		return false;
    	}
        int base1 = 1;
        int y = x;
        while(y >= 10) {
        	base1 = base1 * 10;
        	y = y/10;
        }
        int base2 = 1;
        while(true) {
        	if(base1 <= base2) {
        		return true;
        	}
        	int high = x / base1 % 10;
        	int low = x / base2 % 10 ;
        	if(low != high) {
        		return false;
        	} else {
        		base1 = base1 / 10;
        		base2 = base2 * 10;
        	}
        }
    }
    
    public static void main(String[] args) {
    	Ex9 ex9 = new Ex9();
    	System.out.println(ex9.isPalindrome(1000000001));
    }

}
