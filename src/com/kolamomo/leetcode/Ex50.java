package com.kolamomo.leetcode;

/**
 * Pow(x, n) 
 * 
 * <p>Implement pow(x, n).
 * @author Jay
 *
 */
public class Ex50 {
    public double myPow(double x, int n) {
        if(n == 0) {
        	return 1;
        } else if(n > 0) {
        	return calculatePositivePow(x, n);
        } else {
        	return 1 / calculatePositivePow(x, Math.abs(n));
        }
    }
    
    private double calculatePositivePow(double x, int n) {
        double result = 1;
        double base = x;
        if(n % 2 == 1) {
        	result = base;
        }
        n = n / 2;
        while(n != 0) {
        	base = base * base;
        	if(n % 2 == 1) {
        		result *= base;
        	}
        	n = n / 2;
        }
        return result;
    }

	//累乘法，超时
	/*
    public double myPow(double x, int n) {
        if(n == 0) {
        	return 1;
        }
        double result = 1;
        for(int i = 0; i < n; i++) {
        	result *= x;
        }
        return result;
    }
    */
    
    public static void main(String[] args) {
    	Ex50 ex50 = new Ex50();
    	System.out.println(ex50.myPow(34.00515, -3));
    	System.out.println(ex50.myPow(2, 4));
    }
}
