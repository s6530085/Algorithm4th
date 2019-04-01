package me.sunmin.algs4;

import edu.princeton.cs.algs4.StdIn;

public class Ch1_03_10 {
	
	public static String InfixToPostfix() {
		Stack<String> ops = new Stack<String>();
		Stack<String> ods = new Stack<String>();
		while (!StdIn.isEmpty()) {
			String s = StdIn.readString();
			if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
				ops.push(s);
			}
			else if (s.equals(")")) {
				String r = ods.pop();
				String op = ops.pop();
				String l = ods.pop();
				String od = " ( " + r + " " + l + " " + op + " ) ";
				ods.push(od);
			}
			else if (s.equals("(")) {
				
			}
			else {
				ods.push(s);
			}
		}
		return ods.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
