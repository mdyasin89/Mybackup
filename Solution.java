package week1.assessment;

import java.util.Arrays;

public class Solution {

	public static String reverseString(String input) {
		String strReverse = "";
		if (input != null) {

			String srtText = input;
			char chartoSplit;
			for (int i = srtText.length() - 1; i >= 0; i--) {
				chartoSplit = srtText.charAt(i);

				strReverse = strReverse + chartoSplit;

			}

			return strReverse;
		} else {
			strReverse = "Invalid Input";
			return strReverse;
		}
	}

	public static boolean isPrime(int num) {
		boolean isCheck = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isCheck = true;
				break;

			}
		}
		return isCheck;

	}

	public static int getFactorial(int num) {
		int intFactorial = 1;
		for (int i = 1; i <= num; i++) {
			intFactorial = intFactorial * i;
		}
		return intFactorial;
	}

	public static boolean isArmStrong(long num) {
		boolean isCheck = false;
		long number = num, sum = 0, varStoreValue;
		varStoreValue = number;
		for (; number > 0; number = number / 10) {// initialization is not required because iterating based on the
													// Quotient

			int remainder = (int) (number % 10);
			sum = sum + (remainder * remainder * remainder);// neeed to add the cube value of each remainder value
		}
		if (sum == varStoreValue) {
			isCheck = true;
		}
		return isCheck;
	}

	public static boolean isAnagram(String inputFirst, String inputSecond) {
		boolean isCheckStatus = false;
		if (inputFirst.length() == inputSecond.length()) {
			char[] arrayFirst = inputFirst.toLowerCase().toCharArray();
			char[] arraySecond = inputSecond.toLowerCase().toCharArray();
			Arrays.sort(arrayFirst);
			Arrays.sort(arraySecond);
			isCheckStatus = Arrays.equals(arrayFirst, arraySecond);
			if (isCheckStatus) {
				System.out.println("The given " + inputFirst + "," + inputSecond + " strings are Anagram");
			} else {
				System.out.println("The given " + inputFirst + "," + inputSecond + " strings are not Anagram");
			}
		} else {
			System.out.println("The given " + inputFirst + "," + inputSecond + " strings are not Anagram");
		}
		return isCheckStatus;

	}

	public static void main(String[] args) {
		Solution objSol = new Solution();
		objSol.isAnagram("amma", "mama");
		/*
		 * String strOutput = objSol.reverseString("testleaf"); //
		 * System.out.println(strOutput); int number = 13; boolean isStatus =
		 * objSol.isPrime(number); if (isStatus) { System.out.println(number +
		 * " is not Prime Number"); } else { System.out.println(number +
		 * " is a Prime Number"); }
		 * 
		 * int number = 5; int intFactorialOutput = objSol.getFactorial(number);
		 * System.out.println("Factorial for the given number is " +
		 * intFactorialOutput);
		 * 
		 * int checkNumber = 153; boolean isArmStrongCheck =
		 * objSol.isArmStrong(checkNumber); if (isArmStrongCheck) {
		 * System.out.println(checkNumber + " its a Armstrong Number"); } else {
		 * System.out.println(checkNumber + " its not a Armstrong Number"); }
		 */

	}

}
