package week1.day2.assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrDuplicateValues = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int count;
		System.out.println("Length of the Array is " + arrDuplicateValues.length);
		for (int i = 0; i <= arrDuplicateValues.length - 1; i++) {
			count = 0;// initialize every time
			for (int j = i + 1; j <= arrDuplicateValues.length - 1; j++) {
				if (arrDuplicateValues[i] == arrDuplicateValues[j]) {
					// check the current number with all next consecutive numbers
					count = count + 1;// increase the count if it match

				}
			}
			if (count > 0)// if count more than 1 will print the number
			{
				System.out.println("Duplicate Value is " + arrDuplicateValues[i]);
			}
		}
	}
	

}
