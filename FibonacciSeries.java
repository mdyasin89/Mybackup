package week1.day1.assignments;

public class FibonacciSeries {
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? if we use sum variable for print, o/p
	 * will be: 0, 1, 2, 3, 5, 8, 13,21 if we use firstNum for print, o/p will be:
	 * 0, 1,1, 2, 3, 5, 8, 13
	 * 
	 */

	public static void main(String[] args) {
		// Fibonacci Series
		int range = 8, firstNum = -1, secNum = 1, sum;
		//System.out.println(firstNum);
		for (int i = 1; i < range; i++) {

			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			/*
			 * if we use sum variable for print, o/p will be: 0, 1, 2, 3, 5, 8, 13,21 if we
			 * use firstNum for print, o/p will be: 0, 1,1, 2, 3, 5, 8, 13
			 */
			System.out.println(sum);

		}

	}

}
