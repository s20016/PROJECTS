package Codes;

import java.util.Arrays;
import com.google.common.collect.ObjectArrays;
import java.util.Arrays;
import org.apache.commons.lang.ArrayUtils;

import org.apache.commons.lang3.ArrayUtils;

import jdk.internal.agent.resources.agent_fr;
import jdk.internal.agent.resources.agent_it;

public class testcode1 {
    public static void main(String[] args) {
		int [] a = {1, 2, 3, 4, 5, 6, 7};
		int [] b = {5, 4, 3, 2, 1};
		int [] expected_a = {5, 4, 3, 2, 1, 6, 7};
        int [] expected_b = {1, 2, 3, 4, 5};
        
        int x[] = new int[Math.max(a.length, b.length)];

        // List<Integer> x = new ArrayList<Integer>(a.length);
        // List<Integer> y = new ArrayList<Integer>(a.length);

        // Arrays.sort(b);

        // for (int i = 0; i < b.length; i++) {
        //     newArray[i] = b[i]; 
        // }

        // // System.out.println(Arrays.toString(newArray));

        // for (int i = b.length; i < a.length; i++) {
        //     if (i != newArray[i]) {
        //         newArray[i] = a[i];
        //     }
        // }    
        for (int i = 0; i < b.length; i++) { x[i] = b[i]; }
        for (int i = b.length; i < a.length; i++) {
            if (i != x[i]) { x[i] = a[i]; }
        }
        System.out.println(Arrays.toString(x));
        // }

        // String[] both = ArrayUtils.addAll(a, b);
        // System.out.println(both);

        // System.out.println(b.length);

        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(newArray));
    }
}
