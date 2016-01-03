package com.kolamomo.leetcode;

/**
 * ZigZag Conversion
 * 
 * <p>The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)<br>
 * P   A   H   N<br>
 * A P L S I I G<br>
 * Y   I   R<br>
 * And then read line by line: "PAHNAPLSIIGYIR"<br>
 * Write the code that will take a string and make this conversion given a number of rows:<br>
 * string convert(string text, int nRows);<br>
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".<br>
 * @author Jay
 *
 */
public class Ex6 {
	public String convert(String s, int numRows) {
		if(numRows == 1) {
			return s;
		}
		String[] strArr = new String[numRows];
		for(int i = 0; i < numRows; i++) {
			strArr[i] = "";
		}
		int k = -1;
		int j = -1;
		while(j < s.length() - 1) {
			while(k != numRows - 1 && j < s.length() -1) {
				strArr[++k] += s.charAt(++j);
			}
			while(k != 0 && j < s.length() -1) {
				strArr[--k] += s.charAt(++j);
			}
		}
		String result = "";
	    for(int i = 0; i < numRows; i++) {
	    	for(int r = 0; r < strArr[i].length(); r++) {
	    		result += strArr[i].charAt(r);
	    	}
	    }
	    return result;
	}

	public static void main(String[] args) {
		Ex6 ex6 = new Ex6();
		System.out.println(ex6.convert("ABCDEFG", 3));
	}
}
