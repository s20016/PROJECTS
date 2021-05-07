package codes;

import java.io.FileReader;
import java.io.IOException;

public class testcode5 {
	public static void main(String[] args) {
		FileReader input = null;
		try {
			String dir = System.getProperty("user.dir");
			String file = String.format("%s\\src\\codes\\input.txt", dir);
//			String file = String.format("%s\\input.txt", dir);
			System.out.println(file);
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

// public class testcode5 {
// 	public static void main(String[] args) {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		String s = null;
// 		try {
// 			s = br.readLine();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 		System.out.println(s);
// 	}
// }

// public class testcode5 {
// 	public static void main(String[] args) {
// 		Console con = System.console();
//     	System.out.println("Enter something: ");
//     	String msg = con.readLine();
    	
//     	FileOutputStream fos = null;
//     	try {
//     		fos = new FileOutputStream("message.ser");
//     		@SuppressWarnings("resource")
// 			ObjectOutputStream out = new ObjectOutputStream(fos);
//     		out.writeObject(msg);
//     		out.flush();
//     	} catch (Exception err) {
//     		System.out.println(err.getMessage());
//     	} finally {
//     		if (fos != null) {
//     			try {
//     				fos.close();
//     			} catch (IOException err) {
//     				System.out.println(err.getMessage());
//     			}
//     		}
//     	}
// 	}
// }

