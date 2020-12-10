package notes;

import java.util.Scanner;		// usingScanner();

public class PG3_Sem4_1 {

	public static void main(String[] args) {
	
		continueStatement();
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
	 * 
	 * Lesson 6 (12-10-2020)
	 * 		usingScanner2();
	 * 		logicOperation();
	 * 		properIfStatement();
	 * 		switchStatement();
	 * 		continueStatement();
	 */
	
	static void forLoop() {
		
		// for (initialization; termination; increment) {
		//     statement
		// }
		
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
	
	static void usingScanner2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int a = scan.nextInt();
		
		// &
		String ret = (0 <= a & a <= 100) ? "In Range" : "Not in Range";
		System.out.println(ret);
		
		// |
		String ret2 = (0 <= a | a <= 100) ? "In Range" : "Not in Range";
		System.out.println(ret2);
		
		scan.close();
	}
	
	static void logicOperation() {
		int i = 13;
		
		// && || - checks right hand side only if necessary
		// &  |  - checks both side
		
		if (i == 10 & i < 10) { System.out.println("&: OK"); }
		if (i == 10 && i < 10) { System.out.println("&&: OK"); }
		
		if (i == 10 | i > 10) { System.out.println("|: OK"); }
		if (i > 10 || i == 10) { System.out.println("||: OK"); }
	}
	
	static void properIfStatement() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int a = scan.nextInt();
		
		// not recommended writing. Use {} for better readability
		if (a > 10) 
			System.out.println("a > 10");		// if true, printed else skipped
			System.out.println("Run Complete");	// true or false, printed
		
		// recommended writing
		if (a > 10 ) {
			System.out.println("a > 10");
		}
		System.out.println("Run Complete");
			
		scan.close();
	}
	
	static void switchStatement() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int a = scan.nextInt();
		
		// if a = 1 && break; all gone, prints all case
		switch(a) {
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			default: 
				System.out.println("Other");
				break;
		}
		
		scan.close();
	}
	
	static void continueStatement() {
		for (int i = 0; i <= 10; i++) {
			System.out.print(i);
			if (i > 9) {
				continue;
			}
		System.out.print(", ");		// if i > 9, loop is skipped
		// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10		// no ", " at the end
		}
	}
}
