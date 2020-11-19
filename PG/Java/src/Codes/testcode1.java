package Codes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils; 
import java.util.Arrays;

public class testcode1 {
    public static void main(String[] args) {
		int [] a = {1, 2, 3, 4, 5, 6, 7};
		int [] b = {5, 4, 3, 2, 1};
		int [] expected_a = {5, 4, 3, 2, 1, 6, 7};
        int [] expected_b = {1, 2, 3, 4, 5};
        
        int newArray[] = new int[a.length + b.length];

        // List<Integer> x = new ArrayList<Integer>(a.length);
        // List<Integer> y = new ArrayList<Integer>(a.length);

        Arrays.sort(b);

        for (int i = 0; i < b.length; i++) {
            newArray[i] = b[i]; 
        }
        for (int i = b.length; i <= a.length; i++) {
            newArray[i] = a[i];
        }

        // String[] both = ArrayUtils.addAll(a, b);
        // System.out.println(both);

        System.out.println(b.length);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(newArray));
    }
}
