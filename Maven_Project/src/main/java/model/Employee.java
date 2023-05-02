package model;

import java.util.Date;
import java.util.List;

//@Entity;
public class Employee {

	int employeeId;
	String empName;
	String skill;
	int age;
	double salary;
	Date joiningDate;
	List<Skills> skills;

	public List<Skills> getSkills() {
		return skills;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getSkill() {
		return skill;
	}

	public int getAge() {
		return age;
	}

	public Double getSalary() {
		return salary;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

}
