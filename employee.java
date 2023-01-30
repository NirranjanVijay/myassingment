package week2.day1;

	public class employee {
	public void printEmployeeName(String empName, int empId) {
		System.out.println("Employee Name: "+ empName  +"\nEmployee Id:  "+empId);

	}
	public void getEmployeeAddress(String empAddress){
		System.out.println("Employee Address: "+ empAddress );

	}
	public void printEmployeeSalary(double empSalary){
		System.out.println("Employee Salary: "+ empSalary);
	}
	public void printEmployeeMobileNumber(long mobNum){
		System.out.println("Employee Mobile Number: "+ mobNum);
	}
	public static void main(String[] args) {
		employee emp= new employee();
		emp.printEmployeeName("NirranjanVijay",1101);
		emp.getEmployeeAddress("Chennai");
		emp.printEmployeeSalary(50000);
		emp.printEmployeeMobileNumber(954856454);
	}
	}

