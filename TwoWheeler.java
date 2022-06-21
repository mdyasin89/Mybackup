package week1.day2.assignments;

public class TwoWheeler {

	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 34567988766553L;
    boolean isPunctured = false;
	String bikeName = "YAMAHA";
	double runningKM = 15000.489;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler objTwo = new TwoWheeler();
		System.out.println("No of wheels " + objTwo.noOfWheels);
		short noOfMirrorsVariable = objTwo.noOfMirrors;
		System.out.println("No of Mirrors " + noOfMirrorsVariable);
		System.out.println("chassisNumber number is " + objTwo.chassisNumber);
		if (objTwo.isPunctured==false) {
			System.out.println("The bike is not punctured");
		} else {
			System.out.println("The bike is punctured");
		}
		System.out.println("The bike name is " + objTwo.bikeName);

		System.out.println("The bike running KM" + objTwo.runningKM);
	}

}
