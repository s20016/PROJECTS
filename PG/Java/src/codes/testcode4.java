package codes;

import java.io.Console;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class testcode4 {
	public static void main(String[] args) {
		Console con = System.console();
    	System.out.println("Enter something: ");
    	String msg = con.readLine();
    	
    	FileOutputStream fos = null;
    	try {
    		fos = new FileOutputStream("message.ser");
    		@SuppressWarnings("resource")
			ObjectOutputStream out = new ObjectOutputStream(fos);
    		out.writeObject(msg);
    		out.flush();
    	} catch (Exception err) {
    		System.out.println(err.getMessage());
    	} finally {
    		if (fos != null) {
    			try {
    				fos.close();
    			} catch (IOException err) {
    				System.out.println(err.getMessage());
    			}
    		}
    	}
	}
}