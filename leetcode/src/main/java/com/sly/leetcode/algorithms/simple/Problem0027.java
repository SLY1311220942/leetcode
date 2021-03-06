package com.sly.leetcode.algorithms.simple;

/**
 * <p>
 * 27.移除元素
 * </p>
 * <p>
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 * </p>
 * <p>
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * </p>
 * <p>
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * </p>
 * <p>
 * 示例 1:
 * </p>
 * <p>
 * 给定 nums = [3,2,2,3], val = 3,
 * </p>
 * <p>
 * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 * </p>
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 * </p>
 * <p>
 * 示例 2:
 * </p>
 * <p>
 * 给定 nums = [0,1,2,2,3,0,4,2], val = 2,
 * </p>
 * <p>
 * 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
 * </p>
 * <p>
 * 注意这五个元素可为任意顺序。
 * </p>
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 * </p>
 * <p>
 * 说明:
 * </p>
 * <p>
 * 为什么返回数值是整数，但输出的答案是数组呢?
 * </p>
 * <p>
 * 请注意，输入数组是以“引用”方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
 * </p>
 * <p>
 * 你可以想象内部操作如下:
 * </p>
 * <p>
 * // nums 是以“引用”方式传递的。也就是说，不对实参作任何拷贝
 * </p>
 * <p>
 * int len = removeElement(nums, val);
 * </p>
 * <p>
 * // 在函数里修改输入数组对于调用者是可见的。
 * </p>
 * <p>
 * // 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
 * </p>
 * <p>
 * for (int i = 0; i < len; i++) {
 * </p>
 * <p>
 *     print(nums[i]);
 * </p>
 * <p>
 * }
 * </p>
 * 
 * @author sly
 * @time 2019年8月22日
 */
public class Problem0027 {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 7, 8, 8, 8, 9 };
		int val = removeElement(nums, 3);
		System.out.println("==============");
		System.out.println(val);
		for (int i = 0; i < val; i++) {
			System.out.print(nums[i] + " ");
		}
		
	}

	/**
	 * 
	 * @param nums
	 * @param val
	 * @return
	 * @author sly
	 * @time 2019年8月22日
	 */
	public static int removeElement(int[] nums, int val) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[count] = nums[i];
				count ++;
			}
		}
		return count;
	}
}
