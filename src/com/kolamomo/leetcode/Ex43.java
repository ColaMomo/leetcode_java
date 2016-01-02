package com.kolamomo.leetcode;

public class Ex43 {
    public String multiply(String num1, String num2) {
        int[][] temp = new int[num2.length()][num1.length() + num2.length()];
        for(int i = num2.length() - 1; i >= 0; i--) {
        	int carryBit = 0;
        	int multiplier = num2.charAt(i) - '0';
        	int index = num1.length() + num2.length() - 1;
        	for(int j = num2.length() - 1; j > i; j--) {
        		temp[i][index--] = 0;
        	}
        	for(int j = num1.length() - 1; j >= 0; j--) {
        		int num = multiplier * (num1.charAt(j) - '0') + carryBit;
        		temp[i][index--] = num % 10;
        		carryBit = num / 10;
        	}
        	temp[i][index] = carryBit;
        }
        int[] resultInt = new int[num1.length() + num2.length()];
        for(int i = 0; i < num2.length(); i++) {
            int carryBit = 0;
            int index = num1.length() + num2.length() -1;
        	for(int j = num1.length() + num2.length() - 1; j >= 0; j--) {
        		int num = resultInt[index] + temp[i][j] + carryBit;
        		resultInt[index] = num % 10;
        		carryBit = num / 10;
        		index--;
        	}
        }
        
        String result = "";
        int i = 0;
        while(i < resultInt.length) {
        	if(resultInt[i] != 0) {
        		break;
        	}
        	i++;
        }
        if(i == resultInt.length) {
        	result = "0";
        } else {
        	while(i < resultInt.length) {
        		result += resultInt[i];
        		i++;
        	}
        }
        return result;
    }
    
    public static void main(String[] args) {
    	Ex43 ex43 = new Ex43();
    	System.out.println(ex43.multiply("11", "0"));
    }

}
