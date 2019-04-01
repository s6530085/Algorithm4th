package me.sunmin.algs4;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

public class Ch1_03_09 {
	
	public static void main(String[] args) {
		Stack<String> op = new Stack<String>();
		Stack<String> od = new Stack<String>();
		
		while(!StdIn.isEmpty()) {
			String s = StdIn.readString();
			if (s.equals(")")) {
				String ss = " " + op.pop() + " " + od.pop() + " ";
				ss = "( " + od.pop() + " " + ss + ")";
				od.push(ss);
			}
			else if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
				op.push(s);
			}
			else {
				od.push(s);
			}
		}
		String s = od.pop();
		System.out.println(s);
	}

	
}
