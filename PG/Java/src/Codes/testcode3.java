package Codes;

import java.util.ArrayList;
import java.util.List;

public class testcode3 {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int idx = 8;

        List<Integer> x = new ArrayList<Integer>(a.length);
		// int [] x = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			if (a[i] != idx) { x.add(a[i]); }
		}
		System.out.println(x);
    }
}

