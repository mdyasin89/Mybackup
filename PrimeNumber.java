package week1.day1.assignments;


public class PrimeNumber {
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)break condition
	 * 2)negative validation
	 * 3) 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		boolean flag = false;
		for (int i = 2; i <= (a / 2); i++) {

			if (a % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag) {
			System.out.println(a + "  is a Prime Number");
		}

		else {
			System.out.println(a + " is Not a Prime Number");
		}

	}

}
