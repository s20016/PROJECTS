package codes;

import java.util.Arrays;

public class testcode2 {

	public static void main(String[] args) {
		int [] a = {1, 2, 3, 4, 5, 6, 7};
		int [] b = {5, 4, 3, 2, 1};

		// int [] expected_a = {5, 4, 3, 2, 1, 6, 7};
		// int [] expected_b = {1, 2, 3, 4, 5};

		let [x, y] = [2, 1];


		for(int i = 0, tmp = 0; i < Math.min(a.length, b.length); i++) {
			// tmp = a[i];
			// a[i] = b[i];
			// b[i] = tmp;
			[b, a] = [a, b];
		}

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
