package com.kolamomo.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex36 {
    public boolean isValidSudoku(char[][] board) {
    	for(int i = 0; i < 9; i++) {
    		List<Character> list1 = new ArrayList<Character> ();
    		List<Character> list2 = new ArrayList<Character> ();
    		for(int j = 0; j < 9; j++) {
    			if(board[i][j] != '.') {
    				list1.add(board[i][j]);
    			}
    			if(board[j][i] != '.') {
    				list2.add(board[j][i]);
    			}
    		}
    		if(!isValid(list1) || !isValid(list2)) {
    			return false;
    		}
    	}
    	
    	for(int i = 0; i < 3; i++) {
    		for(int j = 0; j < 3; j++) {
        		List<Character> list3 = new ArrayList<Character> ();
    			for(int k = 0; k < 3; k++) {
    				for(int r = 0; r < 3; r++) {
	        			if(board[3*i+k][3*j + r] != '.') {
	        				list3.add(board[3*i+k][3*j + r]);
	        			}
    				}
    			}
        		if(!isValid(list3)) {
        			return false;
        		}
    		}
    	}
        return true;
    }
    
    private boolean isValid(List<Character> list) {
    	Set<Character> set = new HashSet<Character> (list);
    	return set.size() == list.size();
    } 
    
    public static void main(String[] args) {
    	char[][] board = {".87654321".toCharArray(),"2........".toCharArray(),"3........".toCharArray(),"4........".toCharArray(),"5........".toCharArray(),"6........".toCharArray(),"7........".toCharArray(),"8........".toCharArray(),"9........".toCharArray()};
    	Ex36 ex36 = new Ex36();
    	System.out.println(ex36.isValidSudoku(board));
    }
}
