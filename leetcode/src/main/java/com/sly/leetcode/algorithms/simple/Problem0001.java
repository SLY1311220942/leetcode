package com.sly.leetcode.algorithms.simple;

import com.alibaba.fastjson.JSON;

/**
 * <p>
 * 1.两数之和
 * </p>
 * <p>
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。<br/>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。<br/>
 * 给定 nums = [2, 7, 11, 15], target = 9<br/>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9<br/>
 * 所以返回 [0, 1]
 * </p>
 * 
 * @author sly
 * @time 2019年7月17日
 */
public class Problem0001 {
	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 18;
		int[] twoSum = twoSum(nums, target);
		System.out.println(JSON.toJSONString(twoSum));
	}

	public static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = (i + 1); j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					int[] result = { i, j };
					return result;
				}
			}
		}
		int[] result = {};
		return result;
	}
}
