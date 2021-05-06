package com.sly.leetcode.algorithms.simple;

import com.sly.leetcode.algorithms.model.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 21.合并两个有序链表
 * </p>
 * <p>
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * </p>
 * <p>
 * 示例：
 * </p>
 * <p>
 * 输入：1->2->4, 1->3->4
 * </p>
 * <p>
 * 输出：1->1->2->3->4->4
 * </p>
 * 
 * @author sly
 * @time 2019年8月14日
 */
public class Problem0021 {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		l1.next.next = new ListNode(9);

		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);

		ListNode l3 = mergeTwoLists2(l1, l2);
		ListNode next = l3;

		String l3str = "";
		l3str += next.val;
		while ((next = next.next) != null) {
			l3str += "->" + next.val;
		}
		System.out.println(l3str);
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		List<ListNode> listNodes = new ArrayList<ListNode>();
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				listNodes.add(new ListNode(l1.val));
				l1 = l1.next;
			} else {
				listNodes.add(new ListNode(l2.val));
				l2 = l2.next;
			}
		}
		if (l1 != null) {
			listNodes.add(l1);
		} else if (l2 != null) {
			listNodes.add(l2);
		}
		ListNode l3 = null;
		for (int i = listNodes.size() - 1; i > -1; i--) {
			if (i != listNodes.size() - 1) {
				listNodes.get(i).next = l3;
			}
			l3 = listNodes.get(i);
		}
		return l3;
	}

	/**
	 * 这个是0ms的例子
	 * 
	 * @param l1
	 * @param l2
	 * @return
	 * @author sly
	 * @time 2019年8月22日
	 */
	public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		if (l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}
}

