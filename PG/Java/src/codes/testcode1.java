package codes;

import java.util.Arrays;

public class testcode1 {

	public static void main(String[] args) {

		 int [] a = {5, 5, 5, 5, 5, 5, 5};
		 // int [] expected = {0, 1, 2, 3, 4, 5, 6};
		 int x = 5;
		
		// ArrayList<Integer> ret = new ArrayList<Integer>();
		// ArrayList<Integer> ret2 = new ArrayList<Integer>();

		int [] ret = new int[a.length];
		int [] ret2  = new int[a.length];
		// int [] ret2 = new int[a.length];

		int count = 0, count2 = 0;

		for (int i = 0; i < a.length; i++) {
			ret[i] = (a[i] == x) ? ret2[i] = count : count2++;
			count++;
		}
		int [] ret3 = new int[Math.abs(count - count2)];

		for (int i = 0, j = 0; i < a.length; i++) {
			if (ret2[i] != 0) {
				ret3[j] = i;
				j++;
			}
		}

		System.out.println(Arrays.toString(ret));
		System.out.println(Arrays.toString(ret2));
		System.out.println(Arrays.toString(ret3));

		System.out.println(count);
		System.out.println(count2);
	}

}
