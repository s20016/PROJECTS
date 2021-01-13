package notes;

import java.util.Scanner;		// usingScanner();

public class PG3_Sem4_1 {

	public static void main(String[] args) {
		
		// Test method here:
		constructorSample1();
		constructorSample2();
		
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
	 * 
	 * Lesson 8 (12-16-2020) 
	 * 		arrayList();
	 * 		queueTest1();
	 * 
	 * Lesson 9 (01-12-2021)
	 * 		getSetMethod();
	 * 
	 * Lesson 10 (01-13-2021)
	 * 		getSetMethod2();
	 * 		heapSample();
	 * 		constructorSample1();
	 * 		constructorSample2();
	 * 		
	 */
	
	
	/**	Lesson 4 (12-08-2020) **/
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
	
	
	/** Lesson 5 (12-09-2020) **/
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
	
	
	/** Lesson 6 (12-10-2020) **/
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
	
	
	/** Lesson 8 (12-16-2020) **/
	static void arrayList() {
		// int[] arrayName;			// declare array
		// int arrayName[];			// declare array (Not recommended)
		
//		int[] array = new int[3];	// declaring array with length of 3	
		
//		array[0] = 10;				// initializing value
//		array[1] = 20;
//		array[2] = 30;
		
		int[] array = {10, 20, 30};	// initializing value 
		
//		for (int i = 0; i < array.length; i++) {	// standard for loop (Method 1)
//			int val = array[i];
//			System.out.println(val);
//		}
		
		for (int val : array) {		// enhanced for loop (Method 2)
			System.out.println(val);
		}
	}
	
	static void queueTest1() {
		System.out.println("A");
		queueTest2();
		System.out.println("E");
	}
	
	static void queueTest2() {
		System.out.println("B");
		queueTest3();
		System.out.println("D");
	}
	
	static void queueTest3() {
		System.out.println("C");
	}
	
	
	/** Lesson 9 (01-12-2021) **/
	
	/**
	 * 4 Pillars of Object Oriented Programming (OOP)
	 * 		ABSTRACTION		- Hiding of Info. Show only Essentials
	 * 						- Isolate impact of changes
	 * 		POLYMORPHISM	- Redefining switch/case statements 
	 * 		INHERITANCE		- Sharing of Info. Eliminate redundant code
	 * 		ENCAPSULATION	- Group related variable and function
	 * 						- Manipulation of data and functions
	 * 
	 * Get Method & Set Method
	 * 		get method (getVARNAME) - returns value of variable
	 * 		set method (setVARNAME) - takes parameter then assign to variable	
	 * 		
	 * this Keyword in Java
	 * 		- refer instance variable of current class
	 */
	
	static void getSetMethod() {
		class Robot {
			String name;
			public void sayHello() {
				System.out.println("Hi, I'm " + name);
			}
		}
		
		Robot robotA = new Robot();
		robotA.name = "Java Robot A";
		
		Robot robotB = new Robot();
		robotB.name = "Java Robot B";
		
		robotA.sayHello();
		robotB.sayHello();
	}

	/** Lesson 10 (01-13-2021) **/
	
	/**
	 * Garbage Collection (GC) - Process of destroying UNREFERENCED OBJESTCS in the HEAP
	 * 						   - Follows FIFO (First in, First out) algorithm
	 * 						   - Performed automatically
	 * 						   - If HEAP is full, GC is performed from Old Space
	 * 
	 * Ways in which Objects are Unreferenced:
	 * 		1. Nulling the reference.
	 * 			Test a = new Test();
	 * 			a = null;
	 * 
	 * 		2. Assigning a reference to another.
	 * 			Test a = new Test(); 
	 * 			Test b = new Test();
	 * 			a = b;
	 * 
	 * 		3. Anonymous object.
	 * 			new Test();
	 * 
	 * Stack	- Linear data structure for LOCAL VARIABLES
	 * 			- Follows LIFO (Last in, Fist out) algorithm
	 * 			- Follows three basic operation: PUSH, POP, (TOP), isEmpty
	 * Heap		- Stores OBJECTS
	 * 			- Divided into 2 parts: Young Space & Old Space
	 * 
	 */
	
	static void getSetMethod2() {
		class LedLight {
			private int status = 0;
			public void lightUp() {
				if (status == 0) {
					status = 1;
					System.out.println("Lights on!");
				}
			}
			public void lightDown() {
				if (status == 1) {
					status = 0;
					System.out.println("Lights off!");
				}
			}
		}
		
		class Robot {
			private String name;
			private LedLight light;
			public void sayHello() {
				light.lightUp();
				System.out.println("Hi I'm " + name);
				light.lightDown();
			}
			public void setLight(LedLight light) {
				this.light = light;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
		}
		
		Robot robot = new Robot();
		robot.setName("Java Robot");
		robot.setLight(new LedLight());
		robot.sayHello();
	}
	
	static void heapSample() {
		class Test {						
			private String name;					
			public void sayHello() {					
				System.out.println("Hi, I'm " + name);				
			}					
			public String getName() {					
				return name;				
			}					
			public void setName(String name) {					
				this.name = name;				
			}					
		}						
				
		Test a = new Test();						
		Test b = a;				// Ways of Object is Unreferenced No.2	
		a.setName("A");						
		b.setName("B");
		a.sayHello();
		b.sayHello();
		
		// Output:
		// Hi, I'm B
		// Hi, I'm B
	}
	
	static void constructorSample1() {
		class A {						
			public A() {					
				System.out.println("Const1");				
			}					
			public void hello() {					
				System.out.println("Hello Const1");				
			}					
		}
		
		A a = new A();						
		a.hello();
//		a.A();		// Error
	}
	
	static void constructorSample2() {
		class A {
			public void hello() {
				System.out.println("Hello Const2");
			}
		}
		
		A a = new A();
		a.hello();
	}
	
}
