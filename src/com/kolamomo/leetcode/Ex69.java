package com.kolamomo.leetcode;


/**
 * Sqrt(x) My Submissions Question
 * 
 * <p>Implement int sqrt(int x).<br>
 * Compute and return the square root of x.<br>
 * @author jiangchao
 *
 */
public class Ex69 {
	public int mySqrt(int x) {
		int temp = x;
		int count = 1;
		while(temp>1) {
			count++;
			temp /= 10;
		}
		long end = 1;
		for(int i = 0; i < (count + 1) / 2; i++) {
			end *= 10;
		}
		return calculateSqrt(x, 0, end);
	}
	
	private int calculateSqrt(int x, long start, long end) {
		if(start > end) {
			return (int)end;
		} else {
			long mid = (start + end) / 2;
			if(mid * mid == x) {
				return (int)mid;
			} else if(mid * mid < x) {
				return calculateSqrt(x, mid+1, end);
			} else {
				return calculateSqrt(x, start, mid-1);
			}
		}
	}
	
	public static void main(String[] args) {
		Ex69 ex69 = new Ex69();
		System.out.println(ex69.mySqrt(0));
		System.out.println(ex69.mySqrt(10));
		System.out.println(ex69.mySqrt(100));
		System.out.println(ex69.mySqrt(1000));
		System.out.println(ex69.mySqrt(10000));
		System.out.println(ex69.mySqrt(100000));		
		System.out.println(ex69.mySqrt(2147395599));
		System.out.println(ex69.mySqrt(183692308));
	}
}
