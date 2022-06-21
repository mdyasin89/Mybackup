package week1.day2;

public class MycarPgrm {
	public static void main(String args[]) {
		MycarPgrm objMyCar = new MycarPgrm();
		objMyCar.printCarName();
		String carColor = objMyCar.getCarColor();
		System.out.println(carColor);
		boolean punctured = objMyCar.isPunctured();
		System.out.println(punctured);
	}

	public void printCarName() {
		System.out.println("Swift Dzire");

	}

	private String getCarColor() {
		String color = "Red";
		return color;
	}

	boolean isPunctured() {
		boolean punctured = false;
		return punctured;
	}
}
