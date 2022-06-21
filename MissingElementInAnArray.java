package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {
	public void elementMissing() {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		Arrays.sort(arr); // Its used to sorting the array elements

		for (int i = 1; i <= arr.length; i++) { // Have to start i with 1 due array start with 1,2,...
			if (i != arr[i - 1]) { // [i-1] because i start with 1 , but we need to fetch from first index of array
				System.out.println("Missing Element is " + i);
				break;

			}
		}
	}

	public static void main(String[] args) {

		MissingElementInAnArray objEle = new MissingElementInAnArray();
		objEle.elementMissing();
	}

}
