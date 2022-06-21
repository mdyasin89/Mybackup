package week2.day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "feeling good";
		String strReverse = ""; //initialize temporary variable
		System.out.println(test.length());
		for (int i = test.length() - 1; i >= 0; i--) { //Reversing the index of each character in a string
			test.charAt(i);
			strReverse = strReverse + test.charAt(i);//appending from last to first
		}
		System.out.println(strReverse);
	}

}
