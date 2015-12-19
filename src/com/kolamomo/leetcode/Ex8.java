package com.kolamomo.leetcode;

public class Ex8 {
	public int myAtoi(String str) {
		int result = 0;
		int sign = 1;
		boolean format = true;
			
		int i = 0;
		for(; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				continue;
			} else if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				result = str.charAt(i) - '0';
				break;
			} else if(str.charAt(i) == '-'){
				sign = -1;
				break;
			} else if(str.charAt(i)== '+'){
				break;
			} else {
				format = false;
				break;
			}
		}
		
		i++;
		if(format) {
			for(; i < str.length(); i++) {
				if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
					long temp = sign * ( (long)result * 10 + (str.charAt(i) - '0') );
					if(temp > Integer.MAX_VALUE) {
						return Integer.MAX_VALUE;
					} else if(temp < Integer.MIN_VALUE) {
						return Integer.MIN_VALUE;
					} else {
						result =result * 10 + (str.charAt(i) - '0');
					}
				} else {
					break;
				}
			}
			return result * sign;
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Ex8 ex8 = new Ex8();
		System.out.println(Integer.MAX_VALUE);

		System.out.println(ex8.myAtoi("    2147483648"));
	}
}
