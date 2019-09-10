package com.sly.leetcode.algorithms.simple;

/**
 * <p>38.报数</p>
 * <p>报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：</p>
 * <p>1.     1</p>
 * <p>2.     11</p>
 * <p>3.     21</p>
 * <p>4.     1211</p>
 * <p>5.     111221</p>
 * <p>1 被读作  "one 1"  ("一个一") , 即 11。</p>
 * <p>11 被读作 "two 1s" ("两个一"）, 即 21。</p>
 * <p>21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。</p>
 * <p>给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。</p>
 * <p>注意：整数顺序将表示为一个字符串。</p>
 * <p>示例 1:</p>
 * <p>输入: 1</p>
 * <p>输出: "1"</p>
 * <p>示例 2:</p>
 * <p>输入: 4</p>
 * <p>输出: "1211"</p>
 * @author sly
 * @time 2019年9月4日
 */
public class Problem0038 {
	
	public static void main(String[] args) {
		System.out.println(countAndSay(6)); 
	}

	public static String countAndSay(int n) {
		if(n == 1) {
			return "1";
		}
		String str = countAndSay(n - 1);
		char[] charArray = str.toCharArray();
		StringBuffer newStr = new StringBuffer();
		char value = charArray[0];
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			if(value == charArray[i]) {
				count ++;
			} else {
				newStr.append(count);
				newStr.append(value);
				value = charArray[i];
				count = 1;
			}
			
		}
		newStr.append(count);
		newStr.append(value);
		return newStr.toString();
	}
}
