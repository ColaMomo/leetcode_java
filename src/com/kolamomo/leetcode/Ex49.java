package com.kolamomo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Group Anagrams
 * 
 * <p>Given an array of strings, group anagrams together. <br><br>
 * 
 * For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], <br>
 * Return:<br>
 * [<br>
 *   ["ate", "eat","tea"],<br>
 *   ["nat","tan"],<br>
 *   ["bat"]<br>
 * ]<br><br>
 * 
 * Note:<br>
 * For the return value, each inner list's elements must follow the lexicographic order.<br>
 * All inputs will be in lower-case.<br>
 * 
 * @author Jay
 *
 */
public class Ex49 {
	
    public List<List<String>> groupAnagrams(String[] strs) {
    	List<List<String>> resultList = new ArrayList<List<String>> ();
    	
    	Map<String, List<String>> strMap = new HashMap<String, List<String>>(); 
		for(int i = 0; i < strs.length; i++) {
			char[] chArr = strs[i].toCharArray();
			Arrays.sort(chArr);
			String key = String.valueOf(chArr);
			if(strMap.containsKey(key)) {
				strMap.get(key).add(strs[i]);
			} else {
				List<String> strList = new ArrayList<String> ();
				strList.add(strs[i]);
				strMap.put(key, strList);
			}
		}
		
		for(String key : strMap.keySet()) {
			List<String> strList = strMap.get(key);
			Collections.sort(strList);
			resultList.add(strList);
		}
    	return resultList;
    }
    
	/*
    public List<List<String>> groupAnagrams(String[] strs) {
    	List<List<String>> resultList = new ArrayList<List<String>> ();
    	int[] strTag = new int[strs.length];
    	
    	for(int i = 0; i < strs.length; i++) {
    		SortedSet<String> strList = new TreeSet <String> ();
    		if(strTag[i] == 0) {
    			strList.add(strs[i]);
    			strTag[i] = 1;
    		} else {
    			continue;
    		}
    		for(int j = i+1; j < strs.length; j++) {
    			if(strTag[j] == 1) {
    				continue;
    			}
    			if(sameGroup(strs[i], strs[j])) {
    				strList.add(strs[j]);
    				strTag[j] = 1;
    			}
    		}
    		resultList.add(new ArrayList<String>(strList));
    	}
    	    
    	return resultList;
    }
    
    private boolean sameGroup(String str1, String str2) {
    	if(str1.length() != str2.length()) {
    		return false;
    	}
    	
    	for(int i = 0; i < str1.length(); i++) {
    		if(str2.indexOf(str1.charAt(i)) == -1) {
    			return false;
    		}
    	}
    	return true;
    }
    */
    public static void main(String[] args) {
    	Ex49 ex49 = new Ex49();
    	List<List<String>> resultList = ex49.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    	for(int i = 0; i < resultList.size(); i++) {
    		for(int j = 0; j < resultList.get(i).size(); j++) {
    			System.out.print(resultList.get(i).get(j) + " ");
    		}
    		System.out.println();
    	}
    }

}
