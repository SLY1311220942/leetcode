package com.sly.leetcode.algorithms.simple;

/**
 * <p>
 * 14.最长公共前缀
 * </p>
 * <p>
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * </p>
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * </p>
 * <p>
 * 示例 1:
 * </p>
 * <p>
 * 输入: ["flower","flow","flight"]
 * </p>
 * <p>
 * 输出: "fl"
 * </p>
 * <p>
 * 示例 2:
 * </p>
 * <p>
 * 输入: ["dog","racecar","car"]
 * </p>
 * <p>
 * 输出: ""
 * </p>
 * <p>
 * 解释: 输入不存在公共前缀。
 * </p>
 * <p>
 * 说明:
 * </p>
 * <p>
 * 所有输入只包含小写字母 a-z 。
 * </p>
 * 
 * @author sly
 * @time 2019年8月12日
 */
public class Problem0014 {
	public static void main(String[] args) {
		//String[] strs = {"dog","racecar","car"};
		//String[] strs = {"flower","flow","flight"};
		String[] strs = {"flowable","flow","flowing"};
		System.out.println(longestCommonPrefix(strs));	
	}

	public static String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length < 1) {
			return "";
		}
		String minStr = strs[0];
		for (int i = 1; i < strs.length; i++) {
			if (minStr.length() > strs[i].length()) {
				minStr = strs[i];
			}
		}
		int index = 0;
		for (int i = 0; i < minStr.length(); i++) {
			for (int j = 0; j < strs.length; j++) {
				if (minStr.charAt(i) != strs[j].charAt(i)) {
					index = i;
					if (index > 0) {
						return minStr.subSequence(0, index).toString();
					} else {
						return "";
					}
				}
			}
		}
		return minStr;
	}
}
