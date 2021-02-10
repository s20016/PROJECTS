package codes;

import java.io.FileReader;
import java.io.IOException;

public class testcode5 {
	public static void main(String[] args) {
		FileReader input = null;
		try {
			String dir = System.getProperty("user.dir");
			String file = String.format("%s\\src\\codes\\output.txt", dir);
			input = new FileReader(file);
			int c = 0;
			while ((c = input.read()) != -1) {
				char ch = (char) c;
				System.out.println(ch);
			}
		} catch (Exception err) {
			System.out.println(err.getMessage());
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException err) {
					System.out.println(err.getMessage());
				}
			}
		}
	}
}
