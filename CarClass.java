package week1.day2.assignments;

public class CarClass {

	public void applyBreak() {
		System.out.println("Break applied");
	}

	private void applyGear() {
		System.out.println("Gear applied");
	}

	void swithOnAc() {
		System.out.println("AC is switched on");
	}

	public void applyAcclerate() {
		System.out.println("Acclerate increased");
	}

	public static void main(String[] args) {
		CarClass objCar = new CarClass();
		objCar.applyBreak();
		objCar.applyGear();
		objCar.swithOnAc();
		objCar.applyAcclerate();

	}

}
