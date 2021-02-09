package notes;

import java.io.*;
import java.util.*;

public class PG3_Sem4_1 {

	public static void main(String[] args) {

		// TODO: Test method here
		sampleChar();
	}

	/*
	 * Lesson 4 (12-08-2020) 
	 * 		forLoop(); 
	 * 		nestedForLoop(); 
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
	 * 		E: OOP, Get & Set Method 
	 * 		getSetMethod();
	 * 
	 * Lesson 10 (01-13-2021) 
	 * 		E: GC, Stack, Heap 
	 * 		getSetMethod2(); 
	 * 		heapSample();
	 * 		constructorSample1(); 
	 * 		constructorSample2();
	 * 
	 * Lesson 11 (01-14-2021) 
	 * 		constructorSample3(); 
	 * 		overloadSample();
	 * 		overloadSample2(); 
	 * 		instanceSample();
	 * 
	 * Lesson 12 (01-19-2021) 
	 * 		E: Naming Convention 
	 * 		usingPackage(); 
	 * 		UseSuperClass();
	 * 		UseSuperClass2(); 
	 * 		UseSuperClass3();
	 * 
	 * Lesson 13 (01-20-2021) 
	 * 		E: Override & Overload, Signature, Error & Exception
	 * 		sampleOverride(); 
	 * 		sampleOverload(); 
	 * 		sampleSuperClass(); 
	 * 		sampleError();
	 * 
	 * Lesson 14 (01-21-2021)
	 * 		sampleTryCatchError();
	 * 		sampleTryCatchFinally();
	 * 		sampleThrowAndThrows();
	 * 
	 * Lesson 15 (01-26-2021)
	 * 		E: @Override Annotation 
	 * 		samplePolymorphism();
	 * 		useCalculatorSample();
	 * 
	 * Lesson 16 (01-27-2021)
	 * 		E: Up-cast & Downcast
	 * 		sampleCasting();
	 * 		sampleEquals();
	 * 		sampleEquals2();
	 * 		sampleEquals3();
	 * 		sampleInterface();
	 * 
	 * Lesson 17 (01-28-2021)
	 * 		sampleAbstract();
	 * 
	 * Lesson 19 (02-04-2021)
	 * 		E: Collections, Generic, Set, Iterator
	 * 		sampleCollections();
	 * 		sampleCollections2();
	 * 		sampleCollections3();
	 * 		sampleGeneric();
	 * 		sampleSet();
	 * 		sampleSet2();
	 * 
	 * Lesson 20 (02-09-2021)
	 * 		E: List & Set
	 * 		sampleSet3();
	 * 		sampleIterator();
	 * 		sampleIterator2();
	 * 		sampleMap();
	 * 		sampeWrapper();
	 * 		sampleWrapper2();
	 * 		sampleList();
	 * 		sampleMap2();
	 * 		sampleString();
	 * 		sampleString2();
	 * 		sampleString3();
	 * 		sampleChar();
	 * 
	 */

	/* LESSON: 4 (12-08-2020) */
	static void forLoop() {

		// for (initialization; termination; increment) {
		// statement
		// }

		for (int i = 0; i < 2; i++) {
			System.out.println("i = " + i);
		}
	}

