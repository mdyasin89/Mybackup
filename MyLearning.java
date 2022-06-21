package week1.day1;

import week1.day2.MycarPgrm;

public class MyLearning {

	public static void main(String[] args) {

		MycarPgrm objMyCar = new MycarPgrm();
		objMyCar.printCarName();
		// objMyCar.getCarColor();---Unable to access due to private access modifier
		//objMyCar.isPunctured();--ouside of package
	}

}
