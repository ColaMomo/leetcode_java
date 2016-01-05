package com.kolamomo.leetcode;

/**
 * Add Binary My Submissions Question
 * 
 * <p>Given two binary strings, return their sum (also a binary string).<br><br>
 * 
 * For example,<br>
 * a = "11"<br>
 * b = "1"<br>
 * Return "100".<br>
 * @author jiangchao
 *
 */
public class Ex67 {
	public String addBinary(String a, String b) {
		char[] arr = new char[Math.max(a.length(), b.length())];
		int i = a.length() - 1;
		int j = b.length() - 1;
		int k = arr.length - 1;
		int carryBit = 0;
		while(i >= 0 && j >= 0) {
			int num = (a.charAt(i) - '0' ) + (b.charAt(j) - '0') + carryBit;
			arr[k] = (char) (num % 2 + '0');
			carryBit = num / 2;
			i--;
			j--;
			k--;
		}
		while(i >= 0) {
			int num = (a.charAt(i) - '0' ) + carryBit;
			arr[k] = (char) (num % 2 + '0');
			carryBit = num / 2;
			i--;
			k--;
		}
		while(j >= 0) {
			int num = (b.charAt(j) - '0' ) + carryBit;
			arr[k] = (char) (num % 2 + '0');
			carryBit = num / 2;
			j--;
			k--;
		}
		if(carryBit == 1) {
			return "1" + String.valueOf(arr);
		} else {
			return String.valueOf(arr);
		}
	}
	
	public static void main(String[] args) {
		Ex67 ex67 = new Ex67();
		System.out.println(ex67.addBinary("1", "111"));
		System.out.println(ex67.addBinary("0", "0"));
	}
}
