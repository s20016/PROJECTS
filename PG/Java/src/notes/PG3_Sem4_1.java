package notes;

import java.util.Scanner;		// usingScanner();

public class PG3_Sem4_1 {

	public static void main(String[] args) {
	
//		usingScanner();
		IntWithString();
	}

	/*
	 * Lesson 4 (12-08-2020)
	 * 		forLoop();
	 *      nestedForLoop();
	 * 		whileLoop();
	 * 		doWhileLoop();
	 * 		breakInLoop();
	 * 		breakInNestedLoop();
	 * 
	 * Lesson 5 (12-09-2020)
	 * 		finalVar();
	 * 		printInJava();
	 * 		intLong();
	 * 		usingScanner();
	 * 		IntWithString();
	 */
	
	static void forLoop() {
		for (int i = 0; i < 2; i++) {
			System.out.println("i = " + i);
		}
	}
	
	static void nestedForLoop() {
		for (int i = 1; i < 5; i++) {
			System.out.print(i);
			if ( i == 3 ) {
				break;
			}
		}
	}
	
	static void whileLoop() {
		int count = 0; // declare limit (false)
		while (count < 11) {
			System.out.println("A = " + count);
			count++;
		}
	}
	
	// statement in do block executed at least once
	static void doWhileLoop() {
        int count = 0;
        do {
            System.out.println("B = " + count);
            count++;
        } while (count < 11);
	}
	
	static void breakInLoop() {
		for (int i = 1; i < 5; i++) {
			System.out.print(i);
			if ( i == 3 ) {
				break;
			}
		}
	}
	
	static void breakInNestedLoop() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
				if (j == 2) {
					break;
				}
			}
			System.out.println();
		}
	}
	
	static void finalVar() {
		final int finalVar;
		finalVar = 10;		// Assigns the final value
//		finalVar = 20;		// Error. finalVar already assigned
		System.out.println(finalVar);
	}
	
	static void printInJava() {
		System.out.println("println = ends with new line");
		
		System.out.print("print = ");
		System.out.println("conitnuation of previous print");
		
		String word = "number"; int num = 10;
		System.out.printf("The %s is %d!\n", word, num);
		
		// \n = new line
		// s – formats strings
		// d – formats decimal integers
		// f – formats the floating-point numbers
		// t – formats date/time values
		
		System.out.printf("%s ", word);		// string as it is
		System.out.printf("%S\n", word);		// capitalized
		
		System.out.printf("%.6s", "0123456789InString"); // prints [:6]
	}
	
	static void intLong() {
		int x = 10; 
		long y = 20;
//		int sum = x + y;	// cannot convert long to int error
		long sum = x + y;	// works because long > int
		System.out.println(sum);
	}
	
	static void usingScanner() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int a = scan.nextInt();
		
		String ret = (a > 10) ? "BIG" : (a < 10) ? "SMALL" : "EQUAL";
		System.out.println(ret);
		
		scan.close();
	}
	
	static void IntWithString() {
		int a = 10, b = 20;
		System.out.println(a + b);
		System.out.println("¥" + a + b);	// ¥1020 - does not add a, b
		System.out.println(a + b + "円");	// 30円 - Adds a, b
	}
}