	static void nestedForLoop() {
		// Simple For loop Example
		for (int i = 1; i < 5; i++) {
			System.out.print(i);
			if (i == 3) {
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
			if (i == 3) {
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

	/* LESSON: 5 (12-09-2020) */
	static void finalVar() {
		final int finalVar;
		finalVar = 10; // Assigns the final value
//		finalVar = 20;		// Error. finalVar already assigned
		System.out.println(finalVar);
	}

	static void printInJava() {
		System.out.println("println = ends with new line");

		System.out.print("print = ");
		System.out.println("conitnuation of previous print");

		String word = "number";
		int num = 10;
		System.out.printf("The %s is %d!\n", word, num);

		// \n = new line
		// s – formats strings
		// d – formats decimal integers
		// f – formats the floating-point numbers
		// t – formats date/time values

		System.out.printf("%s ", word); // string as it is
		System.out.printf("%S\n", word); // capitalized

		System.out.printf("%.6s", "0123456789InString"); // prints [:6]
	}

	static void intLong() {
		int x = 10;
		long y = 20;
//		int sum = x + y;	// cannot convert long to int error
		long sum = x + y; // works because long > int
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
		System.out.println("¥" + a + b); // ¥1020 - does not add a, b
		System.out.println(a + b + "円"); // 30円 - Adds a, b
	}

	/* LESSON: 6 (12-10-2020) */
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
		// & | - checks both side

		if (i == 10 & i < 10) {
			System.out.println("&: OK");
		}
		if (i == 10 && i < 10) {
			System.out.println("&&: OK");
		}

		if (i == 10 | i > 10) {
			System.out.println("|: OK");
		}
		if (i > 10 || i == 10) {
			System.out.println("||: OK");
		}
	}

	static void properIfStatement() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int a = scan.nextInt();

		// not recommended writing. Use {} for better readability
		if (a > 10)
			System.out.println("a > 10"); // if true, printed else skipped
		System.out.println("Run Complete"); // true or false, printed

		// recommended writing
		if (a > 10) {
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
		switch (a) {
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
			System.out.print(", "); // if i > 9, loop is skipped
			// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 // no ", " at the end
		}
	}

	/* LESSON: 8 (12-16-2020) */
	static void arrayList() {
		// int[] arrayName; // declare array
		// int arrayName[]; // declare array (Not recommended)

//		int[] array = new int[3];	// declaring array with length of 3	

//		array[0] = 10;				// initializing value
//		array[1] = 20;
//		array[2] = 30;

		int[] array = { 10, 20, 30 }; // initializing value

//		for (int i = 0; i < array.length; i++) {	// standard for loop (Method 1)
//			int val = array[i];
//			System.out.println(val);
//		}

		for (int val : array) { // enhanced for loop (Method 2)
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


	/* LESSON: 9 (01-12-2021)
	 * 
	 * 4 Pillars of Object Oriented Programming (OOP) 
	 * ABSTRACTION		- Hiding of Info. Show only Essentials 
	 * 					- Isolate impact of changes 
	 * POLYMORPHISM 	- Redefining switch/case statements 
	 * INHERITANCE		- Sharing of Info. Eliminate redundant code 
	 * ENCAPSULATION	- Group related variable and function 
	 * 					- Manipulation of data and functions
	 * 
	 * Get Method & Set Method 
	 * get method (getVARNAME) - returns value of variable
	 * set method (setVARNAME) - takes parameter then assign to variable
	 * 
	 * this Keyword in Java 
	 * 		- refer instance variable of current class
	 * 
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


	/* LESSON: 10 (01-13-2021)
	 * 
	 * Garbage Collection (GC) 
	 * 				- Process of destroying UNREFERENCED OBJESTCS in the
	 * HEAP 		- Follows FIFO (First in, First out) algorithm 
	 * 				- Performed automatically
	 * 				- If HEAP is full, GC is performed from Old Space
	 * 
	 * Ways in which Objects are Unreferenced: 
	 * 		1. Nulling the reference. 
	 * 			Test a = new Test(); a = null;
	 * 
	 * 		2. Assigning a reference to another. 
	 * 			Test a = new Test(); 
	 * 			Test b = new Test(); a = b;
	 * 
	 * 		3. Anonymous object. new Test();
	 * 
	 * Stack 		- Linear data structure for LOCAL VARIABLES 
	 * 				- Follows LIFO (Last in, Fist out) algorithm 
	 * 				- Follows three basic operation: PUSH, POP, (TOP),
	 * isEmpty Heap - Stores OBJECTS - Divided into 2 parts: Young Space & Old Space
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

			@SuppressWarnings("unused")
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

	@SuppressWarnings("unused")
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
		Test b = a; // Ways of Object is Unreferenced No.2
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

	/* LESSON: 11 (01-14-2021) */
	static void constructorSample3() {
		// Sample code without "Setter" or "Getter"
		class A {
			private String name;

			public A(String name) {
				this.name = name;
			}

			public void hello() {
				System.out.println("Hello " + name);
			}
		}

		A a = new A("Java");
		a.hello();
	}

	static void overloadSample() {
		class overload {
			public void hello() {
				System.out.println("Hello");
			}

			public void hello(String name) {
				System.out.println("Hello" + name);
			}
		}
		overload sample = new overload();
		sample.hello("Java1");
		sample.hello();
		sample.hello("Java2");
	}

	static void overloadSample2() {
		class overload {
			public overload() {
				System.out.println("Default");
			}

			public overload(String val) {
				System.out.println(val);
			}
		}
		new overload();
		new overload("Hello");
	}

	@SuppressWarnings("unused")
	static void instanceSample() {
		class sample {
			// The method hello() cannot be declared static
//			public static void hello() {
			public void hello() {
				// do something
			}
		}
		sample[] samples = new sample[3];

		for (sample sample : samples) {
			System.out.println(sample);
		}
	}


	/* LESSON: 12 (01-19-2021)
	 * 
	 * Naming Convention 
	 * Package 	- All-lower case ASCII letters (com.apple.quicktime.v2) 
	 * Class 	- Noun, mixed case, CamelCase (class MountainBike) 
	 * Methods 	- Verb, mixed case, first letter lower case (changeGear) 
	 * Variable	- Short, meaningful (int gear = 0;) 
	 * C. Var 	- All upper case, separate by "_" (static final int MIN_WIDTH = 4;)
	 * 
	 * SuperClass > SubClass
	 * 
	 */

	static void usingPackage() {
		// Method 1, Call package in the class. Not recommended.
		// java.package1.Sample test = new java.package1.Sample();

		// Method 2, import package then call method.
		// import java.package1.*
		// Sample sample = new Sample();

	}

	static void UseSuperClass() {
		class SuperClass {
			public void hello() {
				System.out.println("Hello");
			}
		}

		class SubClass extends SuperClass {
		}

		SubClass sub = new SubClass();
		sub.hello();
	}

	static void UseSuperClass2() {
		class SuperClass {
			public void hello() {
				System.out.println("Hello!");
			}
		}

		class SubClass extends SuperClass {
			public void goodBye() {
				System.out.println("Goodbye!");
			}
		}

		class SubClass2 extends SubClass {
			public void helloAgain() {
				System.out.println("Hello Again!");
			}
		}

		SuperClass sup = new SuperClass();
		sup.hello();

		// Has access to all method in SuperClass
		SubClass sub = new SubClass();
		sub.hello();
		sub.goodBye();

		// Has access to all methods in SubClass
		SubClass2 sub2 = new SubClass2();
		sub2.hello(); // SuperClass Method
		sub2.goodBye(); // SubClass Method
		sub2.helloAgain(); // SubClass2 Method
	}

	static void UseSuperClass3() {
		// When int num is private = Output: 0
		// When int num is public or default = Output: 20
		class A {
//			private int num;
			int num;

			public void setNum(int num) {
				this.num = num;
			}
		}

		class B extends A {
//			private int num;
			public int getNum() {
				return num + 10;
			}
		}

		B b = new B();
		b.setNum(10);
		System.out.println(b.getNum());
	}

	/* LESSON: 13 (01-20-2021) */

	/*
	 * Override and Overload Override 
	 * 	Occurs between SuperClass and SubClass 
	 * 	Parameters, return type, and access modifier must be the same Overload 
	 * 	Occurs within the same class - Different parameters
	 * 
	 * Override - It's the ability to overwrite method with the same name 
	 * Overload - It's the ability to write methods that have the same name 
	 * but accept different parameters.
	 * 
	 * Signature - Method name and parameter list
	 * 
	 * Error and Exception in Java - Both subclasses of java.lang.Throwable class
	 * 
	 * Error 		- condition which cannot get recovered 
	 * 				- causes termination of the program 
	 * Exception 	- recoverable using try, catch and throw keywords
	 * 
	 */

	static void sampleOverride() {
		class A {
			public void hello() {
				System.out.println("Hello");
			}
		}
		class B extends A {
			// Overriding method
			public void hello() {
				System.out.println("Konnichiwa");
			}
		}

		class C extends A {
			public void hello() {
				// executes superclass method
				super.hello();
				System.out.println("Hola, como estas?");
			}
		}

		B b = new B();
		b.hello();
		// Konnichiwa

		C c = new C();
		c.hello();
		// Hello
		// Hola, como estas?
	}

	static void sampleOverload() {
		class A {
			public void hello() {
				System.out.println("Hello!");
			}

			// Overloading Method
			// Method signature: hello(String)
			public void hello(String name) {
				System.out.printf("Hello %s!\n", name);
			}

			// Method signature: hello(int)
			public void hello(int num) {
				System.out.println("Hello " + num);
			}
		}

		A a = new A();
		a.hello();
		a.hello(3000);
		a.hello("JC");
	}

	@SuppressWarnings("unused")
	static void sampleSuperClass() {
		class A {
			// Method signature A(String)
			public A(String val) {
				System.out.println("A1 " + val);
			}

			// Method signature
			public A(int num) {
				System.out.println("A2 " + num);
			}
		}
		class B extends A {
			public B() {
				super(3000);
				// super(); - constructor written by the compiler automatically
				System.out.println("B");
			}
		}
		B b = new B();
		// A2 3000
		// B
	}

	static void sampleError() {
		int[] array = new int[3]; // array = [0, 1, 2]
		array[3] = 10; // No array[3]
		System.out.println(array[0]); // Error
		System.out.println("End"); // Will not execute
	}
	
	
	/* LESSON: 14 (01-21-2021)
	 * 
	 * The catch Block
	 * 	Each catch block is an exception handler that handles the type of 
	 * 	exception indicated by its argument.
	 * 
	 * throw & throws
	 * throw	- Used to explicitly throw an exception
	 * 			- Used within the method
	 * 			- Followed by an instance
	 * throws	- Used to declare an exception
	 * 			- Used with the method signature
	 * 			- Followed by a class
	 * 
	 */
	
	static void sampleTryCatchError() {
		File file = new File("sample.txt");
//		file.createNewFile();	// Exception in thread "main"
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.err.println(e.toString());
		}
		System.out.println("End");
	}
	
	static void sampleTryCatchFinally() {
		System.out.println("A");
		try {
			int[] array = new int[3];
			System.out.println("B");
			
			array[0] = 10;		// Not an Error
			System.out.println("C");
			
			array[4] = 20;		// Error
			System.out.println("D");	// Skipped
			
			System.out.println("E");	// Skipped
		} catch (NullPointerException e1){
			System.out.println("F");	// Skipped, No NullPointerException
		} catch (ArrayIndexOutOfBoundsException e2){
			System.out.println("G");
		} finally {
			System.out.println("H");
		}
		System.out.println("I");
		
//		A
//		B
//		C
//		G
//		H
//		I
	}
	
	static void sampleThrowAndThrows() {
		class ThrowSample {
			public void test(String val) throws Exception {
				if (val == null) {
					throw new Exception();
				}
			}
		}
		class UseThrowSample {
			public void sample() throws Exception {
				ThrowSample a = new ThrowSample();
				a.test(null);
			}
		}
		UseThrowSample b = new UseThrowSample();
		try {
			b.sample();
		} catch (Exception e) {
			System.out.println("Error Occured");
		}
	}
	
	
	/* LESSON: 15 (01-26-2021)
	 * 
	 * @Override Annotation
	 * - Informs the compiler that the element is meant to override
	 * an element declared in a superclass.
	 * - Not required to use this annotation when overriding a method
	 * - The compiler generates an error when a method with @Override annotation fails 
	 * to override a method in one of its superclass.
	 * 
	 * Practice: https://www.sikaku.gr.jp/js/jv/sample/3/jv3-2_20130508.pdf
	 * 
	 */
	
	static void samplePolymorphism() {
		// Superclass
		class Car {
			public void drive() {
				System.out.println("CarA R");
			}
			public void stop() {
				System.out.println("CarA S");
			}
			
			public int totalTurn;
			public void setTurn(int turn) {
				this.totalTurn = turn;
			}
			public int getTurn() {
				return 0;
			}
		}	
		// Subclass
		class CarA extends Car {
			@Override
			public void stop() {
				System.out.println("CarA Stops");
			}
			@Override
			public int getTurn() {
				int total = super.totalTurn + 90;
				return total;
			}
		}
		// Main
		Car car = new CarA();
		car.drive();
		car.stop();
		
		car.setTurn(0);
		int total = car.getTurn();
		System.out.println(total);
		
		// CarA R		<- Not Override
		// CarA Stops	<- Override
		// 90			<- Override
	}

	static void useCalculatorSample() {
		class TaxCalculator {
			protected int price;
			public void setPrice(int price) {
				this.price = price;
			}
			public int getResult() {
				return 0;
			}
		}
		
		class ExciseTax extends TaxCalculator {
			@Override
			public int getResult() {
				int result = (int)(super.price * 1.10);
				return result;
			}
		}
		
		class Calculator {
			private TaxCalculator taxCal;
			private int price;
			private int qty;
			public void setTaxCal(TaxCalculator taxCal) {
				this.taxCal = taxCal;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			public void setQty(int qty) {
				this.qty = qty;
			}
			public int getResult() {
				if (this.taxCal != null) {
					taxCal.setPrice(price * qty);
					return taxCal.getResult();
				}
				return price * qty;
			}
		}
		
		Calculator calc = new Calculator();
		calc.setPrice(1000);
		calc.setQty(3);
		calc.setTaxCal(new ExciseTax());
		int result = calc.getResult();
		System.out.printf("%d Yen", result);
		
		// 3300 Yen
	}
	
	
	/* LESSON: 16 (01-27-2021)
	 * 
	 * Upcast & Downcast
	 * 		Subclass -> extends -> Superclass
	 * 	
	 * Upcast	- Parent p = new Child();
	 * Downcast	- Parent p = new Child(); Child c = (Child) p;
	 * 			- Child c = new Parent() <- Compile Error
	 * 
	 */
	
	static void sampleCasting() {
		class SuperClass {
		}
		class SubClass extends SuperClass {
		}
		SuperClass s = new SubClass();
//		SubClass sub = s;		// Compile Error
		
		if (s instanceof SuperClass) {
			System.out.println("Yes");
		}
	}
	
	static void sampleEquals() {
		class A {
		}
		A a = new A();
		A b = a;
		A c = b;
		System.out.printf("a == b: %b\n", a == b);
		System.out.printf("a == c: %b\n", a == c);
	}
	
	@SuppressWarnings("unused")
	static void sampleEquals2() {
		class Client {
			private int id;
			private String name;
			public Client(int id, String name) {
				this.id = id;
				this.name = name;
			}
			// Some code
		}
		Client a = new Client(100, "ClientA");
		Client b = new Client(100, "ClientB");
		Client c = a;	// id: 100, name: ClientA
		
		System.out.printf("a == b: %b\n", a == b);	// false
		System.out.printf("a == c: %b\n", a == c);	// true
	}


	@SuppressWarnings("unused")
	static void sampleEquals3() {
		class Client {
			private int id;
			private String name;
			public Client(int id, String name) {
				this.id = id;
				this.name = name;
			}

            @Override
            public boolean equals(Object obj) {
                if (obj == null) {
                    return false;
                }
                if (obj instanceof Client == false) {
                    return false;
                }
                Client target = (Client) obj;
                return this.id == target.id;
            }
		}
		Client a = new Client(100, "ClientA");
		Client b = new Client(100, "ClientB");
		
		System.out.println(a == b);     // false
        System.out.println(a.equals(b));    // true
	}

    static void sampleInterface() {
        class Car {
            public void drive() {}
            public void stop() {}
            public void turn() {}
        }

        // interface Car {
        //     public void drive();
        //     public void stop();
        //     public void turn();
        // }

        // class CarA implements Car {
        class CarA extends Car {
            @Override
            public void drive() {
                System.out.println("CarA Runs!");
            }
            @Override
            public void stop() {
                System.out.println("CarA Stops!");
            }
            @Override
            public void turn() {
                System.out.println("CarA Turns!");
            }
        }
        Car a = new CarA();
        a.drive();
        a.stop();
        a.turn();
    }
    
    
    /* LESSON: 17 (01-28-2021)
     * 
     * Field - A variable inside a class
     * 
     */
    
    @SuppressWarnings("unused")
    static void sampleAbstract() {
    	class TaxCalculator {
    		protected int price;
    		public void setPrice(int price) {
    			this.price = price;
    		}
        	public int getResult() {
        		return 0;
        	}
    	}

    	class ExciseTax extends TaxCalculator {
    		@Override
    		public int getResult() {
    			int result = (int)(super.price * 1.08);
    			return result;
    		}
    	}
    }
    
    
    /* LESSON: 19 (02-04-2021)
     * 
     * Collections 
     * 	- A framework that represents a unified architecture
     * for storing and manipulating a group of objects.
     * 	- A single unit of objects
     * 
     * Generic - Specify the type that will be held inside the list.
     * 	- Diamond operator <> containing the type
     * 
     */
    
	@SuppressWarnings({"rawtypes", "unchecked"})
	static void sampleCollections() {
		// The defined list could hold any Object thus the warning
		// Without Generic Method = Raw type Warning
    	List list = new ArrayList();	// raw type warning
    	for (int i = 0; i < 10; i++) {
    		list.add(new Object());		// unchecked warning
    	}
    	System.out.println(list.size());
    	
    	// 10
    }
    
    static void sampleCollections2() {
    	// With Generic Method
    	List<String> list = new ArrayList<String>();
    	list.add("A");
    	list.add("B");
    	list.add("C");
    	System.out.println(list);
    }
    
    static void sampleCollections3() {
    	List<String> list = new ArrayList<String>();
    	String arr[] = {"A", "B", "C", "D"};
    	
    	// Enhanced For loop
    	for (String ret : arr) {
    		list.add(ret);
    	}
    	System.out.println(list);
    	
    	// [A, B, C, D]
    }
    
    @SuppressWarnings("unused")
    static void sampleGeneric() {
    	class sample<T> {
    		T ret;
    		
    		sample(T ret) {
    			this.ret = ret;
    		}
    		
    		void getValue() {
    			System.out.println(ret.getClass().getName());
    		}
    	}
    	sample<Integer> obj = new sample<>(10);
    	obj.getValue();
    	
    	// java.lang.Integer
    }
    
    static void sampleGeneric2() {
    	class sample<T, V> {
    		T num;
    		V num2;
    		
    		sample(T num, V num2) {
    			this.num = num;
    			this.num2 = num2;
    		}
    		
    		void getValue() {
    			System.out.println(num.getClass().getName());
    			System.out.println(num2.getClass().getName());
    		}
    	}
    	sample<Integer, Double> ret = new sample<>(3000, 5000.0);
    	ret.getValue();
    	
    }
    
    static void sampleSet() {
    	Set<String> set = new HashSet<>();
    		set.add("A");
    		set.add("B");
    		set.add("C");
    		for (String str: set) {
    			System.out.println(str);
    	}
    }
    
    static void sampleSet2() {
    	Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add(null);
		
		Iterator<String> ret = set.iterator();
		while(ret.hasNext()) {
			String str = ret.next();
			System.out.println(str);
		}
    }
    
    
    /* LESSON: 20 (02-09-2021) 
     * 
     * List & Set
     * List can contain duplicate elements
     * Set contains unique elements only
     * 
     * */
    
    static void sampleSet3() {
    	Set<String> set = new HashSet<>();
    	set.add("A");
    	set.add("B");
    	set.add("C");
    	
    	System.out.println(set);  // [A, B, C]
    	
    	set.add("A");
    	set.add("D");
   
    	System.out.println(set);  // [A, B, C, D]
    }
    
    static void sampleIterator() {
    	Set<String> set = new HashSet<>();
    	set.add("A");
    	set.add("B");
    	set.add("C");
    	set.add(null);
    	set.add("A");
    	
    	Iterator<String> ite = set.iterator();
    	while (ite.hasNext()) {
    		String str = ite.next();
    		System.out.print(str + " ");
    	}
    	// null A B C 
    }
    
    static void sampleIterator2() {
    	ArrayList<String> list = new ArrayList<>();
    	list.add("A");
    	list.add("B");
    	list.add("C");
    	list.add("A");
    	
    	Iterator<String> ite = list.iterator();
    	while (ite.hasNext()) {
    		String str = ite.next();
    		System.out.print(str + " ");
    	}
    	// A B C A
    }
    
    static void sampleMap() {
    	class Item {
    		private String name;
    		private int price;
    		public Item(String name, int price) {
    			this.name = name;
    			this.price = price;
    		}
    		public String getName() {
    			return name;
    		}
    		@SuppressWarnings("unused")
			public int getPrice() {
    			return price;
    		}
    	}
    	
    	Map<String, Item> menu = new HashMap<>();
    	menu.put("apple", new Item("apple", 100));
    	menu.put("orange", new Item("orange", 80));
    	menu.put("banana", new Item("banana", 120));
    	
    	Set<String> keys = menu.keySet();
    	for (String key : keys) {
    		Item item = menu.get(key);
    		System.out.println(item.getName());
    	}
		// orange
		// banana
		// apple
    }
    
    @SuppressWarnings("deprecation")
	static void sampleWrapper() {
    	int a  = new Integer(10);
    	a++;
    	System.out.println(a);
    	
    	// 11
    }
    
    @SuppressWarnings("deprecation")
    static void sampleWrapper2() {
		int a = new Integer(10).intValue();
    	a++;
    	System.out.println(a);
    	
    	// 11
    }
    
    static void sampleList() {
    	List<Integer> list = new ArrayList<>();
    	for (int i = 0; i < 10; i++) {
    		list.add(i);
    	}
    	for (Integer val: list) {
    		System.out.println(val.intValue());
    	}
    }
    
    static void sampleMap2() {
    	String alpha[] = {"A", "B", "C", "D", "E"};
    	Map<Integer, String> list = new HashMap<>();
    	for (int i = 0; i < 5; i++) {
    		list.put(i, alpha[i]);
    	}
    	System.out.println(list);
    	// {0=A, 1=B, 2=C, 3=D, 4=E}
    }
    
    static void sampleString() {
    	String a = "Hello, Java!";
    	String b = "Hello, Java!";
    	System.out.println(a == b); // true
    }
    
    static void sampleString2() {
    	String a = new String("Hello, Java!");
    	String b = new String("Hello, Java!");
    	System.out.println(a == b); // false
    }
    
    static void sampleString3() {
    	final String str = "Hello, Java!";
    	String a = str;
    	String b = str;
    	System.out.println(a == b); // true
    }
    
    static void sampleChar() {
    	// .charAt()
    	String str = "Yahallo!";
    	System.out.println(str.charAt(3)); // a
    	
    	// .replace()
    	String str2 = str.replace("a", "A");
    	System.out.println(str2); // YAhAllo!
    	
    	// .substring()
    	String str3 = str.substring(2);
    	System.out.println(str3); // hallo!
    	
    	// .split()
    	String str4[] = str.split("l");
    	System.out.println(str4[0]); // Yaha
    }
}
