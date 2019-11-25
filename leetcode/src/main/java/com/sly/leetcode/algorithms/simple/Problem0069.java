package com.sly.leetcode.algorithms.simple;

/**
 * <p>69. x 的平方根</p>
 * <p>实现 int sqrt(int x) 函数。</p>
 * <p>计算并返回 x 的平方根，其中 x 是非负整数。</p>
 * <p>由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。</p>
 * <p>示例 1:</p>
 * <p>输入: 4</p>
 * <p>输出: 2</p>
 * <p>示例 2:</p>
 * <p>输入: 8</p>
 * <p>输出: 2</p>
 * <p>说明: 8 的平方根是 2.82842..., </p>
 * <p>由于返回类型是整数，小数部分将被舍去。</p>
 * @author sly
 * @time 2019年11月25日
 */
public class Problem0069 {
	
	public static void main(String[] args) {
		int x = 2147395600;
		System.out.println(mySqrt(x));
	}

	/**
	 * <p>使用了牛顿法开平方</p>
	 * @param x
	 * @return
	 * @author sly
	 * @time 2019年11月25日
	 */
	public static int mySqrt(int x) {
		double x1 = x;
		double err = 0.1;
		double t = x1;
		while (Math.abs(x1 - t * t) > err) {
			t = (x1 / t + t) / 2.0;
		}
		return (int) t;
	}
}
