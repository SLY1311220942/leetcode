package com.sly.leetcode.algorithms.simple;

import com.sly.leetcode.algorithms.model.TreeNode;

/**
 * <p>将有序数组转换为二叉搜索树</p>
 * <p>给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。</p>
 * <p>高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。</p>
 * <p>示例 1：</p>
 * <p>      0</p>
 * <p>    /  \</p>
 * <p>  -3   9</p>
 * <p>  /   /</p>
 * <p>-10  5</p>
 * <p>输入：nums = [-10,-3,0,5,9]</p>
 * <p>输出：[0,-3,9,-10,null,5]</p>
 * <p>解释：[0,-10,5,null,-3,null,9] 也将被视为正确答案：</p>
 * <p>      0</p>
 * <p>    /  \</p>
 * <p>  -10  5</p>
 * <p>    \   \</p>
 * <p>    -3   9</p>
 * <p>示例 2：</p>
 * <p>  3    1</p>
 * <p> /     \</p>
 * <p>1       3</p>
 * <p>输入：nums = [1,3]</p>
 * <p>输出：[3,1]</p>
 * <p>解释：[1,3] 和 [3,1] 都是高度平衡二叉搜索树。</p>
 * <p>提示：</p>
 * <p>1 <= nums.length <= 10^4</p>
 * <p>-10^4 <= nums[i] <= 10^4</p>
 * <p>nums 按 严格递增 顺序排列</p>
 *
 * @author SLY
 * @date 2021/5/6
 */
public class Problem0108 {

    public static void main(String[] args) {

    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return null;
    }
}
