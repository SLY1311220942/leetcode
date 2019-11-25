package com.sly.leetcode.algorithms.simple;

/**
 * <p>67.二进制求和</p>
 * <p>给定两个二进制字符串，返回他们的和（用二进制表示）。</p>
 * <p>输入为非空字符串且只包含数字 1 和 0。</p>
 * <p>示例 1:</p>
 * <p>输入: a = "11", b = "1"</p>
 * <p>输出: "100"</p>
 * <p>示例 2:</p>
 * <p>输入: a = "1010", b = "1011"</p>
 * <p>输出: "10101"</p>
 * <p></p>
 * <p></p>
 * @author sly
 * @time 2019年9月4日
 */
public class Problem0067 {
	
	public static void main(String[] args) {
		//10000101
		// 1111010
		//    1011
		System.out.println(addBinary("1111010", "1011"));
	}

	public static String addBinary(String a, String b) {
		char[] lchar = b.toCharArray();
		char[] schar = a.toCharArray();
		if (a.length() >= b.length()) {
			lchar = a.toCharArray();
			schar = b.toCharArray();
		}
		StringBuilder sum = new StringBuilder("");
		int jws = 0;
		for (int i = 0; i < lchar.length; i++) {
			if (schar.length - i - 1 >= 0) {
				if (((lchar[lchar.length - i - 1] - '0') + (schar[schar.length - i - 1] - '0') + jws) >= 2) {
					if (((lchar[lchar.length - i - 1] - '0') + (schar[schar.length - i - 1] - '0') + jws) == 2) {
						sum.insert(0, "0");
					} else {
						sum.insert(0, "1");
					}
					jws = 1;
				} else {
					sum.insert(0, (lchar[lchar.length - i - 1] - '0') + (schar[schar.length - i - 1] - '0') + jws);
					jws = 0;
				}
			} else {
				if ((lchar[lchar.length - i - 1] - '0') + jws == 2) {
					sum.insert(0, "0");
					jws = 1;
				} else {
					sum.insert(0, (lchar[lchar.length - i - 1]  - '0') + jws);
					jws = 0;
				}
			}

		}

		if (jws == 1) {
			sum.insert(0, "1");
		}

		return sum.toString();
	}
}
