package com.kolamomo.leetcode;

/**
 * Decode Ways
 *
 * <p>A message containing letters from A-Z is being encoded to numbers using the following mapping:<br>
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * Given an encoded message containing digits, determine the total number of ways to decode it.<br>
 *
 * For example,
 * Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
 * The number of ways decoding "12" is 2.
 *
 * @author jay
 */
public class Ex91 {
    public int numDecodings(String s) {
        int num1 = 0;
        int num2 = 0;
        if(s.length() == 0) {
            return 0;
        }

        if(s.charAt(0) == '0') {
            num1 = 0;
        } else {
            num1 = 1;
        }
        if(s.length() == 1 || s.charAt(0) == '0') {
            return num1;
        }
        if((s.charAt(0) == '1' && s.charAt(1) != '0') || (s.charAt(0) == '2' && s.charAt(1) >= '1' && s.charAt(1) <= '6')) {
            num2 = 2;
        } else if(s.charAt(1) == '0' && s.charAt(0) != '1' && s.charAt(0) != '2'){
            num2 = 0;
        } else {
            num2 = 1;
        }

        for(int index = 2; index < s.length(); index++) {
            int num3 = 0;
            if(s.charAt(index) == '0' && s.charAt(index - 1) != '1' && s.charAt(index - 1) != '2') {
                return 0;
            }

            if(s.charAt(index - 1) == '1' || (s.charAt(index - 1) == '2' && s.charAt(index) <= '6')) {
                num3 += num1;
            }
            if(s.charAt(index) >= '1' && s.charAt(index) <= '9') {
                num3 += num2;
            }
            num1 = num2;
            num2 = num3;
        }

        return num2;
    }

    public static void main(String[] args) {
        Ex91 ex91 = new Ex91();
        System.out.println(ex91.numDecodings("10"));
    }
}
