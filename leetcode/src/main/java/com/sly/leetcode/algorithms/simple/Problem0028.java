package com.sly.leetcode.algorithms.simple;

/**
 * <p>
 * 28.实现 strStr()
 * </p>
 * <p>
 * 实现 strStr() 函数。
 * </p>
 * <p>
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置
 * (从0开始)。如果不存在，则返回  -1。
 * </p>
 * <p>
 * 示例 1:
 * </p>
 * <p>
 * 输入: haystack = "hello", needle = "ll"
 * </p>
 * <p>
 * 输出: 2
 * </p>
 * <p>
 * 示例 2:
 * </p>
 * <p>
 * 输入: haystack = "aaaaa", needle = "bba"
 * </p>
 * <p>
 * 输出: -1
 * </p>
 * <p>
 * 说明:
 * </p>
 * <p>
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * </p>
 * <p>
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 * </p>
 * 
 * @author sly
 * @time 2019年8月22日
 */
public class Problem0028 {

	public static void main(String[] args) {
		String haystack = "hello";
		String needle = "hellos";
		int strStr = strStr(haystack, needle);
		System.out.println(strStr);
	}

	/**
	 * <p>暴力算法</p>
	 * @param haystack
	 * @param needle
	 * @return
	 * @author sly
	 * @time 2019年8月22日
	 */
	public static int strStr(String haystack, String needle) {
		if("".equals(needle)) {
			return 0;
		}
		char[] haystackArray = haystack.toCharArray();
		char[] needleArray = needle.toCharArray();
		
		
		for (int i = 0; i < haystackArray.length; i++) {
			if(i + needleArray.length <= haystackArray.length) {
				boolean flag = true;
				for (int j = 0; j < needleArray.length; j++) {
					if(haystackArray[i + j] != needleArray[j]) {
						flag = false;
						break;
					}
				}
				if(flag) {
					return i;
				}
			}
			
		}
		
		return -1;
	}
	
	/**
	 * 
	 * @param haystack
	 * @param needle
	 * @return
	 * @author sly
	 * @time 2019年8月22日
	 */
	public static int strStr2(String haystack, String needle) {
		return -1;
	}
}
