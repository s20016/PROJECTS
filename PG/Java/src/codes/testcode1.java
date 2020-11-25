package codes;

import java.util.Arrays;

public class testcode1 {

	public static void main(String[] args) {
		
		int [] a = {1, 3, 4, 7, 9, 11};
		int idx = -1;
		int n = -6;
		// int [] expected = {};

		int [] ret = new int[a.length];
		int [] ret2 = new int[a.length];
		int [] ret3 = new int[0];

    	for (int i = 0, j = 0; i < a.length; i++) {
			ret[i] = a[i];
			if (i < idx || i >= idx + n) {
				ret2[j] = a[i];
				j++;
			}
		}

		// ret2.copyOfRange(ret2, 0, a.length - n);

		if (n >= a.length) {
			System.out.println(Arrays.toString(ret3));
		} else if (n + idx < a.length || n < 0) {
			System.out.println(Arrays.toString(Arrays.copyOfRange(ret2, 0, a.length - )));
		} else {
			System.out.println(Arrays.toString(ret));
		}

		// return (n >= a.length) ? ret3 : (n + idx < a.length) ? ret2 : ret;

		// return ret = (n == idx) ? ret : (a.length >= n + idx) ? ret2 : ret3;
		
	// return ret;
	// System.out.println(Arrays.toString(ret));
	// System.out.println(Arrays.toString(ret2));


    }
}
