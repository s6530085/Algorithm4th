package me.sunmin.algs4;

public class Ch1_01_09 {

	public static String parseIntToBinaryString(int n) {
		StringBuilder sb = new StringBuilder();
		while(n > 0) {
			sb.insert(0, n%2);
			n /= 2;
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(Ch1_01_09.parseIntToBinaryString(7));

	}

}
