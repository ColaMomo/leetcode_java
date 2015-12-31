package com.kolamomo.leetcode;

public class Ex29 {
    public int divide(int dividend, int divisor) {
        long result = 0;
        int sign = getSign(dividend, divisor);
        if(divisor == 0) {
        	return Integer.MAX_VALUE;
        }
        long dividendLong = Math.abs((long)dividend);
        long divisorLong = Math.abs((long)divisor);
        if(divisorLong > dividendLong) {
        	return 0;
        }
        while(true) {
            long tempDivisor = divisorLong;
            int exponent = 0;
	        while( dividendLong - (tempDivisor << 1) >= 0) {
	        	tempDivisor <<=  1;
	        	exponent++;
	        }
	        result += (long)Math.pow(2, exponent);
	        dividendLong -= tempDivisor;
	        if(dividendLong - divisorLong < 0 ) {
	        	break;
	        }
        }
        result = result * sign;
        if(result > Integer.MAX_VALUE) {
        	return Integer.MAX_VALUE;
        } else {
        	return (int)result;
        }
    }

    private int getSign(int i1, int i2) {
    	if((i1 >= 0 && i2 >=0) || (i1 <= 0 && i2 <= 0) ) {
    		return 1;
    	} else {
    		return -1;
    	}
    }

	//减法 超时
	/*
    public int divide(int dividend, int divisor) {
        int result = 0;
        int sign = getSign(dividend, divisor);
        if(divisor == 0) {
        	return Integer.MAX_VALUE;
        }
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        while(dividend >= 0) {
        	dividend -= divisor;
        	result++;
        }
        if(dividend != 0) {
        	result--;
        }
        return result * sign;
    }

    private int getSign(int i1, int i2) {
    	if((i1 >= 0 && i2 >=0) || (i1 <= 0 && i2 <= 0) ) {
    		return 1;
    	} else {
    		return -1;
    	}
    }
    */
	
    public static void main(String[] args) {
    	Ex29 ex29 = new Ex29();
    	System.out.println(ex29.divide(Integer.MIN_VALUE, -1));
//    	System.out.println(1 >> 2);
    	
    }
}
