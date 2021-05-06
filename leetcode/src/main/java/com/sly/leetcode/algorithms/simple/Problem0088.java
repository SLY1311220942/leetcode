package com.sly.leetcode.algorithms.simple;

import com.alibaba.fastjson.JSON;

/**
 * <p>88. 合并两个有序数组</p>
 * <p>给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。</p>
 * <p>说明:</p>
 * <p>初始化 nums1 和 nums2 的元素数量分别为 m 和 n。</p>
 * <p>你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。</p>
 * <p>示例:</p>
 * <p>输入:</p>
 * <p>nums1 = [1,2,3,0,0,0], m = 3</p>
 * <p>nums2 = [2,5,6],       n = 3</p>
 * <p>输出: [1,2,2,3,5,6]</p>
 *
 * @author sly
 * @date 2019年11月25日
 */
public class Problem0088 {

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[] nums1 = {3, 6, 7, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, m, nums2, n);
        System.out.println(JSON.toJSONString(nums1));
        System.out.println(JSON.toJSONString(nums2));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m-- + n-- - 1;
        while (m >= 0 && n >= 0) {
            nums1[p--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
        while (n >= 0) {
            nums1[p--] = nums2[n--];
        }
    }
}
