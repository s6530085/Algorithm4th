package me.sunmin.algs4;

public class Ch1_04_24 {

	// 假设从0~N层是由false到true
	public static int eggSearch(boolean[] b) {
		if (b[0] == true) return 0;
		if (b[b.length-1] == false) return b.length-1;
		int lo = 0;
		int hi = b.length-1;
		while (lo < hi) {
			int mid = lo + (hi - lo) / 2;
			if (b[mid] == false) {
				if (lo == hi-1) return mid+1;
				else lo = mid;
			}
			else {
				hi = mid;
			}
		}
		return -1;
	}
	
	
	public static int topEggSearch(boolean[] b) {
		if (b[0] == true) return 0;
		if (b[b.length-1] == false) return b.length-1;
		int space = 1;
		while (b.length > space && b[b.length-space] == true) {
			space *= 2;
		}
		int lo = Math.max(0, b.length-space);
		int hi = b.length-space/2;
		// 抄上面的
		while (lo < hi) {
			int mid = lo + (hi - lo) / 2;
			if (b[mid] == false) {
				if (lo == hi-1) return mid+1;
				else lo = mid;
			}
			else {
				hi = mid;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		boolean[] b = {false, false, false, false, false, false, true, true, true};
		int i = topEggSearch(b);
	}
}
