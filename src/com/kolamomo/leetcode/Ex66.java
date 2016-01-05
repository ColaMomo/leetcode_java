package com.kolamomo.leetcode;

import java.util.Arrays;

/**
 * Plus One
 * 
 * <p>Given a non-negative number represented as an array of digits, plus one to the number.<br>
 * The digits are stored such that the most significant digit is at the head of the list.<br>
 * @author jiangchao
 *
 */
public class Ex66 {
	public int[] plusOne(int[] digits) {
		int[] result = new int[digits.length];
		result[digits.length - 1] = (digits[digits.length - 1] + 1) % 10;
		int carryBit =  (digits[digits.length - 1] + 1) / 10;
		boolean topCarryTag = (carryBit == 1);
		int i = digits.length - 2;
		for(; i >= 0; i--) {
			result[i] = ( digits[i] + carryBit ) % 10;
			carryBit = ( digits[i] + carryBit ) / 10;
			if(carryBit == 0) {
				topCarryTag = false;
				break;
			} 
		}
		if(!topCarryTag) {
			while(i > 0) {
				i--;
				result[i] = digits[i];
			}
			return result;
		} else {
			int[] newResult = new int[digits.length + 1];
			newResult[0] = 1;
			for(int j = 1; j < newResult.length; j++) {
				newResult[j] = result[j - 1];
			}
			return newResult;
		}
	}
	
	public static void main(String[] args) {
		Ex66 ex66 = new Ex66();
		int[] result = ex66.plusOne(new int[]{1,1,1});
		System.out.println(Arrays.toString(result));
		result = ex66.plusOne(new int[]{1,1,0});
		System.out.println(Arrays.toString(result));
		result = ex66.plusOne(new int[]{0});
		System.out.println(Arrays.toString(result));
		result = ex66.plusOne(new int[]{9});
		System.out.println(Arrays.toString(result));
	}
}
