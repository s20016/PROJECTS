package Codes;

import java.util.ArrayList;
import java.util.List;

public class testcode3 {
    public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<>();
        int arr[] = {-3, -2, -1, 0, 1, 2, 3};
        
        for (int i : arr) {
            if (i < 0) {
            	l.add("負");
            } else if (i > 0) {
            	l.add("正");
            } else {
            	l.add("零");
            }
        }
        System.out.println(l);
    }
}

