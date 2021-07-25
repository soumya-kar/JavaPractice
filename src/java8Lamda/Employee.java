package java8Lamda;

public class Employee {
	
	int empId;
	String fName;
	String lName;
	String designation;
	public Employee(int empId, String fName, String lName, String designation) {
		super();
		this.empId = empId;
		this.fName = fName;
		this.lName = lName;
		this.designation = designation;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fName=" + fName + ", lName=" + lName + ", designation=" + designation
				+ "]";
	}
	
	
	
	

}
