package me.sunmin.algs4;

import edu.princeton.cs.algs4.StdIn;

public class Ch1_03_11 {

	public static double evaluatePostfix() {
		Stack<String>ops = new Stack<String>();
		Stack<Double>ods = new Stack<Double>();
		while(!StdIn.isEmpty()) {
			String s = StdIn.readString();
			if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
				ops.push(s);
			}
			else if (s.equals(")")) {
				String op = ops.pop();
				double dr = ods.pop();
				double dl = ods.pop();
				if (op.equals("+")) {
					dl += dr;
				}
				else if (op.equals("-")) {
					dl -= dr;
				}
				else if (op.equals("*")) {
					dl *= dr;
				}
				else if (op.equals("/")) {
					dl /= dr;
				}
				ods.push(dl);
			}
			else if (s.equals("(")) {
				
			}
			else {
				ods.push(Double.parseDouble(s));
			}
		}
		
		return ods.pop();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
