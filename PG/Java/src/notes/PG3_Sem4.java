package notes;

public class PG3_Sem4 {

	public static void main(String[] args) {
		
		PG3_Sem4 x = new PG3_Sem4();
//		System.out.println(x.everyNth("Miracle", 2));
	}

	/*
	* Notes:
	* Use '' for char, "" for String
	*
	* Swapping Variables:
	*	a = a - b;
	*	b = b + a;
	*	a = b - a;
	*
	* true expression returns "true" 
	* Example: LN 145, 210 
	*
	*/
	
    // CodingBat Warmup1 - sleepIn
	// public boolean sleepIn(boolean weekday, boolean vacation) { 
	// 	  return (weekday == false || vacation == true) ? true : false;
	// 	}

    // CodingBat Warmup1 - monkeyTrouble
	// public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
	//   return (aSmile == bSmile) ? true : false;
	// }

    // CodingBat Warmup1 - sumDouble
	// public int sumDouble(int a, int b) {
	//   return (a == b) ? (a + b) * 2 : a + b;
	// }

    // CodingBat Warmup1 - diff21
	// public int diff21(int n) {
	//   return (n >= 21) ? (n - 21) * 2 : 21 - n;
	// }

    // CodingBat Warmup1 - parrotTrouble
	// public boolean parrotTrouble(boolean talking, int hour) {
	//   return (talking == true && (hour < 7 || 20 < hour)) ? true : false;
	// }

    // CodingBat Warmup1 - makes10
	// public boolean makes10(int a, int b) {
	//   return (a + b == 10) || (a == 10) || (b == 10) ? true : false;
	// }

    // CodingBat Warmup1 - nearHundred
	// public boolean nearHundred(int n) {
	//   return (90 <= n && n <= 110) || (190 <= n && n <= 210) ? true : false;
	// }

    // CodingBat Warmup1 - posNeg
	// public boolean posNeg(int a, int b, boolean negative) {
	//   boolean ret = false;
	//   if (negative == false) {
	// 	if (a > 0 && b < 0 || a < 0 && b > 0) {
	// 	  ret = true;
	// 	}
	//   } else {
	// 	if (a < 0 && b < 0) {
	// 	  ret = true;
	// 	}
	//   }
	//   return ret;
	// }

    // CodingBat Warmup1 - notString
	// public String notString(String str) {
	//   if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
	// 	return str;
	//   } else {
	// 	return "not " + str;
	//   }
	// }

    // CodingBat Warmup1 - missingChar
	// public String missingChar(String str, int n) {
	//   return str.substring(0, n) + str.substring(n + 1, str.length());
	// }

    // CodingBat Warmup1 - missingChar
	// public String frontBack(String str) {
	// if ( str.length() <= 1) { return str; }
	// String mid = str.substring(1, str.length() - 1);
	// return str.charAt(str.length() - 1) + mid + str.charAt(0);
	// }

    // CodingBat Warmup1 - front3
	// public String front3(String str) {
	// 	String f3;
	// 	f3 = (str.length() >= 3) ? str.substring(0, 3) : str;
	// 	return f3 + f3 + f3;
	// }

    // CodingBat Warmup1 - backAround
	// public String backAround(String str) {
	// char f = str.charAt(str.length() - 1);
	// return f + str + f;
	// }

    // CodingBat Warmup1 - or35
	// public boolean or35(int n) {
	//   return (n % 3 == 0 ) || (n % 5 == 0) ? true : false;
	// }

    // CodingBat Warmup1 - front22
	// public String front22(String str) {
	//   String f2;
	//   f2 = (str.length() >= 2) ? str.substring(0, 2) : str;
	//   return f2 + str + f2;
	// }

    // CodingBat Warmup1 - startHi
	// public boolean startHi(String str) {
	//   return (str.length() >= 2 && str.substring(0, 2).equals("hi")) ? true : false;
	// }

    // CodingBat Warmup1 - icyHot
	// public boolean icyHot(int temp1, int temp2) {
	// 	return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0) ? true : false;
	// }

    // CodingBat Warmup1 - in1020
	// public boolean in1020(int a, int b) {
	//   return (10 <= a && a <= 20) || (10 <= b && b <= 20) ? true : false;
	// }

    // CodingBat Warmup1 - hasTeen
	// Method 1
	// public boolean hasTeen(int a, int b, int c) {
	//   int count = 0;
	//   if (13 <= a && a <= 19) { count += 1; }
	//   if (13 <= b && b <= 19) { count += 1; }
	//   if (13 <= c && c <= 19) { count += 1; }
	//   return (count >= 1) ? true : false;
	// }
	// Method 2 (returns "true" when one statement is true)
	// public boolean hasTeen(int a, int b, int c) {
	//   return (a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19);
	// }

    // CodingBat Warmup1 - longteen
	// public boolean loneTeen(int a, int b) {
	//   return (13 <= a && a <= 19) && (13 <= b && b <= 19) ? false :
	// 	(13 <= a && a <= 19) || (13 <= b && b <= 19) ? true : false;
	// }

    // CodingBat Warmup1 - delDel
	// public String delDel(String str) {
	//   if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
	// 	return str.substring(0, 1) + str.substring(4);
	//   }
	//   return str;
	// }

    // CodingBat Warmup1 - mixStart
	// public boolean mixStart(String str) {
	//   return (str.length() >= 3 && str.substring(1, 3).equals("ix")) ? true : false;
	// }

    // CodingBat Warmup1 - startOz (Use '' for char, "" for String)
	// public String startOz(String str) {
	// 	String ret = "";
	// 	if (str.length() >= 1 && str.charAt(0) == 'o') {
	// 		ret += str.charAt(0);
	// 	} 
	// 	if (str.length() >= 2 && str.charAt(1) == 'z') {
	// 		ret += str.charAt(1);
	// 	}
	// 	return ret;
	// }

    // CodingBat Warmup1 - intMax 
	// public int intMax(int a, int b, int c) {
	//   return (Math.max(Math.max(a, b), c));
	// }

    // CodingBat Warmup1 - close10 
	// public int close10(int a, int b) {
	// 	return (Math.abs(10 - a) > Math.abs(10 - b)) ? b :
	// 	(Math.abs(10 - a) < Math.abs(10 - b)) ? a : 0;
	// }

    // CodingBat Warmup1 - in3050 
	// public boolean in3050(int a, int b) {
	//   return (30 <= a && a <= 40) && (30 <= b && b <= 40) || 
	// 	(40 <= a && a <= 50) && (40 <= b && b <= 50) ? true : false;
	// }

    // CodingBat Warmup1 - max1020 
	// public int max1020(int a, int b) {  
	//   if (10 <= a && a <= 20 && 10 <= b && b <= 20) { return Math.max(a, b); }
	//   if (10 <= a && a <= 20) return a;
	//   if (10 <= b && b <= 20) return b;
	//   return 0;
	// }

    // CodingBat Warmup1 - stringE 
	// public boolean stringE(String str) {
	//   int count = 0;
	//   for (int i = 0; i < str.length(); i++) {
	// 	if (str.charAt(i) == 'e') count++;
	//   }
	//   return (1 <= count && count <= 3);
	// }

    // CodingBat Warmup1 - lastDigit 
	// public boolean lastDigit(int a, int b) {
	//   return (a % 10 == b % 10) ? true : false;
	// }

    // CodingBat Warmup1 - endUp 
	// public String endUp(String str) {
	//   if (str.length() >= 3) {
	// 	return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
	//   }
	//   return str.toUpperCase();
	// }
}
