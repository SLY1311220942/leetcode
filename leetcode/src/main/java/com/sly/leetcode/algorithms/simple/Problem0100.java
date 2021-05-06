package com.sly.leetcode.algorithms.simple;

import com.sly.leetcode.algorithms.model.TreeNode;

/**
 * <p>100. 相同的树</p>
 * <p>给定两个二叉树，编写一个函数来检验它们是否相同。</p>
 * <p>如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。</p>
 * <p>示例 1:</p>
 * <p>输入:       1         1</p>
 * <p>          / \       / \</p>
 * <p>         2   3     2   3</p>
 * <p>        [1,2,3],   [1,2,3]</p>
 * <p>输出: true</p>
 * <p>示例 2:</p>
 * <p>输入:       1         1</p>
 * <p>          /           \</p>
 * <p>         2             2</p>
 * <p>        [1,2],     [1,null,2]</p>
 * <p>输出: false</p>
 * <p>示例 3:</p>
 * <p>输入:       1         1</p>
 * <p>          / \       / \</p>
 * <p>         2   1     1   2</p>
 * <p>        [1,2,1],   [1,1,2]</p>
 * <p>输出: false</p>
 *
 * @author sly
 * @time 2019年11月25日
 */
public class Problem0100 {

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        // p.left = new TreeNode(1);
        // p.right = new TreeNode(4);

        TreeNode q = new TreeNode(1);
        // q.left = new TreeNode(2);
        q.right = new TreeNode(2);

        System.out.println(isSameTree(p, q));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p != null && q != null) {
            if (p.val == q.val) {
                if (p.left == null && q.left == null && p.right == null && q.right == null) {
                    return true;
                } else {
                    if (p.left != null && q.left != null) {
                        boolean flag = isSameTree(p.left, q.left);
                        if (!flag) {
                            return false;
                        }
                    } else if (p.left != null || q.left != null) {
                        return false;
                    }

                    if (p.right != null && q.right != null) {
                        boolean flag = isSameTree(p.right, q.right);
                        if (!flag) {
                            return false;
                        }
                    } else if (p.right != null || q.right != null) {
                        return false;
                    }
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    /** 这样写 */
    public static boolean isSameTree2(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}

