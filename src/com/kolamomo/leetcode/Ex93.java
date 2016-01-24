package com.kolamomo.leetcode;

import com.kolamomo.leetcode.utils.ListUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Restore IP Addresses
 *
 * <p>Given a string containing only digits, restore it by returning all possible valid IP address combinations. <br>
 *
 * For example:
 * Given "25525511135",
 * return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
 *
 * @author jay
 */
public class Ex93 {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<String>();
        String[] strArr = new String[4];
        generateIpAddress(s, 0, strArr, result);
        return result;
    }

    private void generateIpAddress(String s, int index, String[] strArr, List<String> result) {
        if(index == 3) {
            if(isCorrectIpFormat(s)) {
                String ip = "";
                for(int i = 0; i < 3; i++) {
                    ip = ip + strArr[i] + ".";
                }
                ip += s;
                result.add(ip);
            }
        } else {
            for(int i = 1; i <= s.length() && i <= 3; i++) {
                String str = s.substring(0, i);
                if(isCorrectIpFormat(str)) {
                    strArr[index] = str;
                    generateIpAddress(s.substring(i), index + 1, strArr, result);
                }
            }
        }
    }

    private boolean isCorrectIpFormat(String str) {
        if(str.length() <= 0 || str.length() > 3) {
            return false;
        }
        int num = Integer.valueOf(str);
        if(num >= 0 && num <= 255 && str.length() == String.valueOf(num).length()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Ex93 ex93 = new Ex93();
        List<String> result  = ex93.restoreIpAddresses("010010");
        ListUtils.printList(result);
    }
}
