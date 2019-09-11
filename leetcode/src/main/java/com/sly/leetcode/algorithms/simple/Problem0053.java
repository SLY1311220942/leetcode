package com.sly.leetcode.algorithms.simple;

/**
 * <p>53.最大子序和</p>
 * <p>给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。</p>
 * <p>示例:</p>
 * <p>输入: [-2,1,-3,4,-1,2,1,-5,4],</p>
 * <p>输出: 6</p>
 * <p>解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。</p>
 * <p>进阶:</p>
 * <p>如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。</p>
 * @author sly
 * @time 2019年9月4日
 */
public class Problem0053 {
	
	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
	
	/**
	 * <p>暴力方式不可取，超出时间限制.....</p>
	 * @param nums
	 * @return
	 */
	public static int maxSubArray(int[] nums) {
		int max = 0;
		for (int num : nums) {
			max += num;
		}
		
		for (int i = 0; i < nums.length; i++) {
			
			for (int j = 0; j < nums.length - i; j++) {
				int total = nums[j];
				for (int k = 1; k <= i; k++) {
					total += nums[j + k];
				}
				if(total > max) {
					max = total;
				}
				
			}
			
		}
        return max;
    }
	
	public static int maxSubArray2(int[] nums) {
		return 0;
	}
}
