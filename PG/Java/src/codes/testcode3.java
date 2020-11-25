package codes;

import java.util.Arrays;

public class testcode3 {

	public static void main(String[] args) {
		int [] a = {1, 3, 4, 7, 9, 11};
		int idx = 0;
		int n = 7;
		// int [] expected = {};
		int [] ret;

    	if (n <= 0 || idx < 0) {

    		ret = new int[a.length];
    		for (int i = 0; i < a.length; i++) {
    			ret[i] = a[i];
			}
			
    	} else {
    		if (idx + n >= a.length) {
    			if (n > a.length - idx ) {
    				ret = new int[a.length - idx];
    			} else {
    				ret = new int[a.length];
    			}
    		} else {
    			ret = new int[a.length - n];
    		}

    		for (int i = 0, j = 0; i < a.length; i++) {
    			if ( i < idx || i >= idx + n) {
    				ret[j++] = a[i];
    			}
    		}
    	}

		// return ret;
		System.out.println(Arrays.toString(ret));
	}
}
