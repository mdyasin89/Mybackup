package week1.day2.assignments;

import java.util.Arrays;

public class FindIntersection {

	public void findIntersect(int[] arrayFirst, int[] arraySecond) {
		Arrays.sort(arrayFirst);
		Arrays.sort(arraySecond);
		for (int i = 0; i < arrayFirst.length; i++) {
			for (int j = 0; j < arraySecond.length; j++) {
				if (arrayFirst[i] == arraySecond[j]) {
					System.out.println("Matched Element " + arrayFirst[i]);
				}
			}
		}
	}

	
	public static void main(String[] args) {
		FindIntersection objInter = new FindIntersection();
		int[] arrayFirst = { 3, 2, 11, 4, 6, 7 };
		int[] arraySecond = { 1, 2, 8, 4, 9, 7 };
		objInter.findIntersect(arrayFirst,arraySecond);

	}

}
