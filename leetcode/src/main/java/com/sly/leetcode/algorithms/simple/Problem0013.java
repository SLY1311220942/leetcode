package com.sly.leetcode.algorithms.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字转整数
 * <p>
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。</br>
 * 字符          数值</br>
 * I             1</br>
 * V             5</br>
 * X             10</br>
 * L             50</br>
 * C             100</br>
 * D             500</br>
 * M             1000</br>
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。</br>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。
 * 同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：</br>
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。</br>
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。</br>
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。</br>
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。</br>
 * <ul>
 * 		<li>示例 1: 输入: "III" 输出: 3</li>
 * 		<li>示例 2: 输入: "IV" 输出: 4</li>
 * 		<li>示例 3: 输入: "IX" 输出: 9</li>
 * 		<li>示例 4: 输入: "LVIII" 输出: 58 解释: L = 50, V= 5, III = 3.</li>
 * 		<li>示例 5: 输入: "MCMXCIV" 输出: 1994 解释: M = 1000, CM = 900, XC = 90, IV = 4.</li>
 * </ul>
 * </p>
 * @author sly
 * @time 2019年7月17日
 */
public class Problem0013 {
	public static void main(String[] args) {
		System.out.println(romanToInt("III"));
		System.out.println(romanToInt("IV"));
		System.out.println(romanToInt("IX"));
		System.out.println(romanToInt("LVIII"));
		System.out.println(romanToInt("MCMXCIV"));
	}
	
	public static int romanToInt(String s) {
		Map<Character, Integer> valueTable = new HashMap<Character, Integer>();
		valueTable.put(new Character('I'), new Integer(1));
		valueTable.put(new Character('V'), new Integer(5));
		valueTable.put(new Character('X'), new Integer(10));
		valueTable.put(new Character('L'), new Integer(50));
		valueTable.put(new Character('C'), new Integer(100));
		valueTable.put(new Character('D'), new Integer(500));
		valueTable.put(new Character('M'), new Integer(1000));
		
		int total = 0;
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == 'I') {
				if((i + 1 < charArray.length) && charArray[i + 1] == 'V') {
					i ++;
					total += 4;
				} else if((i + 1 < charArray.length) && charArray[i + 1] == 'X'){
					i ++;
					total += 9;
				} else {
					total += 1;
				}
			} else if(charArray[i] == 'X') {
				if((i + 1 < charArray.length) && charArray[i + 1] == 'L') {
					i ++;
					total += 40;
				} else if((i + 1 < charArray.length) && charArray[i + 1] == 'C') {
					i ++;
					total += 90;
				} else {
					total += 10;
				}
			} else if(charArray[i] == 'C') {
				if((i + 1 < charArray.length) && charArray[i + 1] == 'D') {
					i ++;
					total += 400;
				} else if((i + 1 < charArray.length) && charArray[i + 1] == 'M') {
					i ++;
					total += 900;
				} else {
					total += 100;
				}
			} else {
				total += valueTable.get(new Character(charArray[i]));
			}
			
			
		}
		
        return total;
    }
}
