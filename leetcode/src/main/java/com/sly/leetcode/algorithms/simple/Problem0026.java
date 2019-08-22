package com.sly.leetcode.algorithms.simple;

/**
 * <p>
 * 26.删除排序数组中的重复项
 * </p>
 * <p>
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * </p>
 * <p>
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * </p>
 * <p>
 * 示例 1:
 * </p>
 * <p>
 * 给定数组 nums = [1,1,2],
 * </p>
 * <p>
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * </p>
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 * </p>
 * <p>
 * 示例 2:
 * </p>
 * <p>
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * </p>
 * <p>
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
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
 * // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
 * </p>
 * <p>
 * int len = removeDuplicates(nums);
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
public class Problem0026 {

	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3,3,3,4,7,8,8,8,9};
		int val = removeDuplicates2(nums);
		System.out.println("==============");
		System.out.println(val);
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}
	/**
	 * <p>这个可以作废了，太慢了</p>
	 * @param nums
	 * @return
	 * @author sly
	 * @time 2019年8月22日
	 */
	public static int removeDuplicates(int[] nums) {
		int length = nums.length;
		int count = 0;
		for (int i = 0; i < (nums.length - count - 1); i++) {
			
			if(nums[i] == nums[i + 1]) {
				count ++;
				for (int j = i; j < nums.length - count; j++) {
					if(j != nums.length -1) {
						nums[j] = nums[j + 1];
					}
				}
				i --;
				length --;
			}
		}
		return length;
	}
	
	/**
	 * <p>这个快</p>
	 * @param nums
	 * @return
	 * @author sly
	 * @time 2019年8月22日
	 */
	public static int removeDuplicates2(int[] nums) {
		if (nums == null || nums.length == 0) {
            return 0;
        }
		// 如果不相等就将值记下来设置进去
        int i = 0;
        for (int j = 1; j < nums.length; j ++) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
        }
        return i + 1;
	}
}
