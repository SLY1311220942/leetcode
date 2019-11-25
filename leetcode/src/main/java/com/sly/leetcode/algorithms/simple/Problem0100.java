package com.sly.leetcode.algorithms.simple;

/**
 * <p>100. 相同的树</p>
 * <p>给定两个二叉树，编写一个函数来检验它们是否相同。</p>
 * <p>如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。</p>
 * <p>示例 1:</p>
 * <p>输入:             1                  1</p>
 * <p>          / \       / \</p>
 * <p>         2   3     2   3</p>
 * <p>        [1,2,3],   [1,2,3]</p>
 * <p>输出: true</p>
 * <p>示例 2:</p>
 * <p>输入:             1                  1</p>
 * <p>          /           \</p>
 * <p>         2             2</p>
 * <p>        [1,2],     [1,null,2]</p>
 * <p>输出: false</p>
 * <p>示例 3:</p>
 * <p>输入:             1                  1</p>
 * <p>          / \       / \</p>
 * <p>         2   1     1   2</p>
 * <p>        [1,2,1],   [1,1,2]</p>
 * <p>输出: false</p>
 * @author sly
 * @time 2019年11月25日
 */
public class Problem0100 {

	public static void main(String[] args) {

	}

	public boolean isSameTree(TreeNode p, TreeNode q) {
		return true;
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
