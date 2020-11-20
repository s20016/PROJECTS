package codes;

import java.util.Arrays;

public class testcode2 {

	public static void main(String[] args) {
		int [] a = {};
		int idx = 0;
		int x = 99;
//		int [] expected = {99};

		idx = (idx >= a.length) ? a.length : (idx < 0) ? 0 : idx;

		int [] ret = new int[a.length + 1];
		for (int i = 0, j = 0; i < ret.length; i++, j++) {
			if (i == idx) {
				ret[i] = x;
				j--; } else {
				ret[i] = a[j];
			}
		}
		// return ret;
		System.out.println(Arrays.toString(ret));
	}
}
