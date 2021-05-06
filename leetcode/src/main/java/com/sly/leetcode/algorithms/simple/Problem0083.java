package com.sly.leetcode.algorithms.simple;

import com.sly.leetcode.algorithms.model.ListNode;

import java.util.ArrayList;
import java.util.List;

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
 * @date 2019年11月25日
 */
public class Problem0083 {

	public static void main(String[] args) {
		ListNode node = new ListNode(3);
		ListNode node1 = new ListNode(3);
		node1.next = node;
		ListNode node2 = new ListNode(3);
		node2.next = node1;
		ListNode node3 = new ListNode(3);
		node3.next = node2;
		ListNode node4 = new ListNode(3);
		node4.next = node3;
		ListNode head = new ListNode(3);
		head.next = node4;

		head = deleteDuplicates2(head);
		ListNode index = head;
		System.out.println(index.val);
		while (index.next != null) {
			index = index.next;
			System.out.println(index.val);
		}
	}

	public static ListNode deleteDuplicates(ListNode head) {
		if(head == null) {
			return null;
		}
		List<ListNode> list = new ArrayList<>();
		ListNode index = head;
		ListNode next = head.next;
		list.add(head);
		while(next != null) {
			if(index.val != next.val) {
				list.add(next);
			}
			index = next;
			next = index.next;
		}
		for (int i = 0; i < list.size(); i++) {
			if(i + 1 < (list.size())) {
				list.get(i).next = list.get(i + 1);
			} else {
				list.get(i).next = null;
			}
		}
		if(list.size() > 0) {
			return list.get(0);
		}
		return head;
	}
	
	
	public static ListNode deleteDuplicates2(ListNode head) {
		if(head == null || head.next == null){
            return head;
        }
        head.next = deleteDuplicates(head.next);
        if(head.val == head.next.val){
            head = head.next;
        }
        return head;
	}
}
