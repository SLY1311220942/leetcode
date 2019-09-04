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
		
	}
	
	public static int searchInsert(int[] nums, int target) {
		int length = nums.length;
		int index = length / 2;
		while(true) {
			if(nums[index] > target) {
				if(index == 0) {
					return index;
				}
			} else if(nums[index] < target) {
				if((index + 1) == length) {
					return index;
				}
			} else {
				return index;
			}
		}
    }

}
