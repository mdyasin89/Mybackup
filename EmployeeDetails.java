package week1.day2.assignments;

public class EmployeeDetails {
	public void printEmployeeName(String empName, int empId) {
		System.out.println("Employeee Name " + empName);
		System.out.println("Employeee Id " + empId);
	}

	String getEmployeeAddress(String empAddress) {
		System.out.println("Employee Address " + empAddress);
		return empAddress;
	}

	public void employeeSalary(long empSalary) {
		System.out.println("Employee Salary " + empSalary);

	}

	public void empPhoneNumber() {
		System.out.println("Employee Phone Number is 9876543428");
	}

	public static void main(String[] args) {
		EmployeeDetails objEmp = new EmployeeDetails();

		objEmp.printEmployeeName("Raja", 22);
		objEmp.getEmployeeAddress("Chennai");
		objEmp.employeeSalary(2300009876l);// long variable suffix as l or L
		objEmp.empPhoneNumber();
	}

}
