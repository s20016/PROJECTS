package codes;

import java.util.Arrays;
import java.util.ArrayList;

public class testcode2 {

	public static void main(String[] args) {
		int [] a = {1, 3, 4, 7, 9, 11};
		int idx = 0;
		int n = 7;
		// int [] expected = {};

    	// Method 1
    	ArrayList<Integer> x = new ArrayList<Integer>();
    	ArrayList<Integer> y = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
        	y.add(a[i]);
        	if (i < idx || i >= n + idx) {
				x.add(a[i]);
			}
        }

		int [] ret = new int[x.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = x.get(i);
		}

		int [] ret2 = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			ret2[i] = y.get(i);
		}

		// return (n == idx) ? ret2 : ret;
		System.out.println(Arrays.toString(ret2));
		System.out.println(Arrays.toString(ret));
	}
	
}
