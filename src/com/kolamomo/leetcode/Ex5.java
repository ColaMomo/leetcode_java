package com.kolamomo.leetcode;

/**
 * Longest Palindromic Substring (最长回文子串)
 * 
 * <p>Given a string S, find the longest palindromic substring in S. <br>
 * You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.<br>
 *
 * @note 暴力法(n^3)，动态规划(n^2)，中心扩展(n^2)，manacher(n)
 * @author Jay
 *
 */
public class Ex5 {
	
	//中心扩展法，O(n^2)
    public String longestPalindrome(String s) {
    	int max = 0;
    	String result = "";
        for(int i = 0; i < s.length(); i++) {
        	String temp = getPalindrome(s, i-1 , i+1);
        	if(temp.length() > max) {
        		result = temp;
        		max = temp.length();
        	}
        	temp = getPalindrome(s, i, i+1);
        	if(temp.length() > max) {
        		result = temp;
        		max = temp.length();
        	}
        }
        return result;
    }
    
    private String getPalindrome(String s, int i, int j) {
    	while(i >= 0 && j < s.length()) {
    		if(s.charAt(i) == s.charAt(j)) {
    			i--;
    			j++;
    		} else {
    			break;
    		}
    	}
    	return s.substring(i+1, j);
    }

	//动态规划，O(n^2)，超时
	/*
    public String longestPalindrome(String s) {
    	int max = 0;
    	String result = "";
    	boolean[][] mark = new boolean[s.length() + 1][s.length() + 1];
    	initMark(mark, s);
        for(int i = 0; i < s.length(); i++) {
        	for(int j = i + 1 + max; j <= s.length(); j++) {
        		String temp = s.substring(i, j);
        		if(mark[i][j]) {
        			if(j - i > max) {
        				max = j - i;
        				result = temp;
        			}
        		}
        	}
        }
        return result;
    }

    private void initMark(boolean[][] mark, String s) {
		for(int i = 0; i < mark.length; i++) {
			for(int j = 0; j < mark.length; j++) {
				mark[i][j] = false;
			}
		}
		
		for(int i = 0; i < mark.length - 1; i++) {
			mark[i][i] = true;
			mark[i][i+1] = true;
		}
		
		for(int i = 0; i < mark.length; i++) {
			for(int j = 0; j < mark.length - i - 2; j++) {
				if(s.charAt(j) == s.charAt(j+1+i) && mark[j + 1][j + i + 1]) {
					mark[j][j+i + 2] = true;
				}
			}
		}
	}
	*/
	
	//暴力法，O(n^3)，超时
	/*
    public String longestPalindrome(String s) {
    	int max = 0;
    	String result = "";
        for(int i = 0; i < s.length(); i++) {
        	for(int j = i + 1 + max; j <= s.length(); j++) {
        		String temp = s.substring(i, j);
        		if(isPalindrome(temp)) {
        			if(j - i > max) {
        				max = j - i;
        				result = temp;
        			}
        		}
        	}
        }
        return result;
    }
    
    private boolean isPalindrome(String s) {
    	for(int i = 0; i < s.length() / 2; i++) {
    		if(s.charAt(i) != s.charAt(s.length() - 1- i)) {
    			return false;
    		}
    	}
    	return true;
    }
    */
    public static void main(String[] args) {
    	Ex5 ex5 = new Ex5();
//    	String s = "mxgvpawqpgecojxfvcgxsbrldktufdrogkogbltcezflyctklpqrjymqzyzmtlssnavzcquytcskcnjzzrytsvawkavzboncxlhqfiofuohehaygxidxsofhmh";
    	String s = "abcdefedb";
    	System.out.println(ex5.longestPalindrome(s));
    }
}
