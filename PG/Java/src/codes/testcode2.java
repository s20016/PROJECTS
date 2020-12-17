package codes;

public class testcode2 {
	
	public static void main(String[] args) {
		int val = 10;
		System.out.println(val);
		val = returnableValue();					
		System.out.println(val);					
	}		
	
	public static int returnableValue() {										
		return (int) 100;					
	}	
}

