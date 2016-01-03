package com.kolamomo.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Letter Combinations of a Phone Number
 * 
 * <p>Given a digit string, return all possible letter combinations that the number could represent. <br>
 * A mapping of digit to letters (just like on the telephone buttons) is given below. <br>
 * Input:Digit string "23" <br>
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]. <br>
 * 
 * <p>笛卡尔乘积
 * @author Jay
 *
 */
public class Ex17 {
	private static Map<Integer, Character[]> digitMap= new HashMap<Integer, Character[]>();
	static {
		digitMap.put(2, new Character[] {'a', 'b', 'c'});
		digitMap.put(3, new Character[] {'d', 'e', 'f'});
		digitMap.put(4, new Character[] {'g', 'h', 'i'});
		digitMap.put(5, new Character[] {'j', 'k', 'l'});
		digitMap.put(6, new Character[] {'m', 'n', 'o'});
		digitMap.put(7, new Character[] {'p', 'q', 'r', 's'});
		digitMap.put(8, new Character[] {'t', 'u', 'v'});
		digitMap.put(9, new Character[] {'w', 'x', 'y', 'z'});
	}
	
    public List<String> letterCombinations(String digits) {
    	List<String> result = new ArrayList<String> ();
        List<Character []> list = new ArrayList<Character []> ();
        for(int i = 0; i < digits.length(); i++) {
        	list.add(digitMap.get(Integer.valueOf(digits.charAt(i)-'0')));
        }
        if(list.size() != 0) {
	        char[] chArr = new char[list.size()];
	        getCombinations(chArr, 0, list, result);
        }
        return result;
    }
    
    private void getCombinations(char[] chArr, int index, List<Character []> chList, List<String> resultList)  {
    	if(index == chArr.length) {
    		resultList.add(new String(chArr));
    	} else {
    		for(int i = 0; i < chList.get(index).length; i++) {
    			chArr[index] = chList.get(index)[i];
    			getCombinations(chArr, index+1, chList, resultList);
    		}
    	}
    }
    
    public static void main(String[] args) {
    	Ex17 ex17 = new Ex17();
    	List<String> result = ex17.letterCombinations("");
    	for(int i = 0; i < result.size(); i++) {
    		System.out.println(result.get(i));
    	}
    }
}
