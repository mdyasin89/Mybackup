package week1.day2.assignments;

public class Mycar {

	public static void main(String[] args) {
		Mycar  objCar2=new Mycar();
		CarClass objCar = new CarClass();
		
		objCar.applyBreak();
		//objCar.applyGear();  its private only within class
		objCar.swithOnAc();  //its default or package within package
		objCar.applyAcclerate();
	}

}
