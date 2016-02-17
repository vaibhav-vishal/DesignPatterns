package crea.pattern.prototype;

public class Employee implements Cloneable {

	private int EmployeeId;
	private String EmployeeName;

	

	public Employee(int employeeId, String employeeName) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeName=" + EmployeeName + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

}
