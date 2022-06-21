package week1.day2;

public class Calculator {

	public static void main(String args[]) {
		Calculator objCal = new Calculator();
		int addtNumbers = objCal.addtNumbers(3, 5);
		System.out.println(addtNumbers);
		objCal.subTwoNumber(5, 3);
		double multipleThreeNumbers = objCal.multipleThreeNumbers(2, 3, 4);
		System.out.println(multipleThreeNumbers);
		int divideTwoNumbers = objCal.divideTwoNumbers(10, 5);
		System.out.println(divideTwoNumbers);

		MycarPgrm objMyCar = new MycarPgrm();
		objMyCar.printCarName();
		// objMyCar.getCarColor();---Unable to access due to private access modifier
		boolean punctured = objMyCar.isPunctured(); // can access due to default or package access modifier
		System.out.println(punctured);
	}

	public int addtNumbers(int a, int b) {
		return a + b;
	}

	public float subTwoNumber(float a, float b) {
		float c = a - b;
		System.out.println(c);
		return c;
	}

	double multipleThreeNumbers(double a, double b, double c) {
		return a * b * c;
	}

	public int divideTwoNumbers(int a, int b) {
		return a / b;
	}
}
