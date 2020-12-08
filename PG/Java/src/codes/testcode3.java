package codes;

public class testcode3 {

	public static void main(String[] args) {
		
		for (int k = 0; k < 2; k++) {
			
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
	}
}