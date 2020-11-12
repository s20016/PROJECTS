package Codes;

import java.util.Scanner;

public class testcode1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        // Lesson 11/10
//        int x = scan.nextInt();
//        int y = scan.nextInt();
//        if ( x < y && ( x % 2 ) == 0 && ( y % 2 ) == 0 )
//            System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。" );
//        if ( x == y && x < 0 )
//            System.out.println( "xとyは等しく、かつ、負の数である。" );
//        if ( ( x <= 10 || x >= 100 ) && ( y >= 10 && y <= 100 ) )
//                System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。" );
//        if ( ! ( x < 0 && y < 0 ) )
//                System.out.println( "xもyも負の数である、ではない。" );

        // Lesson 11/12
        int x = scan.nextInt();
        int y = scan.nextInt();
        
        testcode1 inst = new testcode1();
        int avg = inst.average(x, y);

        System.out.printf("The average of %d and %d is %d.", x, y, avg);

        scan.close();
    }

    // Lesson 11/12
    public int average(int x, int y) { 
        return (x + y) / 2;
    }
}
