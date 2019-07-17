package com.sly.leetcode.algorithms.simple;

/**
 * 回文数
 * <p>
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数
 * 	<ul>
 * 		<li>示例 1: 输入: 121 输出: true</li>
 * 		<li>示例 2: 输入: -121 输出: false 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。</li>
 * 		<li>示例 3: 输入: 10 输出: false 解释: 从右向左读, 为 01 。因此它不是一个回文数。</li>
 * 	</ul>
 * </p>
 * @author sly
 * @time 2019年7月17日
 */
public class Problem0009 {

	public static void main(String[] args) {
		int x = 121;
		boolean palindrome = isPalindrome(x);
		System.out.println(palindrome);
	}

	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		StringBuilder builder = new StringBuilder();
		String xString = String.valueOf(x);
		char[] xChar = xString.toCharArray();
		for (int i = xChar.length - 1; i >= 0; i--) {
			builder.append(String.valueOf(xChar[i]));
		}
		return xString.equals(builder.toString());
	}
		
		
		

}
