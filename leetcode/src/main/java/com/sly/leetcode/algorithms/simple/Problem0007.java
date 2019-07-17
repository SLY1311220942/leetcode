package com.sly.leetcode.algorithms.simple;

/**
 * 整数反转
 * <p>
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 	<ul>
 * 		<li>示例 1: 输入: 123	输出: 321</li>
 *  	<li>示例 2: 输入: -123	输出: -321</li>
 *   	<li>示例 3: 输入: 120	输出: 21</li>
 * 	</ul>
 * </p>
 * @author sly
 * @time 2019年7月17日
 */
public class Problem0007 {
	
	public static void main(String[] args) {
		int x = 1534236401;
		int reverse = reverse(x);
		System.out.println(reverse);
	}
	
	public static int reverse(int x) {
		long reverse = 0L;
		boolean isNegative = x <  0 ? true:false;
		String xStr = isNegative ? -x + "" : x + "";
		char[] charArray = xStr.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			long y = 1L;
			for (int j = 0; j < i; j++) {
				y *= 10;
			}
			int num = charArray[i] - '0';
			reverse += num * y;
		}
		if (reverse > Integer.MAX_VALUE) {
			return 0;
		}
        return isNegative ? (int)-reverse : (int)reverse;
    }
}
