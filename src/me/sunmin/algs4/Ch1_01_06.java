package me.sunmin.algs4;

public class Ch1_01_06 {
	
	public static void main(String[] arg) {
		int f = 0;
		int g = 1;
		for (int i = 0; i <  15; i++) {
			System.out.println(f + " " + g);
			f = f + g;
			g = f - g;
		}
	}

}
