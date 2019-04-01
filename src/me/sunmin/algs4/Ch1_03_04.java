package me.sunmin.algs4;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

public class Ch1_03_04 {
	
	public static boolean validParentheses() {
		Stack<Character> stack = new Stack<Character>();	
		String s = StdIn.readString();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			}
			else {
				char cc = stack.pop();
				if ((c == ')' || cc == '(') || (c == ']' && cc == '[') || (c == '}' && cc == '{')) {
					continue;
				}
				else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}
