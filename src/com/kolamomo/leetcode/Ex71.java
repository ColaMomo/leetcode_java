package com.kolamomo.leetcode;

import java.util.Stack;

/**
 * Simplify Path
 *
 * <p>Given an absolute path for a file (Unix-style), simplify it.<br><br>
 * For example,<br>
 * path = "/home/", => "/home"<br>
 * path = "/a/./b/../../c/", => "/c"<br>
 * click to show corner cases.<br><br>
 *
 * Corner Cases:<br>
 * Did you consider the case where path = "/../"?<br>
 * In this case, you should return "/".<br>
 * Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".<br>
 * In this case, you should ignore redundant slashes and return "/home/foo".<br>
 *
 *     @author jiangchao
 */
public class Ex71 {
    public String simplifyPath(String path) {
        String[] pathArr = path.split("/");
        Stack<String> stack = new Stack<String>();
        for(int i = 0; i < pathArr.length; i++) {
            String str = pathArr[i];
            if("".equals(str) || ".".equals(str)) {
                continue;
            } else if("..".equals(str)) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(str);
            }
        }
        if(stack.isEmpty()) {
            return "/";
        } else {
            String result = "";
            String str = "";
            while(!stack.isEmpty()) {
                str = stack.pop();
                result = "/" + str + result;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Ex71 ex71 = new Ex71();
        System.out.println(ex71.simplifyPath("/a/./b/../../c/"));
        System.out.println(ex71.simplifyPath("/../"));
        System.out.println(ex71.simplifyPath("/home//foo/"));
    }
}
