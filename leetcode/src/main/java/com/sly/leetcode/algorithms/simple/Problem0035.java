package com.sly.leetcode.algorithms.simple;

/**
 * <p>35.搜索插入位置</p>
 * <p>给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。</p>
 * <p>你可以假设数组中无重复元素。</p>
 * <p>示例 1:</p>
 * <p>输入: [1,3,5,6], 5</p>
 * <p>输出: 2</p>
 * <p>示例 2:</p>
 * <p>输入: [1,3,5,6], 2</p>
 * <p>输出: 1</p>
 * <p>示例 3:</p>
 * <p>输入: [1,3,5,6], 7</p>
 * <p>输出: 4</p>
 * <p>示例 4:</p>
 * <p>输入: [1,3,5,6], 0</p>
 * <p>输出: 0</p>
 * @author sly
 * @time 2019年9月3日
 */
public class Problem0035 {
	
	
	public static void main(String[] args) {
		int[] nums = {1,3,5,6}; 
		//int target = 5;
		//int target = 2;
		//int target = 7;
		int target = 0;
		System.out.println(searchInsert(nums,target));
	}
	
	/**
	 * <p>暴力方式</p>
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int searchInsert(int[] nums, int target) {
		if(nums.length == 0 || target <= nums[0]) {
			return 0;
		}
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == target) {
				return i;
			}else if(target < nums[i] && target > nums[i-1]) {
				return i;
			}
		}
		return nums.length;
    }
	
	/**
	 * <p>二分法</p>
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int searchInsert2(int[] nums, int target) {
		return 0;
    }

}
