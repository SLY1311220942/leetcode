package com.sly.leetcode.algorithms.simple;

/**
 * <p>
 * 83. 删除排序链表中的重复元素
 * </p>
 * <p>
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * </p>
 * <p>
 * 示例 1:
 * </p>
 * <p>
 * 输入: 1->1->2
 * </p>
 * <p>
 * 输出: 1->2
 * </p>
 * <p>
 * 示例 2:
 * </p>
 * <p>
 * 输入: 1->1->2->3->3
 * </p>
 * <p>
 * 输出: 1->2->3
 * </p>
 * 
 * @author sly
 * @time 2019年11月25日
 */
public class Problem0083 {

	public static void main(String[] args) {
		ListNode node = new ListNode(5);
		ListNode node1 = new ListNode(5);
		node1.next = node;
		ListNode node2 = new ListNode(4);
		node2.next = node1;
		ListNode node3 = new ListNode(3);
		node3.next = node2;
		ListNode node4 = new ListNode(3);
		node4.next = node3;
		ListNode head = new ListNode(2);
		head.next = node4;

		head = deleteDuplicates(head);
		ListNode index = head;
		System.out.println(index.val);
		while (index.next != null) {
			index = index.next;
			System.out.println(index.val);
		}
	}

	public static ListNode deleteDuplicates(ListNode head) {
		int val = head.val;
		ListNode last = head.next;
		while (last != null) {
			System.out.println("val:" + val + " last:" + last.val);
			if (last.val == val) {
				last = last.next;
			} else {
				val = last.val;
				last = last.next;
			}
			
		}
		return head;
	}
}
