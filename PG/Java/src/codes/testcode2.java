package codes;

public class testcode2 {
	
	public static void main(String[] args ) {
	
		// Nested for loop (termination increment)
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < j + 1; i++) {		
                System.out.print("*");
            }
            System.out.println();
        }
	
// --------------------------------------------------	
	
        // while loop
		int i = 0;
		while (i < 2) {
			System.out.println("i = " + i);
			i++;
		}
	
		// for loop
		for (int i = 0; i < 2; i++) {
				System.out.println("i = " + i);
		}
	
// --------------------------------------------------

		// do-while loop
        int count = 1;
        
        // do-while loop
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
        
        // while loop
        while (count < 11) {
        	System.out.println("count is: " + count);
        	count++;
        }
    
	/* Note:
	 * The statements within the do block are always executed at least once
	 * Output is the same
	 */
	
// --------------------------------------------------
    
        // break in loop
		for (int i = 1; i < 5; i++) {
			System.out.print(i);
			if ( i == 3 ) {
				break;
			}
		}
	
		// break inside nested loop
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
				if (j == 2) {
					break;
				}
			}
			System.out.println();
		}
		
// --------------------------------------------------
		
		
	}
}
