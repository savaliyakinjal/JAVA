package Task_1;

import java.sql.Date;

public class Employee {

	int empId;
	String empName;
	String empSkill;
	int empAge;
	double empSalary;
	String joiningDate;

	public Employee(String empName, String empSkill, int empAge, double empSalary, String joiningDate) {
		super();
		this.empName = empName;
		this.empSkill = empSkill;
		this.empAge = empAge;
		this.empSalary = empSalary;
		this.joiningDate = joiningDate;
	}

	public Employee(int empId, String empName, String empSkill, int empAge, double empSalary, String joiningDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSkill = empSkill;
		this.empAge = empAge;
		this.empSalary = empSalary;
		this.joiningDate = joiningDate;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpSkill() {
		return empSkill;
	}

	public int getEmpAge() {
		return empAge;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSkill=" + empSkill + ", empAge=" + empAge
				+ ", empSalary=" + empSalary + ", joiningDate=" + joiningDate + "]";
	}

}
