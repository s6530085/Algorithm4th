package me.sunmin.algs4;

class Transcation implements Comparable {

	@Override
	public int compareTo(Object o) {
		if (o == null) throw new NullPointerException();
		if (this == o) return 0;
		
	}
	
}

public class Ch1_02_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aaa";
		int b = s1.compareTo(null);
	}

}
