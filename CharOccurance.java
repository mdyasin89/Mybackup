package week2.day1;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char occur = 'e';
		String str = "welcome to chennai";
		int count = 0;//initialize temporary variable
		char[] strCharArrray = str.toCharArray();
		for (int i = 0; i < strCharArrray.length; i++) {
			if (occur == strCharArrray[i]) {//check with each character in a string with 'e'
				count++;
			}
		}
		System.out.println("Number of occurnace of the letter '" + occur + "' is " + count);

	}

}
