package projects;

public class project1 {

	public static void main(String[] args) {
		
		pattern1();
		
	}
		
	// pattern1
	static void pattern1() {
		
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {		
                System.out.print("*");
            }
            System.out.println();
        }
	}
	
	
	// pattern2
	static void pattern2() {
		
		for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {		
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 2; i >= 0; i--) {
        	for (int j = 0 ; j <= i; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}
	
	
	// pattern 3
	static void pattern3() {
		
	}

}
