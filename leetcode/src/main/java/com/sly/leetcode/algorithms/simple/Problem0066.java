package com.sly.leetcode.algorithms.simple;

/**
 * <p>66.加一</p>
 * <p>给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。</p>
 * <p>最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。</p>
 * <p>你可以假设除了整数 0 之外，这个整数不会以零开头。</p>
 * <p>示例 1:</p>
 * <p>输入: [1,2,3]</p>
 * <p>输出: [1,2,4]</p>
 * <p>解释: 输入数组表示数字 123。</p>
 * <p>示例 2:</p>
 * <p>输入: [4,3,2,1]</p>
 * <p>输出: [4,3,2,2]</p>
 * <p>解释: 输入数组表示数字 4321。</p>
 * <p></p>
 * <p></p>
 * <p></p>
 * @author sly
 * @time 2019年9月4日
 */
public class Problem0066 {
	
	public static void main(String[] args) {
		int[] digits = {9,9,9,9};
		int[] plusOne = plusOne(digits);
		
		for (int i = 0; i < plusOne.length; i++) {
			if(i == 0) {
				System.out.print("[");
			}
			System.out.print(plusOne[i]);
			
			if(i == plusOne.length - 1) {
				System.out.print("]");
			} else {
				System.out.print(",");
			}
		}
	}
	
	public static int[] plusOne(int[] digits) {
		int index = digits.length - 1;
		for (int i = 0; i < digits.length; i++) {
			if((digits[index - i] + 1) < 10) {
				digits[index - i] = digits[index - i] + 1;
				break;
			} else {
				digits[index - i] = 0;
				if(i == index) {
					int[] newDigits = new int[index + 2];
					newDigits[0] = 1;
					for (int j = 0; j < digits.length; j++) {
						newDigits[j + 1] = digits[j];
					}
					return newDigits;
				}
			}
		}
		return digits;
    }
}
