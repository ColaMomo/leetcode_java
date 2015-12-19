package com.kolamomo.leetcode;

public class Ex7 {
	public int reverse(int x) {
		int result = 0;
		while(x != 0) {
			if(Math.abs(result)  >= (double)Integer.MAX_VALUE / 10) {
				return 0;
			}
			result = result * 10 + x % 10;
			x = x / 10;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Ex7 ex7 = new Ex7();
		System.out.println(ex7.reverse(1534236469));
		System.out.println(Integer.MAX_VALUE);
	}

}
