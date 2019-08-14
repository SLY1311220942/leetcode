package com.sly.leetcode.algorithms.simple;

import java.util.Stack;

/**
 * <p>
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * </p>
 * <p>
 * 有效字符串需满足：
 * </p>
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * </p>
 * <p>
 * 左括号必须以正确的顺序闭合。
 * </p>
 * <p>
 * 注意空字符串可被认为是有效字符串。
 * </p>
 * <p>
 * 示例 1:
 * </p>
 * <p>
 * 输入: "()"
 * </p>
 * <p>
 * 输出: true
 * </p>
 * <p>
 * 示例 2:
 * </p>
 * <p>
 * 输入: "()[]{}"
 * </p>
 * <p>
 * 输出: true
 * </p>
 * <p>
 * 示例 3:
 * </p>
 * <p>
 * 输入: "(]"
 * </p>
 * <p>
 * 输出: false
 * </p>
 * <p>
 * 示例 4:
 * </p>
 * <p>
 * 输入: "([)]"
 * </p>
 * <p>
 * 输出: false
 * </p>
 * <p>
 * 示例 5:
 * </p>
 * <p>
 * 输入: "{[]}"
 * </p>
 * <p>
 * 输出: true
 * </p>
 * 
 * @author sly
 * @time 2019年8月13日
 */
public class Problem0020 {
	public static String[] strs = { "\\(\\)", "\\[\\]", "\\{\\}" };

	public static void main(String[] args) {
		// String s = "([{[]()}()])";
		String s = "()";
		System.out.println(isValid2(s));
		// System.out.println(isValid(s));
	}

	public static boolean isValid(String s) {
		String olds = s;
		// 移除相关字符
		for (String str : strs) {
			s = s.replaceAll(str, "");
		}
		if ("".equals(s)) {
			return true;
		} else if (olds.equals(s)) {
			return false;
		} else {
			return isValid(s);
		}

	}

	/**
	 * 使用栈思想
	 * 
	 * @param s
	 * @return
	 * @author sly
	 * @time 2019年8月14日
	 */
	public static boolean isValid2(String s) {
		Stack<Character> stack = new Stack<>();
		char[] strArray = s.toCharArray();
		for (char str : strArray) {
			if (str == '{' || str == '[' || str == '(') {
				// 开括号 压栈
				stack.add(str);
			} else {
				// 闭括号 出栈
				if (stack.empty()) {
					return false;
				}
				Character pop = stack.pop();
				if (str == '}') {
					if ('{' != pop) {
						return false;
					}
				} else if (str == ']') {
					if ('[' != pop) {
						return false;
					}
				} else if (str == ')') {
					if ('(' != pop) {
						return false;
					}
				}

			}
		}
		if (stack.empty()) {
			return true;
		}
		return false;
	}

	/**
	 * 这个是最快的只要1ms
	 * 
	 * @param s
	 * @return
	 * @author sly
	 * @time 2019年8月14日
	 */
	public static boolean isValid3(String s) {
		char[] stack = new char[s.length()];
		int top = -1;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			// 左括号入栈
			if (ch == '[' || ch == '{' || ch == '(') {
				stack[++top] = ch;
			} else {
				// 右括号处理
				if (top == -1)
					return false;
				if (ch == ']' && stack[top] != '[') {
					return false;
				}
				if (ch == '}' && stack[top] != '{') {
					return false;
				}
				if (ch == ')' && stack[top] != '(') {
					return false;
				}
				// 匹配成功
				top--;
			}
		}
		return top == -1;
	}
}
