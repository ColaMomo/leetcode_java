package com.kolamomo.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex17 {
//	private static Map<Integer, Character[]> digitMap= new HashMap<Integer, Character[]>();
//	static {
//		digitMap.put(2, new Character[] {'a', 'b', 'c'});
//		digitMap.put(3, new Character[] {'d', 'e', 'f'});
//		digitMap.put(4, new Character[] {'g', 'h', 'i'});
//		digitMap.put(5, new Character[] {'j', 'k', 'l'});
//		digitMap.put(6, new Character[] {'m', 'n', 'o'});
//		digitMap.put(7, new Character[] {'p', 'q', 'r', 's'});
//		digitMap.put(8, new Character[] {'t', 'u', 'v'});
//		digitMap.put(9, new Character[] {'w', 'x', 'y', 'z'});
//	}
//	
//    public List<String> letterCombinations(String digits) {
//    	List<String> result = new ArrayList<String> ();
//        List<Character []> list = new ArrayList<Character []> ();
//        for(int i = 0; i < digits.length(); i++) {
//        	System.out.println(Integer.valueOf(String.valueOf(digits.charAt(i))));
//        	list.add(digitMap.get(Integer.valueOf(String.valueOf(digits.charAt(i)))));
//        }
//        for(int i = 0; i < digits.length(); i++) {
//        	result.add(getCombinations(list, i, 0));
//        }
//        return result;
//    }
//    
//    private String getCombinations(List<Character []> list, int listIndex, int arrIndex)  {
//    	if(arrIndex < list.get(listIndex).length - 1) {
//    		return getCombinations(list, listIndex, arrIndex + 1);
//    	}
//    	return String.valueOf(list.get(listIndex)[arrIndex]);
//    }
//    
    public static void main(String[] args) {
    	Ex17 ex17 = new Ex17();
    	List<String> result = ex17.letterCombinations("23");
    	for(int i = 0; i < result.size(); i++) {
    		System.out.println(result.get(i));
    	}
    }
}
