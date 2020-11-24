package codes;

import java.util.Arrays;

public class testcode3 {

	public static void main(String[] args) {

		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// int expected = 1;

		// int [] x = new int[1];
		int x = a[0];
		// x[0] = 1;
		for (int i = 0; i < a.length; i++) {
			if (x >= a[i]) {
				x = a[i];
			}
		}
		// return a;
		// System.out.println(Arrays.toString(x));
		System.out.println(x);
	}
}
