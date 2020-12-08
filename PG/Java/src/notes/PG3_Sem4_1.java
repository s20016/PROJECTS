package notes;

public class PG3_Sem4_1 {

	public static void main(String[] args) {
	
		whileLoop();
		doWhileLoop();
	}

	/*
	 * Lesson 4 (12-08-2020)
	 * 		forLoop();
	 *      nestedForLoop();
	 * 		whileLoop();
	 * 		doWhileLoop();
	 * 		breakInLoop();
	 * 		breakInNestedLoop();
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
	
	
}
