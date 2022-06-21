package week2.day1.assignmens;

public class FindTypes {

	public void findEachCharacterType() {
		String strTest = "$$ Welcome to 2nd Class of Automation $$ ";
		char[] strTestCharArray = strTest.toCharArray();
		char checkType;
		int letter = 0, space = 0, num = 0, specialChar = 0;
		for (int i = 0; i < strTest.length(); i++) {
			checkType = strTestCharArray[i];
			// check the letter count
			if ((checkType >= 'a' && checkType <= 'z') || (checkType >= 'A' && checkType <= 'Z')) {
				letter++;
			}
			else if(checkType <= ' ')
			{
				space++;
			}
			else if((checkType >= '0' && checkType <= '9'))
			{
				num++;
			}
			else {
				specialChar++;
			}
			if(checkType.isLetter())
			{
				
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}

	public static void main(String[] args) {
		FindTypes objFindType = new FindTypes();
		objFindType.findEachCharacterType();
	}

}
