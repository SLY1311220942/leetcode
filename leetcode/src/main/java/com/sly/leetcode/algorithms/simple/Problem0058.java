package com.sly.leetcode.algorithms.simple;

/**
 * <p>
 * 58.最后一个单词的长度
 * </p>
 * <p>
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * </p>
 * <p>
 * 如果不存在最后一个单词，请返回 0 。
 * </p>
 * <p>
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 * </p>
 * <p>
 * 示例:
 * </p>
 * <p>
 * 输入: "Hello World"
 * </p>
 * <p>
 * 输出: 5
 * </p>
 * 
 * @author sly
 * @time 2019年9月4日
 */
public class Problem0058 {

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("aaaa"));
	}

	public static int lengthOfLastWord(String s) {
		int n = 0;
		char[] chars = s.toCharArray();
		boolean flag = false;
		for (int i = chars.length - 1; i >= 0; i--) {
			if(chars[i] == ' ' && flag) {
				break;
			} else if(chars[i] != ' ') {
				flag = true;
				n ++;
			}
		}

		return n;
	}
}
