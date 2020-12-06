package codes;

public class testcode1 {

	public static void main(String[] args) {
		testcode1 x = new testcode1();
		System.out.println(x.startWord("hippo", "hi"));
		System.out.println(x.startWord("hippo", "xip"));
		System.out.println(x.startWord("hippo", "i"));
        
    //		startWord("hippo", "hi") → "hi"
    //		startWord("hippo", "xip") → "hip"
    //		startWord("hippo", "i") → "h"
    }
	
	public String startWord(String str, String word) {
		if (word.length() >= 2) {
			if (str.substring(1, 2).equals(word.substring(1, 2))) {
				return str.substring(0, word.length());
			}
		} else if (word.length() == 1) {
			if (str.substring(1, 2).equals(word)) {
				return str.substring(0, 1);
			}
		} 
		return "";
	}
}
